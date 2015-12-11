<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
		<title>Welcome</title>
		<style>
		#action-box {
			width: 300px;
			padding: 20px;
			margin: 100px auto;
			background: #fff;
			-webkit-border-radius: 2px;
			-moz-border-radius: 2px;
			border: 1px solid #000;
		}
		
		#menu {
			width: 100%;
			overflow: auto;
			padding: 10px 0px;
		}
		
		#menu #left-menu {
			float: left;
			width: 50%;
			text-align: left;
		}
		
		#menu #right-menu {
			float: right;
			width: 50%;
			text-align: right;
		}
		
		.menu-item {
			padding-left: 1em;
		}
		</style>
	</head>
	<body>
		<div id="menu">
			<div id="left-menu">
				Login page
			</div>
			<div id="right-menu"></div>
		</div>
		
		<div id="action-box">
			<spring:url value="/login" var="loginUrl" />
			
			<form:form class="form-horizontal" method="post" modelAttribute="userForm" action="${loginUrl}">
				<label for="username">Username :</label>
				<input type="text" id="username" name="username" value="abc" />
				<label for="password">Password :</label>
				<input type="password" id="password" name="password" value="123" />
				<input type="submit" id="submit" value="Submit" />
			</form:form>
		</div>
	</body>
</html>