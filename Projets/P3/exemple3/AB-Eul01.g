set terminal postscript eps enhanced color
set output "imageAB-Eul0.01.eps"
set title "Representation graphique de la solution numerique"
splot "rEul0.01" u 1:2:3 w l title "(t,x(t),y(t)) Euler 0.01", "res0.01" u 1:2:3 w l title "(t,x(t),y(t)) A-B2 0.01"
