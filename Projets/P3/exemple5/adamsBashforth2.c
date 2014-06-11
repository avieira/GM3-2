#include<stdio.h>
#include<math.h>
#include<stdlib.h>

//La fonction qui gère la loi d'évolution
void f(double *V,double * F)
{
 F[0]=1;
 F[1]=-3*(V[1]-V[2]);
 F[2]=-V[1]*V[3]+21*V[1]-V[2];
 F[3]=V[1]*V[2]-V[3];
}

//Méthode d'Euler pour initialiser
void euler(int n,double h,double *V0,double *V1,double *F)
{
 int i;

 for(i=0;i<n;i++)
  V1[i]=V0[i]+h*F[i];
}

//Méthode d'Adams-Bashforth
void adamsBashforth(int n,double h,double *V1,double *V,double *F0,double *F1)
{
 int i;

 for(i=0;i<n;i++)
  V[i]=V1[i]+h/2.*(3*F1[i]-F0[i]);
}

void main()
{
 int n;
 double h;
 double *V0;
 double *V1;
 double *V;
 double *F0;
 double *F1;
 double xmax;
 int nmax;
 int i,j;

//Récupération des informations générales sur la méthode
 scanf("%d %lf %lf",&n,&xmax,&h);

//Création des tableaux dynamiques
 V0=(double *) malloc(n*sizeof(double));
 V1=(double *) malloc(n*sizeof(double));
 V=(double *) malloc(n*sizeof(double));
 F0=(double *) malloc(n*sizeof(double));
 F1=(double *) malloc(n*sizeof(double));

//Lecture et écriture des conditions initiales
 for(i=0;i<n;i++)
 {
  scanf("%lf",&V0[i]);
  printf("%lf ",V0[i]);
 }
 printf("\n");

//Calcul du nombre d'itérations
 nmax=trunc((xmax-V0[0])/h);

//Initialisation avec la méthode d'Euler explicite
 f(V0,F0);
 euler(n,h,V0,V1,F0);
 for(i=0;i<n;i++)
  printf("%lf ",V1[i]); 
 printf("\n");

//Méthode d'Adams-Bashforth
 f(V1,F1);
 for(i=2;i<(nmax+1);i++)
 {
  adamsBashforth(n,h,V1,V,F0,F1);
  for(j=0;j<n;j++)
  {
   printf("%lf ",V[j]);
   V0[j]=V1[j];
   V1[j]=V[j];
   f(V0,F0);
   f(V1,F1);
  }
  printf("\n");
 }
}
