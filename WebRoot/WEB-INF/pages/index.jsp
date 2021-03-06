<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SteamManager</title>

    <!-- Favicons -->
    <link rel="icon" href="../favicon.ico" type="image/x-icon" />
    <link rel="shortcut icon" href="../favicon.ico" type="image/x-icon" />
    <link rel="bookmark" href="../favicon.ico" type="image/x-icon" />

    <!-- Bootstrap Core CSS -->
    <link href="${pageContext.request.contextPath}/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="${pageContext.request.contextPath}/bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${pageContext.request.contextPath}/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="${pageContext.request.contextPath}/bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">SteamManager</a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-envelope fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                  
                    <!-- /.dropdown-messages -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-tasks fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>

                
                    <!-- /.dropdown-alerts -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="myaccount.html"><i class="fa fa-user fa-fw"></i> User Profile</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                       
                        <li>
                            <a href="index"><i class="fa fa-home fa-fw"></i>首页</a>
                        </li>
                        <li>
                            <a href="myconcerned"><i class="fa fa-lightbulb-o fa-fw"></i>我的关注</a>
                        </li>
                        <li>
                            <a href="storeinfo"><i class="fa fa-shopping-cart fa-fw"></i>商店信息</a>
                        </li>
                        <li>
                            <a href="myaccount"><i class="fa fa-smile-o fa-fw"></i>我的账户</a>
                        </li>
                        <li>
                        	<a href="myapps"><i class="fa fa-gamepad"></i>我的游戏</a>
                        </li>
                         <li>
                        	<a href="myfriends"><i class="fa fa-steam"></i>我的好友</a>
                        </li>
                        <li>
                        	<a href="userq"><i class="fa fa-search"></i> 用户查询</a>
                        </li>
                         <li>
                        	<a href="about"><i class="fa fa-key"></i> 关于我们</a>
                        </li>
                        <li>
                             <a href="login"><i class="fa fa-lock"></i> 登入登出</a>
                       	</li>
                       
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>

        <!-- Page Content -->
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-9">
             
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                </div>
                
                
                
   <div class="row">
        <div class="row">
                <div class="col-lg-12">
                    
							<div class="well well-sm">
							<div class="row clearfix">
      					<div class="col-md-12 ">
      						<div class="box box-element">
      							<div class="jumbotron" contenteditable="true"> 
      							<h1><font>Steam Manager</font></h1>
      							<p><font>is an online query system for steam store information,</font>
      							<font>but it's not perfect yet,</font>
      							<font>but we'll try our best to do it well.</font>
      							</p>
      							<a class="btn btn-primary btn-large" href="about.html">Learn about</a>
      							</div>
      						</div>
      						</div>
   <div class="col-lg-12">         
   <div id="myCarousel" class="carousel slide">
	<!-- è½®æ­ï¼Carouselï¼ææ  -->
	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
		<li data-target="#myCarousel" data-slide-to="2"></li>
	</ol>   
	<!-- è½®æ­ï¼Carouselï¼é¡¹ç® -->
	<div class="carousel-inner">
		<div class="item active">
			<img src="${pageContext.request.contextPath}/csgo.jpg" alt="First slide" width="100%" heigth="300px">
		</div>
		<div class="item">
			<img src="${pageContext.request.contextPath}/hitman.jpg" alt="Second slide"  width="100%" height="300px">
		</div>
		<div class="item">
			<img src="${pageContext.request.contextPath}/hitman2.jpg" alt="Third slide"  width="100%" height="300px">
		</div>
	</div>
	
	<!-- è½®æ­ï¼Carouselï¼å¯¼èª -->
	<a class="carousel-control left" href="#myCarousel" 
	   data-slide="prev">&lsaquo;</a>
	<a class="carousel-control right" href="#myCarousel" 
	   data-slide="next">&rsaquo;</a>
</div> 
</div> 
</div> 
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="${pageContext.request.contextPath}/bower_components/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="${pageContext.request.contextPath}/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="${pageContext.request.contextPath}/bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="${pageContext.request.contextPath}/dist/js/sb-admin-2.js"></script>

</body>

</html>
