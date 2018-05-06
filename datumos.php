<!DOCTYPE html>
<html>
<head>
	<title>Születésnapom</title>
</head>
<body>
	<form method="POST" action="">
		<label>Év:</label>
		<input type="text" name="szul_ev">
		<label>Hónap:</label>
		<input type="text" name="szul_hon">
		<label>Nap:</label>
		<input type="text" name="szul_nap">
		<input type="submit" name="send" value="Kiír">
	</form>
	<?php
		if(isset($_POST["send"]))
		{
			//űrlap által elküldött év, hónap, nap
			$szul_ev = $_POST["szul_ev"];
			$szul_hon = $_POST["szul_hon"];
			$szul_nap = $_POST["szul_nap"];

			$ev = 2000; $honap = 1; $nap = 1; $hetnapja = 5;

			$honapok = array(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334);

			$napok = array("Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap");

			while($ev != 3000)
			{
				$hetnapja += 365;
				if($ev % 4 == 0 && !($ev % 100 == 0 && $ev % 400 != 0))
				{
					$hetnapja++;
				}
				$ev++;
			}

			$hetnapja += $holnapok[$szul_hon-1];
			$hetnapja += $szul_nap - 1;

			echo "A te születésnapod erre a napra fog esni: ".$napok[$hetnapja%7];
		}
	?>
</body>
</html>
