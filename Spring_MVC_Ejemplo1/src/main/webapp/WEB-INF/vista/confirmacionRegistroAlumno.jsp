<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmacion de registro</title>
</head>
<body>

EL alumno con nombre <strong>${elAlumno.nombre}</strong>  y apellido <strong>${elAlumno.apellido }</strong>  y edad  <strong>${elAlumno.edad }</strong>  
correo <strong>${elAlumno.email}</strong> y Cpostal <strong>${elAlumno.codigoPostal}</strong> se ha registrado con exito
<br/>

La asignatura escogida es: ${elAlumno.optativa}
<br/>
La provincia donde iniciara los estudios es ${elAlumno.ciudadEstudios}
<br/>

Los idiomas escogidos por el alumno son ${elAlumno.idiomasAlumno }

</body>
</html>