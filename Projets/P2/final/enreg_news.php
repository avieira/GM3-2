<?php
//Recuperation des donnees, sans mise en forme
$bdd = new PDO('mysql:host=mysql2.alwaysdata.com;dbname=essaissitesweb_news', '67162', 'penrchalper');//Changer ici pour coller avec les identifiants necessaires, connexion a la base de donnees

$sauv = $bdd->prepare('INSERT INTO articles(titre, contenu, date_ecriture) VALUES(:titre, :contenu, NOW())'); //On prepare a rentrer de nouveaux champs dans la table article dans la base
$sauv->execute(array( //Recuperation des donnees
	'titre'=>$_POST['titre'],
	'contenu'=>$_POST['message'],
));

header('Location: formul_news.php?reussite=1');
?>
