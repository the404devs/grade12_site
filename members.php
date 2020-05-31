<html lang="en">
	<head> 
		<title> 
			Goodwin's ICS4U Site 
		</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="shortcut icon" type="image/x-icon" href="IMAGES/favicon.ico">
		<link rel="stylesheet" type="text/css" href="sheet.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		<script src="http://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
		<script src="nav.js"></script>
	</head>
	<body>
	<span class="navopen" style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776;</span> 


	<a href="register.html"><span class="userReg" style="font-size:30px;cursor:pointer"><i id="UserIcon" class="fa fa-address-book-o" style="padding-top:5px; padding-bottom:5px; font-size:30px"></i></span></a>

		<div class="header">
			<h1>
				Members
			</h1> 
		</div>



		<div id="navbox" class="sidenav">
			<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>			
			<a href="index.html">🏠 Home</a>
			
			<a href="javascript:void(0)" class="unitdrop" onmouseenter="openUnit()" onmouseleave="closeUnit()">Units <i class="fa fa-chevron-down" id="unitarrow"></i></a>	
			<div class="dropdown-container" id="unitdrop" onmouseenter="openUnit()" onmouseleave="closeUnit()">
    			<a href="UNITS/UNIT1/index.html">Unit 1</a>
   			    <a href="UNITS/UNIT2/index.html">Unit 2</a>
    			<a href="UNITS/UNIT3/index.html">Unit 3</a>
    			<a href="UNITS/UNIT4/index.html">Unit 4</a>
    			<a href="UNITS/UNIT5/index.html">Unit 5</a>
  			</div>
  			

  			<a href="javascript:void(0)" class="assigndrop" onmouseenter="openAssign()" onmouseleave="closeAssign()">Assignments <i class="fa fa-chevron-down" id="assignarrow"></i></a>	
			<div class="dropdown-container" id="assigndrop" onmouseenter="openAssign()" onmouseleave="closeAssign()">
    			<a href="#">Unit 1 Assignment</a>
   			    <a href="#">Unit 2 Assignment</a>
    			<a href="#">Unit 3 Assignment</a>
    			<a href="#">Unit 4 Assignment</a>
    			<a href="#">Unit 5 Assignment</a>
    			<a href="#">Summative</a>
  			</div>
  			
			<a href="http://sdsscomputers.com/_courses/ics4u/index.php">SDSS Computers</a>
			
			<a href="http://the404.ml/">The404 - My personal site</a>
			
			<a href="https://youtu.be/dQw4w9WgXcQ"></a>
			<a class="glitch" href="javascript:void(0)" onclick="glitchout()">Don't click me!</a>
		</div>

		<hr>

		<div class="content">
			<?php
				$content=file_get_contents("userinfo.txt");
				$array= explode("\n", $content);
				foreach ($array as $key) {
					echo "$key<br>";
				}
				mail("the404devs@gmail.com", "hello", "banana");
			?>

		</div>

		<div class="footer">
			<p> 
				This page was last updated on <b>02/12/18 at 17:51</b>
			</p>
		</div>
	</body>
</html>