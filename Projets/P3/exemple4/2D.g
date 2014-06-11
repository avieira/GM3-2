set terminal postscript eps enhanced color
set output "1bis.eps"
set title "Representation graphique de la solution numerique"
plot "r0.001" u 2:3 w l title "(x(t),y(t)) AB-2 0.001"
