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
		function findPerson($filedata, $item)
		{
		$array= explode("\r\n", $filedata);
		foreach ($array as $line) {
			//echo "$key<br>";
			$lineArray= explode(",", $line);
			foreach ($lineArray as $key) {
				if ($lineArray[0]==$item) {
					$phoneNumber = $lineArray[2];
					break;
				}
			}
		}
		return $phoneNumber;
		} 

		echo findPerson("data.csv", "Timothy Cook");

	?>
</body>
</html>