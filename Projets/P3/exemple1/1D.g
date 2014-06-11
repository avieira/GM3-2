set terminal postscript eps enhanced color
set output "image.eps"
set title "Representation graphique des solutions numeriques"
plot "resEul" u 1:2 w l title "y(t) obtenu avec la methode d'Euler 0.1","resEul01" u 1:2 w l title "y(t) obtenu avec la methode d'Euler 0.01","res" u 1:2 w l title "y(t) obtenu avec la methode d'Adams Bashforth a deux pas avec pas 0.1", "res01" u 1:2 w l title "y(t) obtenu avec la methode d'Adams Bashforth a deux pas 0.01"
