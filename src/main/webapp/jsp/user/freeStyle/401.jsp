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
    <title>401 - Forbidden</title>
		<!-- Bootstrap -->
    <link href="<s:url value="/UI-template/assets/css/bootstrap.min.css" />" rel="stylesheet"> 
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
    <link href="<s:url value="/UI-template/assets/css/dashboard3.css" />" rel="stylesheet">
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
<body class="gray-bg ">
<div class="middle-box text-center  error-wrapper">
  <h1 class="head">401</h1>
  <h3 class="font-bold">Forbidden</h3>
  <div class="error-desc"> Sorry, but the page you are looking for has note been found. Try checking the URL for error, then hit the refresh button on your browser or try found something else in our app.
  </div>
</div>
<!-- /error-wrapper -->
<div class="error-page-footer">
  <div class="error-container">
    <ul class="footer-links">
      <li><a href="#">E-commerce Pages</a></li>
      <li><a href="#">Gallery  Pages</a></li>
      <li><a href="#">Apps Pages</a></li>
      <li><a href="#">User Pages</a></li>
      <li><a href="#">Search Page</a></li>
    </ul>
    <br>
    <ul class="footer-links small-links">
      <li><a href="#">Dashboard</a></li>
      <li><a href="#">UI Features </a></li>
      <li><a href="#">Components</a></li>
      <li><a href="#">Tables</a></li>
      <li><a href="#">Charts</a></li>
      <li><a href="#">Maps</a></li>
      <li><a href="#">Mailbox </a></li>
    </ul>
    <br>
    <div class="copyright"> All work <strong>Copyright</strong> AdminBag Company © 2017 </div>
  </div>
</div>
<!-- /error-page-footer -->
</body>
</html>
