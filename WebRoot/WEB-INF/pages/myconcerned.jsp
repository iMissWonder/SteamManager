<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh">

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
                        <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
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
                            <a href="index.html"><i class="fa fa-home fa-fw"></i>首页</a>
                        </li>
                        <li>
                            <a href="myconcerned.html"><i class="fa fa-lightbulb-o fa-fw"></i>我的关注</a>
                        </li>
                        <li>
                            <a href="storeinfo.html"><i class="fa fa-shopping-cart fa-fw"></i>商店信息</a>
                        </li>
                        <li>
                            <a href="myaccount.html"><i class="fa fa-smile-o fa-fw"></i>我的账户</a>
                        </li>
                        <li>
                        	<a href="myapps.html"><i class="fa fa-gamepad"></i>我的游戏</a>
                        </li>
                         <li>
                        	<a href="myfriends.html"><i class="fa fa-steam"></i>我的好友</a>
                        </li>
                        <li>
                        	<a href="userq.html"><i class="fa fa-search"></i> 用户查询</a>
                        </li>
                         <li>
                        	<a href="blank.html"><i class="fa fa-key"></i> 关于我们</a>
                        </li>
                        <li>
                             <a href="login.html"><i class="fa fa-lock"></i> 登入登出</a>
                       	</li>
                       
                        </ul>
                            <!-- /.nav-second-level -->
                        </li>
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>
        
     <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">我的关注</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
      		<!-- table -->
      		<table class="table table-bordered table-hover table-striped"  text-align="center">
      			<thead>
      				<tr>
      					<th>游戏ID</th>
      					<th>游戏名</th>
      					<th>游戏logo</th>
      					<th>价格</th>	
      					<th>游戏原价</th>
      					<th>折扣</th>
      			</thead>
				<c:forEach var="re" items="${result.getMyconcernedCollocation()}">
					  <tbody>
						  <tr>
							  <td>${re.getId()}</td>
							  <td>${re.getName()}</td>
							  <td><img src="${re.getImage()}" /> </td>
							  <td>${re.getPrice()}</td>
							  <td>${re.getInitial()}</td>
							  <td>${re.getDiscount()}</td>
						  </tr>
					  </tbody>
				</c:forEach>
      		</table>
							
              
      
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
