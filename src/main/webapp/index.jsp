<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body style="background-color:powderblue;">
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3 mt-3">
				<div class="card">
				  <div class="card-header text-center fs-3">
				     Employee Registration Form!
				  </div>
				  <%
				  String msg = (String)session.getAttribute("msg");
				  
				  if(msg !=null){
				  %>
					 <p class="text-center fs-4 text-success"><%=msg%></p> 
				  <%
				  }
				  session.removeAttribute("msg");
				  %>
					<div class="card-body">
						<form action="register" method="post">
							<div class="mb-3">
								<label for="name" class="form-label">Name</label> 
								<input type="text" class="form-control" id="name" name="name"/>
							</div>
							<div class="mb-3">
								<label for="emial" class="form-label">Email</label> 
								<input type="email" class="form-control" id="emial" name="email"/>
							</div>
							<div class="mb-3">
								<label for="department" class="form-label">Department</label> 
								<input type="text" class="form-control" id="department" name="department"/>
							</div>
							<div class="mb-3">
								<label for="password" class="form-label">Password</label> 
								<input type="password" class="form-control" id="password" name="password"/>
							</div>
					
							<div class="text-center"><button type="submit" class="btn btn-primary">Submit</button></div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>