<?php

$temp = $_SESSION["thing"];
$_SESSION["thing"] = "newValue";
execute();
$_SESSION["thing"] = $temp;

function execute() {
  print("Executed with " + $_SESSION["thing"]);
}

?>
