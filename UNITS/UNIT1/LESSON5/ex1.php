<!DOCTYPE html>
<html>
<head>
	<title>Exercise 1</title>
</head>
<body>
	<?php
		$user=$_POST["txtUsername"];
		$pass=$_POST["txtPassword"];
		if ($pass=="1zx234")
		{
			echo "Welcome ".$user."! <br>You know the secret password!";
		}
		else
		{
			echo "Sorry, wrong password!";
		}
	 ?>
</body>
</html>
