<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
		<title>Index</title>
		<style>
		#action-box {
			widt 300px;
			padding: 20px;
			margin: 100px auto;
			background: #fff;
			-webkit-border-radius: 2px;
			-moz-border-radius: 2px;
			border: 1px solid #000;
		}
		#menu {
			widt100%;overflow: auto;padding: 10px 0px;
		} 
		#menu #left-menu {
			float: left; widt 50%; text-align: left;
		} 
		#menu #right-menu {
			float: right; widt 50%; text-align: right;
		} 
		.menu-item {
			padding-left: 1em;
		}
		</style>
	</head>
	<body>
		<div id="menu">
			<div id="left-menu">
				Index
			</div>
			<div id="right-menu">
				<a href="/logout" class="menu-item">Log-out</a>
			</div>
		</div>
		<div id="action-box">
			<spring:url value="/create/user/index" var="createUserUrl" />

			<form:form class="form-horizontal" method="post" modelAttribute="userForm" action="${createUserUrl}">
				<label for="username">Enter name :</label>
				<input type="text" id="username" name="username" value="abc" />
				<input type="submit" id="submit" value="Submit" />
			</form:form>
		</div>
	</body>
</html>