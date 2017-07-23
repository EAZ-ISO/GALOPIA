<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE HTML> 
  <html lang="en"> 
  <head> 
    <meta charset="utf-8"> 
    <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
    <meta name="viewport" content="width=device-width, initial-scale=1"> 
    <title>Sign In</title>
		<!-- Bootstrap -->
    <link href="<s:url  value="/UI-template/assets/css/bootstrap.min.css" />" rel="stylesheet"> 
    <!-- slimscroll -->
		<link href="<s:url value="/UI-template/assets/css/jquery.slimscroll.css" />" rel="stylesheet"> 
    <!-- project --> 
    <link href="<s:url value="/UI-template/assets/css/project.css" />" rel="stylesheet"> 
    <!-- dataTables --> 
    	<link href="<s:url value="/UI-template/assets/css/buttons.dataTables.min.css" />" rel="stylesheet">
		<link href="<s:url value="/UI-template/assets/css/dataTables.bootstrap.min.css" />" rel="stylesheet"> 
    <link href="<s:url value="/UI-template/assets/css/responsive.dataTables.min.css" />" rel="stylesheet"> 
    <link href="<s:url value="/UI-template/assets/css/fixedHeader.dataTables.min.css" />" rel="stylesheet"> 
    <!-- dashboard3-->
    <link href="<s:url value="/UI-template/assets/css/dashboard3.css" />" rel="stylesheet">> 
    <!-- Fontes --> 
    <link href="<s:url value="/UI-template/assets/css/font-awesome.min.css" />"	rel="stylesheet"> 
    <link href="<s:url value="/UI-template/assets/css/simple-line-icons.css" />" rel="stylesheet"> 
    <!-- buttons css -->
		<link href="<s:url value="/UI-template/assets/css/buttons.css" />" rel="stylesheet"> 
    <!-- main css --> 
    <link href="<s:url value="/UI-template/assets/css/main.css" />" rel="stylesheet"> 
    <!-- light Themes css --> 
    <link href="<s:url value="/UI-template/assets/css/light.css" />" rel="stylesheet"> 
    <!--media css --> 
    <link href="<s:url value="/UI-template/assets/css/main.media.css" />" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries --> 
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// --> 
    <!--[if lt IE 9]> 
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js">
    </script>
		<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script> 
    <![endif]--> 
    </head>
<body class="login-layout-full login">
<div class="page-brand-info">
  <div class="brand"> <img class="brand-img" src="<s:url value="/UI-template/assets/images/w-logo.png"/>" alt="..."> </div>
  <p class="font-size-20"><s:text name="galopia.description"/></p>
</div>
<div class="loginColumns ">
  <div>
    <h1 class="logo-name"><s:text name="galopia.name"/></h1>
  </div>
  <h3><s:text name="galopia.welcome"/></h3>
  <p><s:text name="galopia.about"/></p>
  <p><s:text name="galopia.access"/></p>
  <form action="/Galopia/login" method="POST" class="top15">
    <div class="form-group">
      <input name="username" required="" placeholder="Username" class="form-control" type="text">
    </div>
    <div class="form-group">
      <input name="password" required="" placeholder="Password" class="form-control" type="password">
    </div>
    <button class="btn green block full-width bottom15" type="submit">Login</button>
    <a href="forgot_password.html"><small><s:text name="galopia.forgot.pwd"/></small></a>
    <p class="text-muted text-center"><small><s:text name="galopia.no.account"/></small></p>
    <s:a namespace="/user" action="register" cssClass="btn btn-sm btn-white btn-block">Create an account</s:a>
  </form>
  <p class=" copyR"> <small>OKTeam, Galopia &copy; 2016-2017</small> </p>
</div>
</body>
</html>
