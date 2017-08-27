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
                        	<a href="about.html"><i class="fa fa-key"></i> 关于我们</a>
                        </li>
                       <img src="${pageContext.request.contextPath}/Steam.png" width="100px" height="100px">
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
                     <h1 class="page-header"><i class="fa fa-info"></i> 关于</h1>
                     </div>
                  </div>
               
              
             <div class="row clearfix" >
             	<div class="col-md-6 column ui-sortable">
             		<div class="panel panel-primary">
   						 <div class="panel-heading">
    	    				<h3 class="panel-title"><i class="fa fa-lightbulb-o fa-5x"></i>我的关注</h3>
    						</div>
  							 <ul class="list-group">
  								<li class="list-group-item">关注的游戏</li>
  								<li class="list-group-item">关注的游戏id</li>
  								<li class="list-group-item">游戏logo</li>
  								<li class="list-group-item">游戏的相关信息</li>
  							</ul>
             		</div>
             	</div>
             	<div class="col-md-6 column ui-sortable">
             		<div class="panel panel-success">
   						 <div class="panel-heading">
    	    				<h3 class="panel-title"><i class="fa fa-shopping-cart fa-5x"></i>商店信息</h3>
    					</div>
   							 <ul class="list-group">
  								<li class="list-group-item">Steam所有游戏的价格信息</li>
  								<li class="list-group-item">原价</li>
  								<li class="list-group-item">现价</li>
  								<li class="list-group-item">折扣价</li>
  							</ul>
					</div>
             	</div>
             <div class="col-md-6 column ui-sortable">
             		<div class="panel panel-info">
   						 <div class="panel-heading">
    	    				<h3 class="panel-title"><i class="fa fa-home fa-5x"></i>我的账户</h3>
    					</div>
  							 <ul class="list-group">
  								<li class="list-group-item">与系统账号绑定的steam账号信息</li>
  								<li class="list-group-item">可以通过手动输入steam64位id进行重新绑定</li>
  								<li class="list-group-item">头像</li>
  								<li class="list-group-item">上次登录、最爱、在线状态、真实姓名、地址</li>
  							</ul>
					</div>
             	</div>
             	<div class="col-md-6 column ui-sortable">
             		<div class="panel panel-warning">
   						 <div class="panel-heading">
    	    				<h3 class="panel-title"><i class="fa fa-gamepad fa-5x"></i>我的游戏</h3>
    					</div>
  							<ul class="list-group">
  								<li class="list-group-item">统计所有在绑定账户下的游戏</li>
  								<li class="list-group-item">包含游戏ID、游戏名称、游戏logo</li>
  								<li class="list-group-item">可以通过点击关注按钮进行关注，结果显示在“我的关注”中</li>
  								<li class="list-group-item">游戏多的用户列表较长（有待优化）</li>
  							</ul>
					</div>
             	</div>
             	<div class="col-md-6 column ui-sortable">
             		<div class="panel panel-danger">
   						 <div class="panel-heading">
    	    				<h3 class="panel-title"><i class="fa fa-steam fa-5x"></i>我的好友</h3>
    					</div>
  							<ul class="list-group">
  								<li class="list-group-item">统计所有在绑定账户下的好友</li>
  								<li class="list-group-item">包含哈有的头像、昵称</li>
  								<li class="list-group-item">上次在线情况</li>
  								<li class="list-group-item">当前在线情况及正在玩的游戏</li>
  							</ul>
					</div>
             	</div>
             	<div class="col-md-6 column ui-sortable">
             		<div class="panel panel-success">
   						 <div class="panel-heading">
    	    				<h3 class="panel-title"><i class="fa fa-search fa-5x"></i>用户查询</h3>
    					</div>
  							<ul class="list-group">
  								
  								<li class="list-group-item">在搜索框中输入steam64位id即可查询相应id的用户信息</li>
  								<li class="list-group-item">必须输入steam64位个人id</li>
  								<li class="list-group-item">查询结果包含头像、昵称、真实姓名、地址、注册时间等</li>
  								<li class="list-group-item">如果有自定义的url可能也是能查得到的（有待优化）</li>
  							</ul>
   							 
					</div>
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
