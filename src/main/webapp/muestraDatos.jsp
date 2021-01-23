<%-- 
    Document   : muestraDatos
    Created on : 22-ene-2021, 21:35:36
    Author     : David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Billete" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Muestra Datos</h1>
        <%  //Billete billete = (Billete) request.getAttribute("billete");
            request.getAttribute("billete");
       
            
        %>
        <h2>Numero Billetes: ${billete.cant}</h2>
        <h2>Fecha Vuelo: ${billete.fechaVuelo}</h2>
        <h2>Importe de billetes:${billete.importe}</h2>
      
        
        
        
    </body>
</html>
