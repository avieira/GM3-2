set terminal postscript eps enhanced color
set output "image3.eps"
set title "Representation graphique de la solution numerique"
splot "res" u 2:3:4 w l title "(x(t),y(t),z(t)) 0.01", "res2" u 2:3:4 w l title "(x(t),y(t),z(t)) 0.0001", "res3" u 2:3:4 w l title "(x(t),y(t),z(t)) 0.1"
