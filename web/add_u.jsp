<%@page import="java.util.ArrayList"%>
<%@page import="Models.User"%>
<%@page import="java.util.List"%>
<%@page import="DAO.UserCRUD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="navbar2.jsp" %>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://bootswatch.com/4/darkly/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
     
    </style>
    <body>
        <form method="post" action="/EquipeFav/AddUserServlet"> 
            
        
        <div class="container">
        <h1>Ajout User</h1>
        
        
        <table class="table">
            
            
             <tr>
                  <th>Nom: <input type="text" name="nom"</th>
             </tr>
            
            <tr>
                <th>Prenom: <input type="text" name="prenom"</th>
            </tr>
           
            <tr>
            <th>Email:  <input type="text" name="email"</th>
            </tr>
            
            <tr>
            <th>Password:  <input type="text" name="password"</th>
            </tr>
            
           
        
            
             <tr>
                 <th><input type="submit" value="Ajouter"</th>
            </tr
            
         
            
        </table>

        
            

        </form>
    </body>
    
 

</html>
