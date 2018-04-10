<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>首页-欢迎来到二手车网</title>

<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/img/cool.ico"
	media="screen" />
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<!-- 可选的Bootstrap主题文件（一般不使用） -->
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- 引入弹出悬浮登陆框 -->
<link href="${pageContext.request.contextPath}/css/login.css"
	rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/loginboxjs.js"></script>
</head>
<body>
<!-- 所有页面必须有 -->
	<!-- 登陆弹出框开始 -->
	<div class="login">
		<div class="login_title">
			<h3>登录会员</h3>
			<span><a href="javascript:void(0);" class="close-login">关闭</a></span>
		</div>
		<form action="${pageContext.request.contextPath}/user/login.action" name="f" method="post">

			<div class="login_input">
				<span class="u_user"></span> <input name="userNetworkName"
					class="text" style="color: #FFFFFF !important" type="text"
					placeholder="请输入账户">
			</div>

			<div class="login_input">
				<span class="us_uer"></span> <input name="userPassword" class="text"
					style="color: #FFFFFF !important; position: absolute; z-index: 100;"
					value="" type="password" placeholder="请输入密码">
			</div>
			<div class="login_button">

				<input type="submit" class="submit" style="color: #FFFFFF"
					value="登录">
			</div>
		</form>
		<a href="javascript:void(0);" onclick="hide11();return false;"
			style="color: #000000">还没账号？点击注册</a>
	</div>
	<div class="login-bg"></div>
	<!-- 登陆框结束 -->
	<div class="container">
		<!-- /*顶部*/ -->
		<div class="row clearfix">
			<div class="col-md-12 column">
				<nav class="navbar navbar-default navbar-fixed-top"
					role="navigation">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span><span
								class="icon-bar"></span><span class="icon-bar"></span><span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#">二手车</a>
					</div>
					<div class="collapse navbar-collapse"
						id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li class="active"><a href="${pageContext.request.contextPath}/hyperlink/index.action">首页</a></li>													
							<li><a href="${pageContext.request.contextPath}/hyperlink/addcars.action">我要卖车</a></li>							
							<li><a href="${pageContext.request.contextPath}/hyperlink/searchcars.action">我要买车</a></li>
							<li><a href="${pageContext.request.contextPath}/hyperlink/forum.action">论坛</a></li>
							<li><a href="${pageContext.request.contextPath}/hyperlink/staging.action">我要分期</a></li>
							<li><a href="${pageContext.request.contextPath}/hyperlink/valuation.action">估值</a></li>
							<li><a href="${pageContext.request.contextPath}/hyperlink/service.action">服务保障</a></li>
							<li><a href="${pageContext.request.contextPath}/hyperlink/carnews.action">汽车资讯</a></li>					</ul>
						<form class="navbar-form navbar-left" role="search">
							<div class="form-group">
								<input type="text" class="form-control" />
							</div>
							<button type="submit" class="btn btn-default">搜索</button>
						</form>
						<ul class="nav navbar-nav navbar-right">
							<!-- 网页顶部选择显示，检测session是否存在，显示不同 -->
							<c:if test="${user.userNetworkName==null}">
								<li id=""><a href="javascript:void(0);"
									onclick="hide11();return false;">还没账号？点击注册</a></li>
							</c:if>
							<c:if test="${user.userNetworkName!=null}">
								<li id=""><a href="#">欢迎登录，${user.userNetworkName}</a></li>
							</c:if>
							<!-- 选择结束 -->
							<!-- 用户不存在 -->
							<c:if test="${user.userNetworkName==null}">
								<li class="login1"><a href="javascript:void(0);"
									class="dropdown-toggle" data-toggle="dropdown"> 点击登录 </a></li>
							</c:if>
							<!-- 用户存在 -->
							<c:if test="${user.userNetworkName!=null}">
								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown"> 我的账户 <strong class="caret"></strong>
								</a>
									<ul class="dropdown-menu">
										<li><a href="${pageContext.request.contextPath}/hyperlink/personalpage.action">个人主页</a></li>
										<li><a href="${pageContext.request.contextPath}/hyperlink/release.action">我的发布</a></li>
										<li><a href="${pageContext.request.contextPath}/hyperlink/order.action">我的订单</a></li>										
										<li class="divider"></li>
										<li><form name="logout"
												action="${pageContext.request.contextPath}/user/logout.action">
											</form></li>
										<li><a href="javascript:void(0)" onclick="logout.submit()">注销</a></li>	
									</ul></li>
							</c:if>
						</ul>
					</div>

				</nav>
			</div>
		</div>
		<div class="pd"></div>	
	</div>
<!-- 所有页面必须有结束 -->
</body>
</html>