#!/bin/bash

if [ $# -eq 0 ]
then
	echo "Veuillez entrer un dossier comme paramètre"
else
	dossierCourant=`pwd`
	ls $1 | grep ".jpg" > FichierCon
	cd $1
	identify `cat ${dossierCourant}/FichierCon`
	eog `cat ${dossierCourant}/FichierCon`
fi


