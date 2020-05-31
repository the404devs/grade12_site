<!DOCTYPE html>
<html>
<head>
	<title>Exercise 3</title>
</head>
<body>
	<?php
		$radius = $_POST["txtRad"];
		$diameter = $radius*2;
		echo "Radius is ".$radius."<br>";
		echo "Diameter is ".$diameter."<br>";
		echo "<img src='Circle.gif' width=". $diameter ."px>";
	 ?>
</body>
</html>
