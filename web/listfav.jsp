<%@page import="Models.Favoris"%>
<%@page import="DAO.FavorisCRUD"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="Models.Match"%>
<%@page import="Models.Match"%>
<%@page import="DAO.MatchCRUD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">



<%@ include file="navbar.jsp" %>







<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://bootswatch.com/4/cosmo/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        <form>

            <%Integer idu = (Integer) session.getAttribute("id");%>




            <div class="container">
                <h1>Liste des Equipes Favoris</h1>

                <table class="table">
                    <thead>
                        <tr>
                        <th>ID Favoris</th>
                        <th>ID User</th>
                        <th>Equipe</th>

                        </tr>
                    </thead>


                    <tbody>
                        <%
                            FavorisCRUD sc = new FavorisCRUD();
                            List<Favoris> liste = new ArrayList<Favoris>();
                            liste = sc.getAllFav(idu);
                            for (Favoris l : liste) {
                        %>
                        <tr>
                        <td><%=l.getIdf()%></td>
                        <td><%=l.getIdu()%></td>
                        <td><%=l.getEquipe()%></td>

                        <td>
                            <a href="delfav.jsp?idf=<%=l.getIdf()%>&e=<%=l.getEquipe()%>"  class="btn btn-dark">Delete</a>

                        </td>
                        </tr>
                        <% }%>

                        <tr>
                        <td>
                            <a href="index.jsp">Return</a>
                        </td>
                        </tr>



                    </tbody>

                </table>






            </div>




































        </form>

    </body>  
</html>
