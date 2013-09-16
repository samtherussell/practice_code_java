<?php
require 'connect.inc.php';

$code = $_GET['code'];
$game_results = array();

$query = 	"SELECT CountdownGames.Game_TIME, CountdownGames.TARGET_NUM, CountdownPlayers.Player_NAME, CountdownPlayers.Player_DIST, CountdownPlayers.Player_SCORE  
			FROM CountdownGames
			INNER JOIN CountdownPlayers
			ON CountdownGames.GAME_ID=CountdownPlayers.Game_ID
			WHERE CountdownGames.Game_CODE =  '$code'
			ORDER BY CountdownPlayers.Player_DIST ASC";
		if($result = mysql_query($query)){
			if (mysql_num_rows($result)!=null){
				$num = 0;
				while($row = mysql_fetch_array($result)){
					$game_results['sam'] = array(
					"time"=>$row['Game_TIME'],
					"target"=>$row['TARGET_NUM'],
					"name"=>$row['Player_NAME'],
					"distance"=>$row['Player_DIST'],
					"score"=>$row['Player_SCORE'],
					);
					$num = $num+1;
				}
			}else{
			echo "error";
			}
		}else{
		echo "error";
		}
		
		
		
		

//is there is an error - returns error
//otherwise returns results as encoded array

echo json_encode($game_results);




  //print_r($game_results);
  

?>