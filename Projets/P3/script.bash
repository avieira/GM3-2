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
