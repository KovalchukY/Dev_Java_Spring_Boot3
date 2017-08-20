<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<title>Cargo</title>
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
      <li class="nav-item active">
        <a class="nav-link disabled" href="/admin/cargo">Cargo</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="/admin/owner">Owner</a>
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
				<form action="/admin/cargo" method="POST">
					<div class="form-group row">
						<label class="col-2 col-form-label">Goods:</label>
						<div class="col-10">
							<select name="goods" class="form-control">
								<c:forEach var="goods" items="${goodss}">
									<option value="${goods}">${goods}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label">Weight:</label>
						<div class="col-10">
							<input name="weight" class="form-control"> 
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label">Height:</label>
						<div class="col-10">
							<input name="height" class="form-control"> 
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label">Width:</label>
						<div class="col-10">
							<input name="width" class="form-control"> 
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label">Length:</label>
						<div class="col-10">
							<input name="length" class="form-control"> 
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label">City from:</label>
						<div class="col-10">
							<select name="cityFrom" class="form-control">
								<c:forEach var="city" items="${cities}">
									<option value="${city}">${city}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label">City to:</label>
						<div class="col-10">
							<select name="cityTo" class="form-control">
								<c:forEach var="city" items="${cities}">
									<option value="${city}">${city}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label">Price:</label>
						<div class="col-10">
							<input name="price" class="form-control"> 
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
						<th class="text-center">Goods</th>
						<th class="text-center">Weight</th>
						<th class="text-center">Height</th>
						<th class="text-center">Width</th>
						<th class="text-center">Length</th>
						<th class="text-center">City from</th>
						<th class="text-center">City to</th>
						<th class="text-center">Price</th>
						<th class="text-center">Options</th>
					</tr>
					<c:forEach var="cargo" items="${cargos}">
						<tr>
							<td>${cargo.goods}</td>
							<td>${cargo.weight}</td>
							<td>${cargo.height}</td>
							<td>${cargo.width}</td>
							<td>${cargo.length}</td>
							<td>${cargo.cityFrom}</td>
							<td>${cargo.cityTo}</td>
							<td>${cargo.price}</td>
							<td class="text-center">
								<a href="/admin/cargo/update/${cargo.id}" class="btn btn-outline-warning btn-sm">Update</a>
								<a href="/admin/cargo/delete/${cargo.id}" class="btn btn-outline-danger btn-sm">Delete</a>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>