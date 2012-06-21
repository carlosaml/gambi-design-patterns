<?php

$conditions = array(
	"FirstName='Carlos'", 
	"LastName='Lopes'",
	"Comment LIKE '%gambi%'"); 

$query = "SELECT * FROM table WHERE \n";

foreach ($conditions as $condition) {
  $query .= $condition . " OR \n";
}

$query .= " 0=1 \n";

print $query;

?>
