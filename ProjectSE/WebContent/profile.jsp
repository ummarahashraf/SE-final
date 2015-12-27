<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta charset="utf-8">
<meta name="generator" content="Bootply" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="clean1/css/bootstrap.min.css" rel="stylesheet">

<link href="clean1/css/styles.css" rel="stylesheet">
<title>Insert title here</title>
</head>


<body>
	<nav class="navbar navbar-static">
	<div class="container">
		<a class="navbar-toggle" data-toggle="collapse"
			data-target=".nav-collapse"> <span
			class="glyphicon glyphicon-chevron-down"></span>
		</a>
		<div class="nav-collapse collase">
			<ul class="nav navbar-nav">
				<li><a href="welcome.jsp">Home</a></li>
				<li><a href="edit.html">Edit</a></li>
				<!--   <li><a href="facts.html">Blood Facts</a></li>
		    <li><a href="tips.html">Blood Tips</a></li>-->
				<li><a href="logout.jsp">Logout</a></li>
			</ul>

		</div>
	</div>
	</nav>
	<!-- /.navbar -->

	<h1>
		<a href="#" title="scroll down for your viewing pleasure">Information</a>
	</h1>
<%-- 	<%	UserModel um = new UserModel();
		um = (UserModel)session.getAttribute("userInfo");		
				
	%> --%>
	<header class="masthead">
	<table class="table table-hover">
		<thead>
			<tr>
				<th>User</th>
				<th>Full Name</th>
				<th>City</th>
				<th>email</th>
				<th>Contact</th>
			</tr>
		</thead>
		<tbody>

			
		




		</tbody>
	</table>


<!-- 
	<div class="container">
		<form class="form-horizontal" role="form"
			action="Controller?action=info">
			<div class="form-group">
				<div class="dropdown">
					<button class="btn btn-primary dropdown-toggle" type="button"
						data-toggle="dropdown">
						Blood Banks <span class="caret"></span>
					</button>
					<ul class="dropdown-menu">
						<li><a href="#"></a></li>
						
						<li><a href="#">Agha Khan Hospital</a></li>
						<li><a href="#">Hussaini Hospital</a></li>
					</ul>
				</div>
			</div>
	</div>
 -->
 <!-- 	<div class="form-group">
		<div class="dropdown">
			<button class="btn btn-primary dropdown-toggle" type="button" name=""
				data-toggle="dropdown">
				Register As <span class="caret"></span>
			</button>
			<ul class="dropdown-menu">
				<li><a href="#">Donor</a></li>
				<li><a href="#">Seeker</a></li>
			</ul>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Submit</button>

				</div>
			</div>
		</div>
	</div>
 -->

	</header>

	<!-- script references -->
	<script src="clean1/js/jquery.min.js"></script>
	<script src="clean1/js/bootstrap.min.js"></script>
	<script src="clean1/js/scripts.js"></script>
</body>
</html>