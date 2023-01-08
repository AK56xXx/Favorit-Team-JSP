<%@page import="java.util.ArrayList"%>
<%@page import="DAO.MatchCRUD"%>
<%@page import="java.util.List"%>
<%@page import="Models.Match"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="navbar.jsp" %>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://bootswatch.com/4/cosmo/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
     
    </style>
    <body>
        <form>

              
        <div class="container">
        <h1>Liste des Match</h1>
        
        <table class="table">
        <thead>
            <tr>
                <th>Id</th>
                <th>Date</th>
                <th>Heure</th>
                <th>Equipe 1</th>
                <th>Equipe 2</th>
                <th>Score-</th>
                <th>-Score</th>
                <th>Etat</th>
            </tr>
        </thead>
        
        <%
            
            
        %>
        <tbody>
            <%
                 MatchCRUD sc = new MatchCRUD();
              List<Match> liste = new ArrayList<Match>();
              liste = sc.getAllMatch();
              for(Match l : liste){
             %>
            <tr>
                <td><%=l.getIdm()%></td>
                <td><%=l.getDate()%></td>
                <td><%=l.getHeure()%></td>
                <td><%=l.getEquipe_h()%></td>
                <td><%=l.getEquipe_v()%></td>
                <td><%=l.getNb_eh()%></td>
                <td><%=l.getNb_ev()%></td>
                <td><%=l.getEtat()%></td>
                <td>
                 <a href="favoris.jsp?idm=<%=l.getIdm()%>&idu=<%=session.getAttribute("id")%>&instance=<%=session.getId()%>"  class="btn btn-danger">Favoris</a>
           
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
