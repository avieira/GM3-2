set terminal postscript eps enhanced color
set output "1.eps"
set title "Representation graphique de la solution numerique"
plot "r2" u 2:3 w l title "(x(t),y(t)) AB-2 0.0000001"
