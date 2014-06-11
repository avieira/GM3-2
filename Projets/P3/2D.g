set terminal postscript eps enhanced color
set output "image.eps"
set title "Representation graphique de la solution numerique"
plot "res" u 2:3 w l title "(x(t),y(t))"
