<!-- unset() is use to rempve the data  -->
 <?php
 // starting the session at very top
 session_start();
 if (!isset($_SESSION['isLogin'])){
    header("Location: login.php");
 }

 //registering the users session
 $_SESSION['username']=$username;
