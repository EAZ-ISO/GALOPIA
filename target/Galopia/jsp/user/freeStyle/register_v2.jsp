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
    <title>Sign Up</title>
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
  <div class="brand"> <img class="brand-img" src="assets/images/w-logo.png" alt="..."> </div>
  <p class="font-size-20">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
    tempor incididunt ut labore et dolore magna aliqua.</p>
</div>
<div class="loginColumns ">
  <div>
    <h1 class="logo-name">A-BAG</h1>
  </div>
  <h3>Register to Admin-Bag</h3>
  <p>Create account to see it in action.</p>
  <form action="login.html"  class="m-t">
    <div class="form-group">
      <input type="text" required="" placeholder="Name" class="form-control">
    </div>
    <div class="form-group">
      <input type="email" required="" placeholder="Email" class="form-control">
    </div>
    <div class="form-group">
      <input type="password" required="" placeholder="Password" class="form-control">
    </div>
    <div class="form-group">
      <div class="i-checks">
        <input type="checkbox" class="iCheck" indeterminate="true">
        Agree the terms and policy </div>
    </div>
    <button class="btn green block full-width m-b" type="submit">Register</button>
    <p class="text-muted text-center"><small>Already have an account?</small></p>
    <a href="login_v2.html" class="btn btn-sm btn-white btn-block">Login</a>
  </form>
  <p class=" copyR"> <small>Admin-Bag is easy to use and customize &copy; 2016-2017</small> </p>
</div>
</body>
<!-- Go top -->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<s:url  value="/UI-template/assets/js/vendor/jquery.min.js" />"></script>
<!-- icheck -->
<script src="<s:url  value="/UI-template/assets/js/vendor/icheck.js" /> "></script>
<!-- bootstrap js -->
<script src="<s:url  value="/UI-template/assets/js/vendor/bootstrap.min.js" /> "></script>
<!-- pace js -->
<script src="<s:url  value="/UI-template/assets/js/vendor/pace/pace.min.js" /> "></script>
<!-- main js -->
<script src="assets/js/main.js"></script>
<script>
        $(document).ready(function(){
            $('.i-checks').iCheck({
                checkboxClass: 'icheckbox_square-green',
                radioClass: 'iradio_square-green',
            });
        });
    </script>
</html>
