set terminal postscript eps enhanced color
set output "2.eps"
set title "Representation graphique de la solution numerique des abscisses"
plot "r2" u 1:2 w l title "x(t) AB-2 0.0000001",exp(-2*x)+exp(-1000*x) title "Solution formelle"

