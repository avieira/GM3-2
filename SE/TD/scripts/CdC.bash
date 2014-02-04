#!/bin/bash

read chaine1
read chaine2

if [ "$chaine1" = "$chaine2" ]
then
	read chaine3
	if [ "$chaine1" = "$chaine3" ]
	then
		echo "Les 3 chaînes sont identiques"
	else
		echo "2 chaînes sont identiques"
	fi
else
	read chaine3
	if [ "$chaine1" = "$chaine3" ]
	then
		echo "2 chaînes sont identiques"
	elif [ "$chaine2" = "$chaine3" ]
	then
		echo "2 chaînes sont identiques"
	else
		echo "Les 3 chaînes sont différentes"
	fi
fi

