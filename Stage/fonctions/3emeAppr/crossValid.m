function [Cstar,gamStar,err]=crossValid(X1,y1,eps, kernel)

infGam=0.001;
supGam=2.5;
infC=1;
supC=100;

ecartGam=abs(supGam-infGam);
ecartC=abs(supC-infC);

for boucle=1:5
    if ecartGam<eps
        Gamma=(infGam+supGam)/2;
    else
        Gamma=linspace(infGam,supGam,8);
    end
    
    if ecartC<eps
        tabC=(infC+supC)/2;
    else
        tabC=linspace(infC,supC,8);
    end
    
    mRes=cross16(X1,y1,Gamma,tabC,kernel)
        
    [colMax, iC]=max(mRes);
    [valMax, iGam]=max(colMax);
    iC=iC(iGam);
    
    [infC, supC, infGam, supGam]=bornes(iGam,iC,Gamma,tabC);
    
    ecartGam=abs(supGam-infGam);
    ecartC=abs(supC-infC);
    save ../matfiles/matfile.mat
end

Cstar=(infC+supC)/2;
gamStar=(infGam+supGam)/2;
err=valMax;
