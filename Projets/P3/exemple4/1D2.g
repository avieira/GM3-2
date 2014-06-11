set terminal postscript eps enhanced color
set output "3.eps"
set title "Representation graphique de la solution numerique sur les ordonnees"
plot "r2" u 1:3 w l title "y(t) AB-2 0.0000001"

