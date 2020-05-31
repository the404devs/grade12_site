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
		//read the data from the file
		/*$array= explode("\n", $filedata);
		foreach ($array as $key) {
			echo "$key<br>";
		}*/			
		//echo $filedata;

		$position=strpos($filedata, $item);
		//echo "$position";
		if ($position==false) {
			echo $item." doesn't exist!<br>";
		}
		else{
			echo "$item does exist!<br>Let's find his phone number!<br>";
			$eof=strpos($filedata, "\r\n", $position);
			//eof is the last occurence or last occurence of a line break after tim cook's position.
			//echo $eof;
			$line = substr($filedata, $position, ($eof-$position));
			//echo "$line";
			$atPos=strpos($line, "@");
			//find where the @ is, cause we know the phone number is after the next comma after @
			$commaStart=strpos($line, ",", $atPos);
			$commaEnd=strpos($line, ",", $commaStart+1);
			//find the commas
			$phone = substr($line, $commaStart+1, ($commaEnd-$commaStart-1));
			echo "$phone";
		}
	?>
</body>
</html>