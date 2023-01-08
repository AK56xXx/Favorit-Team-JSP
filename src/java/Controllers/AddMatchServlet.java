/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.MatchCRUD;
import Models.Match;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mega
 */
public class AddMatchServlet extends HttpServlet {

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
        
        
        String date = request.getParameter("date");
        String heure = request.getParameter("heure");
        String equipe1 = request.getParameter("Equipe1");
        String equipe2 = request.getParameter("Equipe2");
        int score1 =Integer.parseInt( request.getParameter("score1"));
        int score2 =Integer.parseInt( request.getParameter("score2"));
        String etat = request.getParameter("etat");
        
        
        MatchCRUD objet = new MatchCRUD();
     
        Match m = new Match();
        m.setDate(date);
        m.setHeure(heure);
        m.setEquipe_h(equipe1);
        m.setEquipe_v(equipe2);
        m.setNb_eh(score1);
        m.setNb_ev(score2);
        m.setEtat(etat);
        
        
       objet.addMatch(m);
       System.out.println("ok");
          response.sendRedirect("/EquipeFav/adminindex.jsp");
        
        
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
