<%@page import="Models.Equipe"%>
<%@page import="DAO.EquipeCRUD"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.MatchCRUD"%>
<%@page import="java.util.List"%>
<%@page import="Models.Match"%>
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
        <form>

              
        <div class="container">
        <h1>Liste des Equipes</h1>
        <br>
        <a href="add_e.jsp"  class="btn btn-success">Ajouter Equipe</a>
        <hr>
        
        <table class="table">
        <thead>
            <tr>
                <th>ID Equipe</th>
                <th>Nom Equipe</th>
                <th>Ville</th>
                <th>Pays</th>             
            </tr>
        </thead>
        
        <%
            
            
        %>
        <tbody>
            <%
              EquipeCRUD sc = new EquipeCRUD();
              List<Equipe> liste = new ArrayList<Equipe>();
              liste = sc.getAllEquipes();
              for(Equipe e : liste){
             %>
            <tr>
                <td><%=e.getIde()%></td>
                <td><%=e.getNom_e()%></td>
                <td><%=e.getVille()%></td>
                <td><%=e.getPays()%></td>
                
                <td>
                 <a href="edit_e.jsp?ide=<%=e.getIde()%>"  class="btn btn-light">Edit</a>
                 <a href="delete_e.jsp?ide=<%=e.getIde()%>"  class="btn btn-danger">Delete</a>
           
                </td>
            </tr>
             <% } %>
             
             
        
            
       
        </tbody>
        
    </table>

        
        
        
        
        
        
        
           <% 
          
         
          
         
         
       
       
           %>
        
     
        
        
         </div>
             


        </form>
    </body>
    
 

</html>
