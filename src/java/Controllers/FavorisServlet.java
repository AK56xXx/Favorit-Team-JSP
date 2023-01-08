/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.FavorisCRUD;
import Models.Favoris;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mega
 */
public class FavorisServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
   
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
        HttpSession session = request.getSession(true);
        String email = ( String) session.getAttribute("email");
        int id = (int)session.getAttribute("id");
            if(email == null){
                request.getRequestDispatcher("/login.jsp").forward(request, response);

            }else{
                Integer idu=(Integer)session.getAttribute("id");
                String equipe= request.getParameter("equipe");
                Favoris fa = new Favoris();
                FavorisCRUD fc = new FavorisCRUD(); 
                fa.setIdu(idu);
                fa.setEquipe(equipe);
                fc.addFav(fa);
                
                
                
                
                //  request.getRequestDispatcher("/listfav.jsp?equipe1="+request.getAttribute("equipe")+"&?idm="+request.getAttribute("m")).forward(request, response);
               // request.getRequestDispatcher("/test.jsp").forward(request, response);
                response.sendRedirect("listfav.jsp");
                
            }
            
            
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
        HttpSession session = request.getSession(true);
        String email = ( String) session.getAttribute("email");
        int id = (int)session.getAttribute("id");
            if(email == null){
                request.getRequestDispatcher("/login.jsp").forward(request, response);

            }else{
                  request.getRequestDispatcher("/listfav.jsp?idm="+request.getAttribute("idm")+"&idu="+request.getAttribute("id")).forward(request, response);
            }
        
        
        
        
        
        
        
        
        
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
