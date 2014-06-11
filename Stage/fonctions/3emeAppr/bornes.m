function [infC, supC, infGam, supGam]=bornes(iGam,iC,Gam,tabC)

nC=length(tabC);
nGam=length(Gam);
if nC>1 && nGam>1
    if iC==1
        infC=tabC(1);
        supC=tabC(2);
    elseif iC==8
        infC=tabC(7);
        supC=tabC(8);
    else
        infC=tabC(iC-1);
        supC=tabC(iC+1);
    end
    
    if iGam<=2
        infGam=Gam(1);
        supGam=Gam(3);
    elseif iGam>=7
        infGam=Gam(6);
        supGam=Gam(8);
    else
        infGam=Gam(iGam-2);
        supGam=Gam(iGam+2);
    end
    
end

if nC>1 && nGam==1
    if iC==1
        infC=tabC(1);
        supC=tabC(2);
    elseif iC==8
        infC=tabC(7);
        supC=tabC(8);
    else
        infC=tabC(iC-1);
        supC=tabC(iC+1);
    end
    
    infGam=Gam;
    supGam=Gam;
end

if nC==1 && nGam>1
    if iGam<=2
        infGam=Gam(1);
        supGam=Gam(3);
    elseif iGam>=8
        infGam=Gam(6);
        supGam=Gam(8);
    else
        infGam=Gam(iGam-2);
        supGam=Gam(iGam+2);
    end
    
    infC=tabC;
    supC=tabC;
end

if nC==1 && nGam==1
    infGam=Gam;
    supGam=Gam;
    
    infC=tabC;
    supC=tabC;
end