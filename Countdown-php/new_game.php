<?php
require 'connect.inc.php';

$code = $_GET['code'];
$password = $_GET['pass'];

				//Game_ID	Game_CODE	Game_TIME	Game_STARTED?	TARGET_NUM	NUM_1	NUM_2	NUM_3	NUM_4	NUM_5	NUM_6
				$query = "INSERT INTO `CountdownGames` VALUES('','$code','$password','','','','','','','','','')";
				
				mysql_query($query);
			

?>