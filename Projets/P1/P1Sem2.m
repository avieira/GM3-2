n=input('Saisir la valeur du parametre n ');
p=input('Saisir la valeur du parametre p ');
mu=n/p;
sigma2=n*(1-p)/(p^2);
for k=1:400
    nbSucces=0;
    position=0;
    while(nbSucces<n)
        r=rand(1);
        if(r<p)
            nbSucces=nbSucces+1;
        end
        position=position+1;
    end
    A(k)=position;
end
[N,X]=hist(A,20);
bar(X,N./(400*(X(2)-X(1))))
hold on
interval=min(A):.1:max(A);
y=exp(-((interval-mu).^2)./(2*sigma2))./(sqrt(sigma2*2*pi));
plot(interval,y,'r')
