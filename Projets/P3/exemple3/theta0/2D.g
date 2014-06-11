set terminal postscript eps enhanced color
set output "image.eps"
set title "Representation graphique de la solution numerique"
plot "res0.1" u 2:3 w l title "(x(t),y(t)) obtenu avec la methode d'Adams-Bashforth a deux pas, 0.1", "res0.01" u 2:3 w l title "(x(t),y(t)) obtenu avec la methode d'Adams-Bashforth a deux pas, 0.01", "res0.001" u 2:3 w l title "(x(t),y(t)) obtenu avec la methode d'Adams-Bashforth a deux pas, 0.001"
