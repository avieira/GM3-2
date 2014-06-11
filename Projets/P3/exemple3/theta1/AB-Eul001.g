set terminal postscript eps enhanced color
set output "imageAB-Eul0-001.eps"
set title "Representation graphique de la solution numerique"
splot "rEul0.001" u 1:2:3 w l title "(t,x(t),y(t)) Euler 0.001", "res0.001" u 1:2:3 w l title "(t,x(t),y(t)) A-B2 0.001"
