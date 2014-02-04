#!/bin/bash

echo $#

#j=1
#for i in $*
#do
#	echo $i $j
#	j=$(($j+1))
#done

echo $1 > jourssemaine.txt
shift
for i in $*
do
	echo $i >> jourssemaine.txt
done

sort jourssemaine.txt

exit $#
