#!/bin/bash

read chaine1
read chaine2
read chaine3

if [ "$chaine1" = "$chaine2" ] && [ "$chaine1" = "$chaine3" ]
then
		echo "Les 3 chaînes sont identiques"
elif [ "$chaine1" = "$chaine2" ] || [ "$chaine1" = "$chaine3" ] || [ "$chaine2" = "$chaine3" ]
then
		echo "2 chaînes sont identiques"
else
		echo "Les 3 chaînes sont différentes"
fi

