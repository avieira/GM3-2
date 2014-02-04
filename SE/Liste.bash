#!/bin/bash

if [ $# -eq 0 ]
then
	echo "Veuillez entrer un dossier comme premier paramètre et un temps d'attente comme deuxième paramètre"
else
	dossierCourant=`pwd`
	ls $1 | grep ".jpg" > FichierCon
	tab=( `cat FichierCon` )
	cd $1
	for i in ${tab[*]}
	do
		tab1=( ${tab1[*]} `identify -format "%wx%h" $i` )
	done

	j=0
	for i in ${tab1[*]}
	do
		if [ ${i%x*} -gt ${i##*x} ]
		then
			var="-i ${tab[$j]} -r 1"
			tabAffich=( ${tabAffich[*]} $var )
		fi
		j=$(($j+1))
	done
	avconv ${tabAffich[*]} diapo.avi
	#vlc -vvv diapo.avi -f
fi
