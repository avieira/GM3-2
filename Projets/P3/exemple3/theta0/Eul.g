set terminal postscript eps enhanced color
set output "imageEul.eps"
set title "Representation graphique de la solution numerique"
splot "rEul0.1" u 1:2:3 w l title "(t,x(t),y(t)) Euler 0.1","rEul0.01" u 1:2:3 w l title "(t,x(t),y(t)) Euler 0.01","rEul0.001" u 1:2:3 w l title "(t,x(t),y(t)) Euler 0.001"
