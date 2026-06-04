<?php
/* Multi line cmt
    #comments
*/
// Single line cmts
// Creating the Variable in PHP
// Variable Name Start With $

$name = "Nepal Mega College";
$course = "BCA";
$Semester = "III";
$fee = "40000";
$paid = True;
$students = array ("Shreya, Prenka, Prasuna, Jenisha");

echo gettype($name)."<br>";
echo gettype($fee). "<br>";

echo "hr";
echo "I am studing at $name in the course $course on semester $semester with fee $fee which is paid $paid";
echo "<br>";
echo 'I am studing at $name in the course $course on semester $semester with fee $fee which is paid $paid';
echo "<br>";
echo 'I am studing at $name in the course .$course. on semester .$semester. with fee .$fee. which is paid .$paid'