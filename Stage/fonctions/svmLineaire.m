function [zP,zD,X,lambda] = svmLineaire(x0,x1,x2)

		#Definition primal
		# Recuperation donnees
	n=length(x1);
	p=size(x1)(2);

		# Construction a partir des donnees
	X=[x1;x2];
	Y=[ones(n,1);-ones(n,1)];

		# Construction outils
	A=[eye(p),zeros(p,1);zeros(1,p+1)];
	d=zeros(p+1,1);
	e=-ones(2*n,1);
	B=-[diag(Y)*X,Y];

		#Calcul
	zP=qp(x0,A,-d,[],[],[],[],[],B,e);
	

		#Reprise avec le dual
	G=diag(Y)*X*X'*diag(Y);
	lb=zeros(2*n,1);
	xInit=zeros(2*n,1);
	
	[alpha,obj,info,lambda]=qp(xInit,G,e,Y',0,lb,[]);

	zD=[X'*(alpha.*Y); -lambda(1)];
endfunction 
