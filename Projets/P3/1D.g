set terminal postscript eps enhanced color
set output "image.eps"
set title "Representation graphique de la solution numerique"
plot "res" u 1:2 w l title "y(t)"
