#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>

int main(){
	switch(fork()) {
		case -1 :
			printf("Erreur de création\n");
			exit(1);
		case 0 :
			execl("/bin/ls","ls","-l",NULL);
			break;
	}
	wait(0);
}
