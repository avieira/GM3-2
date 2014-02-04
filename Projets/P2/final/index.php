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
$req = $bdd->query('SELECT titre, contenu, DATE_FORMAT(date_ecriture, \'%d/%m/%Y\') AS date_ecr FROM articles ORDER BY date_ecriture DESC LIMIT 0, 10'); //recuperation des donnees

while ($donnees = $req->fetch()) //Conversion des donnees dans un format exploitable
{
?>
   <div class="une_news">
	<h1><?php echo htmlspecialchars($donnees['titre']); ?></h1> <!--Affichage du titre-->
        <h2>le <?php echo $donnees['date_ecr']; ?></h2> <!--Affichage de la date-->
	<p>
        <img  src="images/news1.jpg" alt="News" style="float:right" />	
        <?php echo nl2br(htmlspecialchars($donnees['contenu']));?></br></br> <!--Affichage de la news-->
	</p>
  </div>
  <?php
}
?>
 </div>
 

<!--Second bloc: ajouter des news-->
 <div id="addnews">
 <p>Renseignez le mot de passe pour acceder au formulaire de nouvelles</p>

 <form action="formul_news.php" method="post">
	<p>			
		<input type="password" name="MdP" /></br>
		<input type="submit" value="Valider" />
	</p>
</form>
 </div>


<!--Chargement du pied de page-->
<?php include("piedDePage.php"); ?>

</body>

</html>
