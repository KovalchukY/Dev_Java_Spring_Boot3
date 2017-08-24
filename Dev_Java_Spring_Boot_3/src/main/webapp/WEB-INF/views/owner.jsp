<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<title>Owner</title>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
  <a class="navbar-brand" href="/admin/">Admin</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
          <a class="nav-link" href="/admin/brand">Brand <span class="sr-only">(current)</span></a>
             </li>
      <li class="nav-item">
        <a class="nav-link" href="/admin/city">City </a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="/admin/goods">Goods</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="/admin/model">Model</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="/admin/cargo">Cargo</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link disabled" href="/admin/owner">Owner</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="/admin/transporter">Transporter</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>

	<div class="container">
		<div class="row">
			<div class="col-12">
				<form action="/admin/owner" method="POST">
				
				   <div class="form-group row">
						<label class="col-2 col-form-label">Name:</label>
						<div class="col-10">
							<input name="name" class="form-control"> 
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label">Phone:</label>
						<div class="col-10">
							<input name="phone" class="form-control"> 
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label">Count:</label>
						<div class="col-10">
							<input name="count" class="form-control"> 
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label">Address:</label>
						<div class="col-10">
							<input name="address" class="form-control"> 
						</div>
					</div>
					
					<div class="form-group row">
						<div class="col-10 offset-sm-2">
        					<button type="submit" class="btn btn-outline-success btn-sm">Save</button>
      					</div>
					</div>
				</form>
			</div>
		</div>
		<div class="row">
			<div class="col-12">
				<table class="table table-bordered">
					<tr>
					    <th class="text-center">Name</th>
						<th class="text-center">Phone</th>
						<th class="text-center">Count</th>
						<th class="text-center">Address</th>
						<th class="text-center">Options</th>
					</tr>
					<c:forEach var="owner" items="${owners}">
						<tr>
						    <td>${owner.name}</td>
							<td>${owner.phone}</td>
							<td>${owner.count}</td>
							<td>${owner.address}</td>
							<td class="text-center">
								<a href="/admin/owner/update/${owner.id}" class="btn btn-outline-warning btn-sm">Update</a>
								<a href="/admin/owner/delete/${owner.id}" class="btn btn-outline-danger btn-sm">Delete</a>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>