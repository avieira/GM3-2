clear;
rand('state',0)

X1=load('H-F-Equilibre/V/leonardo.csv');

[n p]=size(X1);

for j=0:9
    ytest=[];
    XTest=[];
    y1RR=[];
    X1RR=[];
    for i=0:(n/10-1)
        alea=randperm(10)+10*i;
        ytest=[ytest; X1(alea(1:5),p)];
        XTest=[XTest; X1(alea(1:5),1:p-1)];

        y1RR=[y1RR; X1(alea(6:10),p)];
        X1RR=[X1RR; X1(alea(6:10),1:p-1)];
    end

    [nRR pRR]=size(X1RR);
    [nt pt]=size(XTest);

    moy=mean(X1RR);
    ecty=std(X1RR);
    X1RR=(X1RR-ones(nRR,1)*moy)./(ones(nRR,1)*ecty);
    XTest=(XTest-ones(nt,1)*moy)./(ones(nt,1)*ecty);

    %%
    C=128;
    kerneloption=1/sqrt(0.125);
    % USAGE [xsup,w,b,pos,timeps,alpha,obj]=svmclass(x,y,c,lambda,kernel,kerneloption,verbose,span, alphainit)

    [xsup,w,b,pos,timeps,alpha]=svmclass(X1RR,y1RR,C,0,'gaussian',kerneloption,0);
    [y]=svmval(XTest,xsup,w,b,'gaussian',kerneloption);
    %%
    egal = sign(y.*ytest)<0;
    resEqLeo(j+1)=1-sum(egal)/length(XTest);

end
mResEqLeo=mean(resEqLeo)

clearvars -except *esEq*

X1=load('H-F-Deseq/V/leonardo.csv');

[n p]=size(X1);

for j=0:9
    ytest=[];
    XTest=[];
    y1RR=[];
    X1RR=[];
    for i=0:(n/10-1)
        alea=randperm(10)+10*i;
        ytest=[ytest; X1(alea(1:5),p)];
        XTest=[XTest; X1(alea(1:5),1:p-1)];

        y1RR=[y1RR; X1(alea(6:10),p)];
        X1RR=[X1RR; X1(alea(6:10),1:p-1)];
    end

    [nRR pRR]=size(X1RR);
    [nt pt]=size(XTest);

    moy=mean(X1RR);
    ecty=std(X1RR);
    X1RR=(X1RR-ones(nRR,1)*moy)./(ones(nRR,1)*ecty);
    XTest=(XTest-ones(nt,1)*moy)./(ones(nt,1)*ecty);

    %%
    C=128;
    kerneloption=1/sqrt(0.125);
    % USAGE [xsup,w,b,pos,timeps,alpha,obj]=svmclass(x,y,c,lambda,kernel,kerneloption,verbose,span, alphainit)

    [xsup,w,b,pos,timeps,alpha]=svmclass(X1RR,y1RR,C,0,'gaussian',kerneloption,0);
    [y]=svmval(XTest,xsup,w,b,'gaussian',kerneloption);

    egal = sign(y.*ytest)<0;
    resDesLeo(j+1)=1-sum(egal)/length(XTest);

end
mResDesLeo=mean(resDesLeo)

clearvars -except *esEq* *esDes*
