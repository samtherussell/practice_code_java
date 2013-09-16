<?php
require 'connect.inc.php';

$code = $_GET['code'];
$numbers = array();

$query = "SELECT * FROM CountdownGames WHERE Game_CODE='$code'";
		if($result = mysql_query($query)){
			if (mysql_num_rows($result)!=null){
				$row = mysql_fetch_array($result);
				$numbers[0] = $row['NUM_1'];	
				$numbers[1] = $row['NUM_2'];	
				$numbers[2] = $row['NUM_3'];	
				$numbers[3] = $row['NUM_4'];	
				$numbers[4] = $row['NUM_5'];	
				$numbers[5] = $row['NUM_6'];	
				$numbers[6] = $row['TARGET_NUM'];
				$numbers[7] = $row['Game_TIME'];
				$cheese = "$numbers[0]\n$numbers[1]\n$numbers[2]\n$numbers[3]\n$numbers[4]\n$numbers[5]\n$numbers[6]\n$numbers[7]";
				echo $cheese;
			}else{
			echo "error";
			}
		}else{
		echo "error";
		}

//is there is an error - returns error
//otherwise returns the numbers each on a new line


?>