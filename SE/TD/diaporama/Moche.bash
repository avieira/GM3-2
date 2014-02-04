#!/bin/bash

if [ $# -eq 0 ]
then
	echo "Veuillez entrer un dossier comme premier paramètre et un temps d'attente comme deuxième paramètre"
else
	dossierCourant=`pwd`
	ls $1 | grep ".jpg" > FichierCon
	tab=( `cat FichierCon` )
	rm FichierCon

	cd $1
	for i in ${tab[*]}
	do
		tab1=( ${tab1[*]} `identify -format "%wx%h" $i` )
	done

	j=0
	mkdir selection
	for i in ${tab1[*]}
	do
		if [ ${i%x*} -gt ${i##*x} ]
		then
			j=$((j+1))
			cp ${tab[$j]} selection/img-$j.jpg
		fi
	done

	cd selection
	avconv -r 0.33 -i img-%d.jpg diapo.mp4

	mv diapo.mp4 $dossierCourant
	cd ..
	rm -r selection

	cd $dossierCourant
	totem --fullscreen diapo.mp4
fi
