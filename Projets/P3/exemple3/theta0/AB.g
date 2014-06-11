set terminal postscript eps enhanced color
set output "imageAB.eps"
set title "Representation graphique de la solution numerique"
splot "res0.1" u 1:2:3 w l title "(t,x(t),y(t)) A-B2 0.1","res0.01" u 1:2:3 w l title "(t,x(t),y(t)) A-B2 0.01","res0.001" u 1:2:3 w l title "(t,x(t),y(t)) A-B2 0.001"
