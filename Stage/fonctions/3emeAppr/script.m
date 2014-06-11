%%Initialisation
addpath(genpath('~/Documents/Choses/'));

kernel='gaussian';
X1=load('../csv/leonardo.csv');

[n p]=size(X1);

%%
%%Set d'apprentissage et de test
XM=X1(X1(:,p)==1,:);
XF=X1(X1(:,p)==-1,:);

nbM=length(XM);
nbF=length(XF);

	
ytest=[XM(1:nbM/2,p);XF(1:nbF/2,p)];
XTest=[XM(1:nbM/2,1:p-1);XF(1:nbF/2,1:p-1)];

yApp=[XM(nbM/2+1:nbM,p);XF(nbF/2+1:nbF,p)];
XApp=[XM(nbM/2+1:nbM,1:p-1);XF(nbF/2+1:nbF,1:p-1)];


%%Cross-Validation
[C, Gam, err]=crossValid(XApp,yApp,10^-4,kernel)

save ../results/result.mat

%%
%%Test des paramètres trouvés sur le set de test défini au début
kerneloption=1/sqrt(Gam);

[xsup,w,b]=svmclass(XApp,yApp,C,0,kernel,kerneloption);
            
[y]=svmval(XTest,xsup,w,b,kernel,kerneloption);

egal = sign(y.*ytest)<0;
txBonRep=1-sum(egal)/length(XTest)
