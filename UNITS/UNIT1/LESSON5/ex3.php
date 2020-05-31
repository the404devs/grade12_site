<!DOCTYPE html>
<html>
<head>
	<title>Exercise 3</title>
</head>
<body>
	<?php
		$name=$_POST["txtName"];	
		$num=$_POST["txtNum"];

		for ($i=0; $i < $num; $i++) { 
			echo $name." ";
		}

	 ?>
</body>
</html>
