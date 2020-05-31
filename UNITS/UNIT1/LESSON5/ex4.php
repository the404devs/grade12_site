<!DOCTYPE html>
<html>
<head>
	<title>Exercise 4</title>
</head>
<body>
	<?php
		$pop=$_POST["txtPop"];	
		$perc=$_POST["txtPercent"]/100;
		$years=$_POST["txtYears"];

		for ($i=1; $i < $years; $i++) { 
			$pop=$pop*(pow((1+$perc), $years));
			echo "Population in year ".$i.": ".$pop."<br>";
		}

	 ?>
</body>
</html>
