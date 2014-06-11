#!/bin/bash


echo "Choisir un exemple."
select choix in `ls | grep "exemple*"`
do
	break
done
cd ${choix}

echo " "
ls|grep "description*" > bidule
dsc=`cat bidule`
rm bidule

dsc=${dsc##*n}
if [ "$dsc" = "1D" ]
then
	cat description1D
elif [ "$dsc" = "2D" ]
then
	cat description2D
else
	cat description3D
fi

echo " "
echo "Que souhaitez-vous faire ?"
echo "1) Modifier le fichier de données"
echo "2) Modifier le code source"
echo "3) Lancer le programme"
echo "Autre : quitter le script"
read choix

if [ $choix -eq 1 ]
then
	vim dAdams
	echo " "
elif [ $choix -eq 2 ]
then
	vim adamsBashforth2.c
	echo " "
elif [ $choix -eq 3 ]
then
	gcc adamsBashforth2.c -o adamsBashforth2 -lm
	./adamsBashforth2 < dAdams > res
	
	if [ "$dsc" = "1D" ]
	then
		gnuplot ../1D.g
	elif [ "$dsc" = "2D" ]
	then
		gnuplot ../2D.g
	else
		gnuplot ../3D.g
	fi
	evince image.eps
fi
