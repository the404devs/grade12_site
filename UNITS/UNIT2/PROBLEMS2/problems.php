<!DOCTYPE html>
<html>
<head>
	<title>memes</title>
</head>
<body>
	<?php
		$file = "DATA/DATA12.txt";
		$fileContent = file_get_contents("$file");
		$lineArray = explode("\r\n", $fileContent);

		for ($x=0; $x < 10; $x++) {
			$orange = 0;
			$blue = 0;
			$green = 0;
			$yellow = 0;
			$pink = 0;
			$violet = 0;
			$brown = 0;
			$red = 0;
			
			$time=0;

			for ($i=0; $i < sizeof($lineArray); $i++) { 
				if ($lineArray[$i]=="orange") {
					$orange++;
				}
				else if ($lineArray[$i]=="blue") {
					$blue++;
				}
				else if ($lineArray[$i]=="green") {
					$green++;
				}
				else if ($lineArray[$i]=="yellow") {
					$yellow++;
				}
				else if ($lineArray[$i]=="pink") {
					$pink++;
				}
				else if ($lineArray[$i]=="violet") {
					$violet++;
				}
				else if ($lineArray[$i]=="brown") {
					$brown++;
				}
				else if ($lineArray[$i]=="red") {
					$red++;
				}	

				else if ($lineArray[$i]=="end of box") {
					$time += ceil($orange/7)*13;
					$time += ceil($blue/7)*13;
					$time += ceil($green/7)*13;
					$time += ceil($yellow/7)*13;
					$time += ceil($pink/7)*13;
					$time += ceil($violet/7)*13;
					$time += ceil($brown/7)*13;
					$time += ceil($red)*16;
					echo "$time<br>";
					array_splice($lineArray, 0, $i+1);					
					break;	
				}				
			}
		}
	?>
</body>
</html>