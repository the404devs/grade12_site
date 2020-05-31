<!DOCTYPE html>
<html>
<head>
	<title>memes</title>
</head>
<body>
	<?php
		$file = $_POST["radFile"];
		$fileContent = file_get_contents("$file");
		$lineArray = explode("\n", $fileContent);
		$bigTenBA = array('','','','','','','','','','');
		$bigTenSA = array('','','','','','','','','','');
		echo "$lineArray[0]<br>";
		echo "====================<br>";
		for ($i=1; $i < sizeof($lineArray); $i++) { 
			$dataArray = explode(" ", $lineArray[$i]);
			$teamName = $dataArray[0];
			$atBats = $dataArray[2];
			$totalHits = $dataArray[4];
			$twoBaseHits = $dataArray[5];
			$threeBaseHits = $dataArray[6];
			$homeRuns = $dataArray[7];
			$singleBaseHits = $totalHits - $twoBaseHits - $threeBaseHits - $homeRuns;


			$batAvg = $totalHits/$atBats;
			$batAvg = number_format($batAvg, 3);
			$batAvg = str_replace("0.", ".", $batAvg);
			$bigTenBA[$i-1] = $batAvg;

			$slugAvg = ($singleBaseHits+2*$twoBaseHits+3*$threeBaseHits+4*$homeRuns)/$atBats;
			$slugAvg = number_format($slugAvg, 3);
			$slugAvg = str_replace("0.", ".", $slugAvg);
			$bigTenSA[$i-1] = $slugAvg;

			echo "$teamName: $batAvg $slugAvg<br>";
		}
		echo "====================<br>";
		$BATotal = number_format((array_sum($bigTenBA)/sizeof($bigTenBA)),3);
		$SATotal = number_format((array_sum($bigTenSA)/sizeof($bigTenSA)),3);
		$BATotal = str_replace("0.", ".", $BATotal);
		$SATotal = str_replace("0.", ".", $SATotal);
		echo "Big 10 Av: $BATotal $SATotal";
	?>
</body>
</html>