<?php

function newline() {
  print("\n");
}

function doThings($stuff) {
  $thingsFromTheStuff = split(",", $stuff);
  print($thingsFromTheStuff[0]);
  newline();
  print($thingsFromTheStuff[1]);
  newline();
  $stuffFromPartsOfTheThings = split("#", $thingsFromTheStuff[2]);
  printf("%s -> %s", $stuffFromPartsOfTheThings[0], $stuffFromPartsOfTheThings[1]);
}

print("\n===\n");
doThings("bla,heyhey,123#2");
print("\n===\n\n");

?>
