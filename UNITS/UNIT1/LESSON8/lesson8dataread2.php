<!DOCTYPE html>
<html>
<head>
	<title>Problem Solving with strings, arrays, and custom functions</title>
</head>
<body>
	<h1>
		Solving Problems in PHP using String Functions, Arrays and Custom Functions
	</h1>
	<?php
		$item="Timothy Cook";
		$filedata=file_get_contents("data.csv");
		//SAMPLE ARRAY
		$data = array(1,2,3,4,56,65877,865768,9);	
		//echo "$data[2]";//show the 3rd element

		$array= explode("\r\n", $filedata);
		foreach ($array as $line) {
			//echo "$key<br>";
			$lineArray= explode(",", $line);
			foreach ($lineArray as $key) {
				if ($lineArray[0]==$item) {
					echo "$lineArray[2]";
					
				}
			}
		}			
	?>
</body>
</html>