#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>

int main(){
	char *tab[3];
	switch(fork()) {
		case -1 :
			printf("Erreur de création\n");
			exit(1);
		case 0 :
			tab[0]="ls";
			tab[1]="-l";
			tab[2]=NULL;
			execv("/bin/ls", tab);
			break;
	}
	wait(0);
}
