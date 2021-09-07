<!DOCTYPE html>
<%@ page session="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Application</title>
</head>
<body>
	<h1>Product Application</h1>
	<h3>${param.msg}</h3>
	<!-- <a href="products">Get Products</a> <br /> -->
	<a href="getProducts.do">Get all products</a> <br />
	<a href="productform.html">Add a Product</a> <br />
	<a href="logout.do">Logout</a>
</body>
</html>