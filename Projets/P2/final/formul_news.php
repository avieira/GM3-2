<?php session_start(); //Ouverture d'une session, pour conserver le mot de passe
 if (isset($_POST['MdP']))
 {
	 $_SESSION['MdP']=$_POST['MdP'];
 }
?>

<!DOCTYPE html>
<html lang="fr">

<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css" /> 
<title> Essais php - Conrad Hillairet et Alexandre Vieira</title>
</head>

<body>

<!--Chargement de l'entete-->
<?php include("entete.php"); ?>
<!--Chargement du menu-->
<?php include("menu.php"); ?>


 <!--Premier bloc: affichage des news-->
 <div id="news">
  <?php 
$bdd = new PDO('mysql:host=mysql2.alwaysdata.com;dbname=essaissitesweb_news','67162','penrchalper'); //Connexion a la base de donnees
$req = $bdd->query('SELECT titre, contenu, DATE_FORMAT(date_ecriture, \'%d/%m/%Y\') AS date_ecr FROM articles ORDER BY date_ecriture DESC LIMIT 0, 10'); //Recuperation des donnees dans la table article, avec un certain ordre, et un format special pour la date

while ($donnees = $req->fetch())
{
?>
   <div class="une_news">
	<h1><?php echo htmlspecialchars($donnees['titre']); ?></h1> 
        <h2>le <?php echo $donnees['date_ecr']; ?></h2>
	<p>
        <img  src="images/news1.jpg" alt="News" style="float:right" />	
        <?php echo nl2br(htmlspecialchars($donnees['contenu']));?></br></br> <!--nl2br : saut de ligne remplace par une balise br, htmlspecialchars pour que les codes ne soient pas interprete-->
	</p>
  </div>
  <?php
}
?>
 </div>
 

<!--Second bloc: ajouter des news-->
 <div id="formnews">

<?php
if (isset($_GET['reussite']) AND ($_GET['reussite']==1)) //Si la variable est bien definie dans l'url et qu'elle vaut 1
	echo "L'article a bien ete enregistre !";
if ($_SESSION['MdP'] == "MotDePasse") //On verifie si le mot de passe est bon, si c'est le cas, on affiche le formulaire. Dans le cas contraire, on n'affiche que le mot de passe est faux.
{
?>
<!--Creation du formulaire-->
<form action="enreg_news.php" method="post">
	<p>
		Titre : <input type="Titre" name="titre" /></br> <!--Demande du titre de l'article-->
		Contenu : </br><!--Demande du contenu de l'article-->
<textarea name="message" rows="8" cols="45">
Tapez votre article ici.</textarea>
		</br> 
		<input type="submit" value="Valider" />
	</p>
</form>
<?php
}
else
	echo "Le mot de passe est incorrect <br />";
?>
 </div>


<!--Chargement du pied de page-->
<?php include("piedDePage.php"); ?>

</body>

</html>





