set terminal postscript eps enhanced color
set output "image.eps"
set title "Representation graphique de la solution numerique"
splot "res" u 2:3:4 w l title "(x(t),y(t),z(t)) 0.01"
