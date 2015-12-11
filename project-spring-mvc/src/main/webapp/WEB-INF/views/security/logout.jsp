<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
		<title>Denied</title>
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
			width:100%;overflow: auto;padding: 10px 0px;
		} 
		#menu #left-menu {
			float: left; width: 50%; text-align: left;
		} 
		#menu #right-menu {
			float: right; width: 50%; text-align: right;
		} 
		.menu-item {
			padding-left: 1em;
		}
		</style>
	</head>
	<body>
		<div id="menu">
			<div id="left-menu">
				Denied
			</div>
			<div id="right-menu">
				<a href="/login" class="menu-item">Log-in</a>
				<a href="/welcome" class="menu-item">Go to welcome</a>
			</div>
		</div>
	</body>
</html>
