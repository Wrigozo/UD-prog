<?php
	$a = 10; //first number
	$b = 5; //second number

	echo "Az (a) változó értéke: ".$a;
	echo "<br/>Az (b) változó értéke: ".$b;


	$a = $b-$a;
	$b = $b-$a;
	$a = $b+$a;

	echo "<br/>------------------------------";
	echo "<br/>Csere után:<br/>";
	echo "Az (a) változó értéke: ".$a;
	echo "<br/>Az (b) változó értéke: ".$b;
?>