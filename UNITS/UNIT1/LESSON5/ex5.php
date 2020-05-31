<!DOCTYPE html>
<html>
<head>
	<title>Exercise 4</title>
</head>
<body>
	<?php
		$num=1;
		$initNum=$_POST["txtFactorial"];

		for ($i=0; $i < $initNum; $i++) { 
			$num*=($initNum-$i);
		}
		echo "The factorial of ".$initNum." is ".$num;

	 ?>
</body>
</html>
