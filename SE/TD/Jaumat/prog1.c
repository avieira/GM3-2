#include <stdio.h>
#include<stdlib.h>
#include<unistd.h>

void main(){
	printf("Avant le premier fork\n");
	fork();
	printf("Après le premier fork\n");
}
