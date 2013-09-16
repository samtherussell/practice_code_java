<?php
require 'connect.inc.php';

$code = $_GET['code'];


$query = "SELECT * FROM CountdownGames WHERE Game_CODE='$code'";
		if($result = mysql_query($query)){
			if (mysql_num_rows($result)!=null){
				$row = mysql_fetch_array($result);
				$started = $row['Game_STARTED'];	
				echo $started;
			}else{
			echo 2;
			}
		}else{
		echo 2;
		}

//2 is error
//1 game started
//0 not yet started


?>