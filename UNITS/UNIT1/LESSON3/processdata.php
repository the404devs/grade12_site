<!DOCTYPE html>
<html>
<head>
	<title>You've been hacked!</title>
</head>
<body>
	<?php
	$student=$_POST["memes"];
	$password=$_POST["txtpassword"];
	$gender=$_POST["radGender"];
	 echo "<b>You got hacked!</b> <br>";
	 echo "the response to your form data is as follows: <br>";
	 echo "Your SIN number is ".$student."<br>";
	 echo "your password is ".$password."<br>";
	 echo "we assume your gender is ".$gender;

	 ?>
</body>
</html>
