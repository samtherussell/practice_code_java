<?php
require 'connect.inc.php';

$code = $_GET['code'];
$difficulty = $_GET['difficulty'];
$time = $_GET['time'];
$GAME_ID;

do {
						
				$numbers[0] = rand(2,10);
				$numbers[1] = rand(2,10);
				$numbers[2] = rand(2,10);
				$numbers[3] = rand(2,10);
				$numbers[4] = rand(2,10);
				$numbers[5] = rand(2,10);
				}while ($numbers[0] == $numbers[1] || $numbers[0] == $numbers[2] || $numbers[0] == $numbers[3]	|| $numbers[0] == $numbers[4] || $numbers[0] == $numbers[5]|| $numbers[1] == $numbers[2] || $numbers[1] == $numbers[3]|| $numbers[1] == $numbers[4] || $numbers[1] == $numbers[5]|| $numbers[2] == $numbers[3] || $numbers[2] == $numbers[4]|| $numbers[2] == $numbers[5] || $numbers[3] == $numbers[4]|| $numbers[3] == $numbers[5] || $numbers[4] == $numbers[5]);
				
				
				
				switch($difficulty){
					case 0:
						$numbers[6] = rand(100,200);
						break;
					case 1:
						$numbers[6] = rand(200,400);
						break;
					case 2:
						$numbers[6] = rand(400,600);
						break;
					case 3:
						$numbers[6] = rand(600,1000);
						break;
					case 4:
						$numbers[6] = rand(0,900);
						break;
				}
				//Game_ID	Game_CODE	Game_TIME	Game_STARTED?	TARGET_NUM	NUM_1	NUM_2	NUM_3	NUM_4	NUM_5	NUM_6
				
				$query = "UPDATE `CountdownGames` SET `Game_TIME`='$time',`TARGET_NUM`='$numbers[6]',`NUM_1`='$numbers[0]',`NUM_2`='$numbers[1]',`NUM_3`='$numbers[2]',`NUM_4`='$numbers[3]',`NUM_5`='$numbers[4]',`NUM_6`='$numbers[5]' WHERE Game_CODE='$code'";
				
				mysql_query($query);
				
			

?>