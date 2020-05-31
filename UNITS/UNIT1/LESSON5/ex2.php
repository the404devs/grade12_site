<!DOCTYPE html>
<html>
<head>
	<title>Exercise 2</title>
</head>
<body>
	<?php
		$cost1=$_POST["txtCost1"];	
		$cost2=$_POST["txtCost2"];
		$cost3=$_POST["txtCost3"];
		$cost4=$_POST["txtCost4"];

		$subtotal=$cost1+$cost2+$cost3+$cost4;
		$total=$subtotal*1.13;

		if ($total > 100) {
			$discount = $total*0.02;
			$newtotal = $total-$discount;
		}

		echo "<h3><b>Subtotal: ".$subtotal."</b></h3>";
		echo "<h3><b>Total (after tax): ".$total."</b></h3>";

		if($total > 100){
			echo "<h3><b>Discount: ".$discount."</b></h3>";
			echo "<h3><b>Final Total: ".$newtotal."</b></h3>";
		}

	 ?>
</body>
</html>
