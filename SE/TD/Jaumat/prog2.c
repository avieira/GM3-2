#include <stdio.h>
#include<stdlib.h>
#include<unistd.h>

void main(){
	printf("Avant le premier fork : le père : %d, le fils : %d \n", getpid(), getppid());
	fork();
	printf("Après le premier fork : le père : %d, le fils : %d \n", getpid(), getppid());
}
