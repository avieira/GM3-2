function [zP,zD,X] = svmNonSepL2(x1,x2,C)

		#Definition primal
		# Recuperation donnees
	n=length(x1);
	p=size(x1)(2);

		# Construction a partir des donnees
	X=[x1;x2];
	Y=[ones(n,1);-ones(n,1)];

		#Primal
	xInit=zeros(2*n+p+1,1);
	H=[eye(p,p),zeros(p,2*n+1);zeros(1,2*n+p+1);zeros(2*n,p+1),C*eye(2*n)];
	q=[zeros(p+1,1);zeros(2*n,1)];
	Al=ones(2*n,1);
	Ai=[diag(Y)*X,Y,eye(2*n)];
	lb=[-inf*ones(p+1,1);zeros(2*n,1)];

	zP=qp(xInit,H,q,[],[],lb,[],Al,Ai,[])(1:p+1);

		#Dual
	G=diag(Y)*X*X'*diag(Y);
	M=G+(1/C)*eye(size(G));
	e=-ones(2*n,1);
	lb=zeros(2*n,1);
	
	xInit=zeros(2*n,1);
	
	[alpha,obj,info,lambda]=qp(xInit,M,e,Y',0,lb,[]);

	zD=X'*(alpha.*Y);
	zD=[zD;-lambda(1)];
endfunction 
