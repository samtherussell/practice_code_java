<?php
require 'connect.inc.php';

$code = $_GET['code'];


$query = "SELECT * FROM CountdownGames WHERE Game_CODE='$code'";
		if($result = mysql_query($query)){
			if (mysql_num_rows($result)!=null){
				echo 1;
			}else{
			echo 0;
			}
		}else{
		echo 2;
		}

//2 is error
//1 there is already a game with that code
//0 there is no game


?>