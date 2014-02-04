n=input('Saisir la valeur du parametre n ');
p=input('Saisir la valeur du parametre p ');
nbSucces=0;
position=0;
s=rng
while(nbSucces<n)
    r=rand(1);
    if(r<p)
        nbSucces=nbSucces+1;
    end
    position=position+1;
end
rng(s)
pos=0;
for i=1:n
    realGeo=1;
    r=rand(1);
    while(r>p)
        realGeo=realGeo+1;
        r=rand(1);
    end
    pos=pos+realGeo;
end
