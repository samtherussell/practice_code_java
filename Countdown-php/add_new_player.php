<?php
require 'connect.inc.php';

$code = $_GET['code'];
$name  = $_GET['name'];
$GAME_ID = 2;
$player_ID = 0;


$query = "SELECT * FROM CountdownGames WHERE Game_CODE='$code'";
		if($result = mysql_query($query)){
			if (mysql_num_rows($result)!=null){
				$row = mysql_fetch_array($result);
				$GAME_ID = $row['Game_ID'];	
			}else{
				echo 2;
			}
		}else{
			echo 2;
		}
		
		do{
			$player_ID = $player_ID + 1;
			$query = "SELECT * FROM CountdownPlayers WHERE Player_ID='$player_ID'";
			$result = mysql_query($query);
			
		}while(mysql_num_rows($result)>0);
			
	//Player_ID	Game_ID	Player_DIST	Player_NAME	Player_SCORE
	$query = "INSERT INTO `CountdownPlayers` VALUES('$player_ID','$GAME_ID','','$name','0')";
				
	mysql_query($query);
	
	echo $player_ID;
				

?>