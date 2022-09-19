<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Welcome!</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<style>
	.center {	
		position: absolute;
   		top: 30%;
    	left: 50%;
   		transform: translate(-50%, -50%);
	}
	.footer {
		position: absolute;
		top: 50%;
		left: 50%;
   		transform: translate(-50%, -50%);
	}
</style>
</head>
<body class="d-flex h-100 text-center text-bg-dark">
	<div class="cover-container-sm d-flex w-100 h-100 p-3 mx-auto flex-column ">
		<main class="px-3 center">
			<h1>Welcome to the "Free~!"</h1>
			<p class="lead">This is a space where you can write all the articles you want with a free bulletin board.</p>
			<p class="lead">	  
			<a href="login.do" class="btn btn-lg btn-primary">LOGIN</a>			
		</main>	
		
		 <footer class="mt-auto text-white-50 row footer">
    	<p>The Creator of this Website <a href="#" class="text-white"> Lee</a></p>
  		</footer>
		
	</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</body>
</html>