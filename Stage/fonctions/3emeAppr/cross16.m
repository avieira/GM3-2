function mRes=cross16(XApp, yApp, Gamma, tabC, kernel)

[n p]=size(XApp);
nbPers=n/20; %20 vecteur par personne

mRes=zeros(length(tabC),length(Gamma));

%%Test pour chaque couple de paramètres
for k=1:length(tabC)
    C=tabC(k);
    for j=1:length(Gamma)
        kerneloption=1/sqrt(Gamma(j));

        somme=0;
        %%
        parfor i=1:nbPers
            %%Leave-one-out par personne
            X1RR=[XApp(1:20*(i-1),:);XApp(20*i+1:n,:)];
            y1RR=[yApp(1:20*(i-1));yApp(20*i+1:n)];

            ytest=yApp(20*(i-1)+1:20*i);
            XTest=XApp(20*(i-1)+1:20*i,:);
            %%
            %%Centrer et réduire

            [nRR pRR]=size(X1RR);
            [nt pt]=size(XTest);

            moy=mean(X1RR);
            ecty=std(X1RR);
            X1RR=(X1RR-ones(nRR,1)*moy)./(ones(nRR,1)*ecty);
            XTest=(XTest-ones(nt,1)*moy)./(ones(nt,1)*ecty);
            %%

            %%Calcul de la décision et de la prévision
            % USAGE [xsup,w,b,pos,timeps,alpha,obj]=svmclass(x,y,c,lambda,kernel,kerneloption,verbose,span, alphainit)

            [xsup,w,b]=svmclass(X1RR,y1RR,C,0,kernel,kerneloption);

            [y]=svmval(XTest,xsup,w,b,kernel,kerneloption);

	    egal = sign(y.*ytest)>0;
	    somme=somme+sum(egal);
        end

        mRes(k,j)=somme/n
    end
end
