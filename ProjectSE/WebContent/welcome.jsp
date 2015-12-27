<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<meta name="generator" content="Bootply" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="clean1/css/bootstrap.min.css" rel="stylesheet">

<link href="clean1/css/styles.css" rel="stylesheet">
<title>welcome</title>
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
				<li><a href="#">Home</a></li>
				<!--   <li><a href="profile.jsp">Profile</a></li>
		   <li><a href="facts.html">Blood Facts</a></li>
		    <li><a href="tips.html">Blood Tips</a></li> -->
				<li><a href="contact.html">Contact us</a></li>
				<li><a href="profile.jsp">Profile</a></li>
				<li><a href="logout.jsp">Logout</a></li>
			</ul>
			<ul class="nav navbar-right navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Welcome <%=session.getAttribute("user") %></i></a>
					<ul class="dropdown-menu" style="padding: 12px;">

					</ul></li>

			</ul>

		</div>
	</div>
	</nav>
	<!-- /.navbar -->
	
	<form class="form-inline" action="SearchController">
		<div class="input-group">
			<input type="text" class="form-control" name="search"
				placeholder="Search"><BR>
			<div class="input-group-btn">
				<button type="submit" class="btn btn-default">
					GO</i>
				</button>
			</div>
			<div class="form-group">
				<label for="type">Search By: </label> <label class="radio-inline">
					<input type="hidden" name="action" value="search"> <input
					type="radio" required name="type" value="city">City
				</label> <label class="radio-inline"> <input type="radio" required
					name="type" value="blood">Blood
				</label>
			</div>
		</div>
	</form>
	<header class="masthead">
	<div class="container">
		<div class="row">
			<div class="col col-sm-6">
				<h1>
					<a href="#" title="scroll down for your viewing pleasure">Blood
						Donors</a>
					<p class="lead">Blood Donation and Saving One's life is worth
						sharing..!</p>
				</h1>
			</div>

		</div>
	</div>


	<div class="container">
		<div class="row">
			<div class="col col-sm-12">

				<div class="panel">
					<div class="panel-body">
						<marquee>I continue to be a strong believer in the
							life-saving importance of early detection, and I encourage
							everyone to be proactive about their preventive screenings.</marquee>
					</div>
				</div>

			</div>
		</div>
	</div>
	</header>

	<!-- Begin Body -->
	<!-- Begin Body -->
	<div class="container">
		<div class="row">
			<div class="col col-sm-3">
				<div id="sidebar">
					<ul class="nav nav-stacked">
						<!-- <li><h3 class="highlight">Channels <i class="glyphicon glyphicon-dashboard pull-right"></i></h3></li>
                  	<li><a href="#">Link</a></li>
          			<li><a href="#">Link</a></li> -->
					</ul>
					<div class="accordion" id="accordion2">
						<div class="accordion-group">
							<div class="accordion-heading">
								<!--   <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne">
                                Accordion
                            </a> -->
							</div>
							<div id="collapseOne" class="accordion-body collapse in">
								<div class="accordion-inner">
									<p></p>
								</div>
							</div>
						</div>
						<div class="accordion-group">
							<div class="accordion-heading">
								<!--     <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseTwo">
                                    Accordion
                                </a> -->
							</div>
							<div id="collapseTwo" class="accordion-body collapse">
								<div class="accordion-inner">
									<!--   <p>Use @media queries or utility classes to customize responsiveness.</p> -->
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col col-sm-9">
				<div class="panel">
					<h1></h1>

					<div class="row">
						<div class="col col-sm-8">
							<img src="clean1/img/img2.png" class="img-responsive">
						</div>

					</div>

				</div>
			</div>
		</div>
	</div>













	<!-- script references -->
	<script src="clean1/js/jquery.min.js"></script>
	<script src="clean1/js/bootstrap.min.js"></script>
	<script src="clean1/js/scripts.js"></script>
</body>
</html>