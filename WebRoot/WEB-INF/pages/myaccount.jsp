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
                    <ul class="dropdown-menu dropdown-messages">
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                            </a>
                        </li>
                   
                    </ul>
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
                            <a href="index.html"><i class="fa fa-home fa-fw"></i> 首   页</a>
                        </li>
                        <li>
                            <a href="blank.html"><i class="fa fa-lightbulb-o fa-fw"></i> 我的关注</a>
                        </li>
                        <li>
                            <a href="tables.html"><i class="fa fa-shopping-cart fa-fw"></i> 商店信息</a>
                        </li>
                        <li>
                            <a href="forms.html"><i class="fa fa-smile-o fa-fw"></i> 我的账户</a>
                        </li>
                        <li>
                        	<a href="#"><i class="fa fa-gamepad"></i> 我的游戏</a>
                        </li>
                         <li>
                        	<a href="myfriend.html"><i class="fa fa-steam"></i> 我的好友</a>
                        </li>
                        
                        <li>
                        	<a href="Userq.html"><i class="fa fa-search"></i> 查询用户</a>
                        </li>
                         <li>
                        	<a href="#"><i class="fa fa-key"></i> 关于我们</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-wrench fa-fw"></i> UI Elements<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="panelswells.html">panelswells</a>
                                </li>
                                <li>
                                    <a href="buttons.html">Buttons</a>
                                </li>
                                <li>
                                    <a href="notifications.html">Notifications</a>
                                </li>
                                <li>
                                    <a href="typography.html">Typography</a>
                                </li>
                                <li>
                                    <a href="icons.html"> Icons</a>
                                </li>
                                <li>
                                    <a href="grid.html">Grid</a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                       
                        <li class="active">
                            <a href="#"><i class="fa fa-files-o fa-fw"></i> Sample Pages<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a class="active" href="blank.html">Blank Page</a>
                                </li>
                                <li>
                                    <a href="login.html">Login Page</a>
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
                	<p></p>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
           

 		<div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                        <h2><i class="fa fa-user"></i> ${user.getUsername()}的账户信息</h2>
                        </div>
                        <div class="panel-body">
                        <div class="table-responsive" align="center">
						<form action="${pageContext.request.contextPath}/myaccount" method="get" role="form">
							<table class="table table-bordered table-hover table-striped" >
						   
								<tr>
									<td width="180px" rowspan="4"><img src="${avatar}"></td><th>Nick Name</th><td> ${nickname} </td>
								</tr>
								<tr>
									<th>Real Name</th><td> ${realname} </td>
								</tr>
								<tr>
									<th>Most Played Game</th><td> ${mostgame} </td>
								</tr>
								<tr>
									<th>SteamID 64</th><td> ${steam64} </td>
								</tr>   
								<tr>
									<td align="center"; valign="center"><input class="form-control" placeholder="请输入新的SteamID" name="newsteamid" type="text"></td>
									<th>Summary</th><td> ${summary} </td>
								</tr> 
								<tr>
									<td align="center"; valign="center"><input type="submit" value="Submit" class="btn btn-success"></td><th>Location</th><td> ${location} </td>
												
								</tr> 
								</form>
								<tr>
									<td></td><th>State Message</th><td> ${state} </td>
								</tr>                	
								<tr>
									<td></td><th>Registered Time</th><td> ${since} </td>
									</tr>
							</table>
                        </form>
                        </div>
					</div>
				</div>
			</div>
                        <!-- /.panel-body -->
                        
                        
                        
                   
                    <!-- /.panel -->
     
            <!-- /.row -->
        <!-- /#page-wrapper -->  
      
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

