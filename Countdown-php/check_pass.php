<?php
require 'connect.inc.php';

$code = $_GET['code'];
$pass  = $_GET['pass'];



$query = "SELECT * FROM CountdownGames WHERE Game_CODE='$code' and Game_PASS='$pass'";
		if($result = mysql_query($query)){
			if (mysql_num_rows($result)!=null){
				
				if (mysql_num_rows($result)==0){
					echo 0;
				}else{
				echo 1;
				}			
			}else{
				echo 0;
			}
		}else{
			echo 2;
		}
		
		
	
	
				

?>