<?php
require 'connect.inc.php';


$id =  $_GET['id'];
$dist = $_GET['distance'];

$score = 0;
				
				
				
				
				
				$query = "SELECT * FROM CountdownPlayers WHERE Player_ID='$id'";
		if($result = mysql_query($query)){
			if (mysql_num_rows($result)!=null){
				$row = mysql_fetch_array($result);
				$score = $row['Player_SCORE'];	
			}else{
			echo "error";
			}
		}else{
		echo "error";
		}
			
		$score = $score + $dist;
			
				
	$query = "UPDATE CountdownPlayers SET Player_DIST=$dist,Player_SCORE='$score'  WHERE Player_ID='$id'";
				mysql_query($query);
				
	

?>