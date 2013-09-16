<?php
require 'connect.inc.php';

$code = $_GET['code'];
			
				$query = "UPDATE CountdownGames SET Game_STARTED=0 WHERE Game_CODE='$code'";
				
				mysql_query($query);
			

?>