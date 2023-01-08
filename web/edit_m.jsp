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
        <form method="post" action="/EquipeFav/EditMatchServlet">               
                
                <% 
          
          int idm = Integer.parseInt(request.getParameter("idm"));
          
             
           %>


              
        <div class="container">
        <h1>Modifier Match</h1>
       
        
        <table class="table">
               <%
            
               MatchCRUD sc = new MatchCRUD();
              List<Match> liste = new ArrayList<Match>();
              liste = sc.getAllMatch(idm);
              for(Match l : liste){
            
            
            
            %>
            
            
            <tr>
                <th>Heure: <input type="text" name="date" value="<%=l.getDate() %>" </th>
            </tr>
            
            <input type="hidden" name="idz" value="<%=l.getIdm()%>">
            
            <tr>
                <th>Heure: <input type="text" name="heure" value="<%=l.getHeure()%>" </th>
            </tr>
            
            <%}%>
            
            <tr>
                <th>Equipe(Home):  <select name="Equipe1">
                             <%
              EquipeCRUD xc = new EquipeCRUD();
              List<Equipe> listee = new ArrayList<Equipe>();
              listee = xc.getAllEquipes();
              for(Equipe l : listee){
            %>
            <option><%=l.getNom_e() %></option>
            <%}%>
                    </select>
                
                </th>
               
            </tr>
            
            
            
            
            <tr>
                <th>Equipe(Visitor):  <select name="Equipe2">
                        
                                         <%
              EquipeCRUD gc = new EquipeCRUD();
              List<Equipe> listex = new ArrayList<Equipe>();
              listex = gc.getAllEquipes();
              for(Equipe l : listex){
            %>
                        
                        <option><%=l.getNom_e() %></option>
                        <%}%>
                    </select>
               
                </th>
                
            </tr>
            
            
                <%
            
               MatchCRUD vc = new MatchCRUD();
              List<Match> lister = new ArrayList<Match>();
              lister = vc.getAllMatch(idm);
              for(Match l : lister){
            
            
            
            %>
            
            <tr>
            <th>Score(E.H):  <input type="number" name="score1" value="<%=l.getNb_eh() %>" </th>
            </tr>
            
            <tr>
            <th>Score(E.V): <input type="number" name="score2" value="<%=l.getNb_ev() %>" </th>
            </tr>
            
            <tr>
            <th>Etat: <input type="text" name="etat" value="<%=l.getEtat()%>" </th>
            </tr>
            <%}%> 
            <tr>
                <th> <input type="submit" value="Update"> </th>
            </tr>
            
            
            
        
            
           
            
            
            
        </table>

        
        
        
        
        
        
        
           <% 
          
         
          
         
         
       
       
           %>
        
     
        
        
         </div>
             


        </form>
    </body>
    
 

</html>
