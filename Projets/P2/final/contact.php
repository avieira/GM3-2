<!DOCTYPE html>
<html lang="fr">

<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style2.css" /> 
<title> Essais php - Conrad Hillairet et Alexandre Vieira</title>
</head>

<body>

<!--Chargement de l'entete-->
<?php include("entete.php"); ?>
<!--Chargement du menu -->
<?php include("menu.php"); ?>


<!--Definition du corps de la page-->
<div id="corps">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<?php
if (isset($_GET['reussite'])) //Si la variable est bien definie dans l'URL
{
	if ($_GET['reussite']==1)
		echo "Le message a bien ete envoye !";
	else
		echo "Le message n'a pas pu etre envoye.";
}
?>
<!--Creation du formulaire-->
<form action="envoi_mail.php" method="post">
	<p>
		Sujet du message : <input type="Sujet" name="sujet" /></br><!--Demande du sujet du message-->
		Adresse mail de contact : <input type="Adresse" name="adresse" /></br><!--Demande d'une adresse pour pouvoir repondre quand meme-->
		Message : </br><!--Demande du contenu de l'article-->
<textarea name="message" rows="8" cols="45">
Tapez votre message ici.</textarea>
		</br> 
		<input type="submit" value="Valider" />
	</p>
</form>
</div>

<!--Chargement du pied de page-->
<?php include("piedDePage.php"); ?>

</body>

</html>
