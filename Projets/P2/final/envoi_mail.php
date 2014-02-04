<?php
$sujet=$_POST['sujet']; //On recupere le sujet
$message=$_POST['message']; //De meme avec le message
$message.="\r\n".'Adresse de contact :'; //On concatene l'adresse ou contacter la personne.
$message.=$_POST['adresse'];
$message.="\r\n";

if (mail('alexandre.vieira@insa-rouen.fr', $sujet, $message)) //Envoi de l'e-mail
	header('Location: contact.php?reussite=1'); // Si OK, retour a la page de contact, affiche un message pour dire que c'est bon
else
	header('Location: contact.php?reussite=0'); // De meme, message signalant echec
?>
