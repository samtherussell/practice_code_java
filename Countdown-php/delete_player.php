<?php
require 'connect.inc.php';

$id =  $_GET['id'];
			
				$query = "DELETE FROM CountdownPlayers WHERE Player_ID='$id'";
				
				mysql_query($query);
			

?>