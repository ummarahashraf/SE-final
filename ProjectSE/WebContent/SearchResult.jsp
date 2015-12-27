<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta charset="utf-8">
<meta name="generator" content="Bootply" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<link href="clean1/css/bootstrap.min.css" rel="stylesheet">
	
		<link href="clean1/css/styles.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-static">
    <div class="container">
      <a class="navbar-toggle" data-toggle="collapse" data-target=".nav-collapse">
        <span class="glyphicon glyphicon-chevron-down"></span>
      </a>
      <div class="nav-collapse collase">
        <ul class="nav navbar-nav">  
          <li><a href="welcome.jsp">Home</a></li>
       
		  <!-- <li><a href="facts.html">Blood Facts</a></li>
		    <li><a href="tips.html">Blood Tips</a></li>-->
		     <li><a href="logout.jsp">Logout</a></li>
			 <li><a href="contact.html">Contact us</a></li>
        </ul>
       
      </div>		
    </div>
</nav><!-- /.navbar -->

<header class="masthead">
  <div class="container">
    <div class="row">
      <div class="col col-sm-6">
        <h1><a href="#" title="scroll down for your viewing pleasure">Blood Donors</a>
          <p class="lead">Blood Donation and Saving One's life is worth sharing..!</p></h1>
      </div>
   
      </div>
    </div>
  
  <div class="container">
	<div class="row">
      <div class="col col-sm-12">
        
        <div class="panel">
        <div class="panel-body">
          <marquee>I continue to be a strong believer in the life-saving importance of early detection, and I encourage everyone to be proactive about their preventive screenings.</marquee>
        </div>
        </div>
        
      </div>
  	</div>
  </div>
</header>

<!-- Begin Body -->
<div class="container">  
			  <table class="table table-hover" border=1>
			    <thead>
			      <tr>
			      	<th>UserID</th><br>
			        <th>User</th><br>
			        <th>Full Name</th><br>
			        <th>City</th><br>
			        <th>email</th><br>
			        <th>blood</th>
			      </tr>
			    </thead>
			   <tbody>
                           
                            
                                <c:forEach items="${searchResult}" var="hm">
                                	<tr>
                                        <td><c:out value="${hm.userID}"/></td>
                                        <td><c:out value="${hm.user}"/></td>
                                        <td><c:out value="${hm.fname}"/></td>
                                        <td><c:out value="${hm.city}"/></td>
                                       <!-- <td><c:out value="${hm.email}"/></td>-->
                                        <td><c:out value="${hm.blood}"/></td>  
                                      <td><a href="SearchController?type=contact&email=<c:out value="${hm.email}"/>&num=<c:out value="${hm.contact}"/>">Contact</a></td>
                                   <!-- 1 this is contact button which is sent on Searchcontroller contact -->
                                    </tr>
                                  </c:forEach>
                                  
                               
                             
                               
                 </tbody>
			  </table>


</div>


<!-- script references -->
		<script src="clean1/js/jquery.min.js"></script>
		<script src="clean1/js/bootstrap.min.js"></script>
		<script src="clean1/js/scripts.js"></script>
</body>
</html>