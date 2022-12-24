<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/miestilo.css">
</head>
<body>
Hola ${param.nombreAlumno} . Bienvenido 

<p> <br>

<h2>Atencion a todos </h2>

${mensajeClaro }
</p>

<img alt="foto" src="${pageContext.request.contextPath}/recursos/img/casa.png" style="width: 30px"> 
</body>
</html>