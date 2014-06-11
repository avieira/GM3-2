set terminal postscript eps enhanced color
set output "image.eps"
set title "Representation graphique des solutions numeriques"
plot "resEul" u 1:2 w l title "y(t) obtenu avec la methode d'Euler" , "res" u 1:2 w l title "y(t) obtenu avec la methode d'Adams Bashforth a deux pas",  exp(x)

