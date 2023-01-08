<%@page import="java.sql.SQLException"%>
<%@page import="DAO.DbConnect"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
        <form method="post" action="/EquipeFav/EditEquipeServlet"> 
            
                     <% 
          
          int idx = Integer.parseInt(request.getParameter("ide"));
          
             
           %>
        <div class="container">
        <h1>Edit Equipe</h1>
        
        
        <table class="table">
            <%  EquipeCRUD xc = new EquipeCRUD();
              List<Equipe> liste = new ArrayList<Equipe>();
              liste = xc.getAllequipe(idx);
              for(Equipe l : liste){ %>
            
              <tr>
                  <th>Nom Equipe: <input type="text" name="nome" value="<%=l.getNom_e()%>" </th>
              </tr>
            
            <tr>
                <th>Ville: <input type="text" name="ville" value="<%=l.getVille()%>" </th>
            </tr>
           
            <tr>
            <th>Pays:  <input type="text" name="pays" value="<%=l.getPays()%>" </th>
            </tr>
            
            <input type="hidden" name="idz" value="<%=l.getIde()%>">
            <%}%>
            
             <tr>
                 <th><input type="submit" value="Update"</th>
            </tr
            
         
            
        </table>

        
            

        </form>
    </body>
    
 

</html>
