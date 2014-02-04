#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<string.h>

int menu()
{
	int choix;

	do
	{
		printf("\n\n");
		printf("0) Sortir\n");
		printf("1) ls\n");
		printf("2) kill -9 programme\n");
		printf("3) ps -ef | grep nomUtilisateur\n");
		printf("\n >");

		scanf("%d",&choix);
	}while((choix>3)&&(choix<0));

	return choix;
}

void com_ls()
{
	int res_fork;

	printf("\nExecution de la commande ls\n");
	res_fork=fork();

	switch(res_fork)
	{
		case -1 : printf("Le fork a échoué\n");break;
		case 0  : execl("/bin/ls","ls",(char *) NULL);break;
	}
	wait(0);
}


void com_kill()
{
	int res_fork;
	char *tab[4];
	char chaine[100];

	printf("\nExecution de la commande kill -9 programme\n");
	res_fork=fork();

	switch(res_fork)
	{
		case -1 : printf("Le fork a échoué\n");break;
		case 0  : 
			  tab[0]="pkill";
			  tab[1]="-9";
			  tab[3]=NULL;
			  printf("\nDonnez le programme à tuer\n");
			  scanf("%s",chaine);
			  tab[2]=chaine;
			  execv("/usr/bin/pkill", tab);
			  break;
	}
	wait(0);
}


void com_ps()
{
	int res_fork;

	printf("\nExecution de la commande ps -ef | grep nomUtilisateur\n");
	res_fork=fork();

	switch(res_fork)
	{
		case -1 : printf("Le fork a échoué\n");break;
		case 0  : system("ps -ef | grep $USER");break;
	}
	wait(0);


}

void main()
{
	int nb_com;

	//do
	//{
		nb_com=menu();

		switch(nb_com)
		{
			case 1 : com_ls();break;
			case 2 : com_kill();break;
			case 3 : com_ps();break;
		}
	//}while(nb_com<0 || nb_com > 4);
}
