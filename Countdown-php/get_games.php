<?php
require 'connect.inc.php';


$games = array();

		$query = 	"SELECT * 
		FROM  `CountdownGames` 
		WHERE Game_STARTED='0'
		ORDER BY  `Game_ID` DESC
		";
		if($result = mysql_query($query)){
			if (mysql_num_rows($result)!=null){
				$num = 0;
				while($row = mysql_fetch_array($result)){
				
					$name = $row['Game_CODE'];
					$id = $row['Game_ID'];
					
					
					
					$query2 = 	"SELECT * 
					FROM  `CountdownPlayers` 
					WHERE Game_ID='$id'
					
					";
					if($result2 = mysql_query($query2)){
			if (mysql_num_rows($result2)!=null){
						$playernum = mysql_num_rows($result2);
					}else{
						$playernum = 0;
					}
					}else{
						$playernum = 10;
					}
					
					$games[$num] = array(
					"name"=>$name,
					"numplayers"=>$playernum					
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

echo json_encode($games);




  //print_r($game_results);
  

?>