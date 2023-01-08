/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Match;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AK
 */
public class MatchCRUD implements MatchInterface{
  DbConnect c = new DbConnect();
 @Override
    public List<Match> getAllMatch() {
   
    Connection con = c.getConn();
       String sql = "select * from tmatch";
       PreparedStatement ps;
       List<Match> list =new ArrayList<Match>();
       try{
           ps = (PreparedStatement) con.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next())
           {
               int idm = rs.getInt("idmatch");
               String date = rs.getString("date");
               String heure = rs.getString("heure");
               String equipe1_h = rs.getString("equipe1_h");
               String equipe2_v = rs.getString("equipe2_v");
               int nb_eh =rs.getInt("ndb_e1");
               int nb_ev=rs.getInt("ndb_e2");
               
               String etat = rs.getString("etat");
               list.add(new Match(idm,date,heure,equipe1_h,equipe2_v,nb_eh,nb_ev,etat));
               
               System.out.println("test");
             
               
           
           
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
       return list;
    }

    @Override
    public List<Match> getAllMatch(int id) {
       
        
       Connection con = c.getConn();
       String sql = "select * from tmatch where idmatch="+id;
       PreparedStatement ps;
       List<Match> list =new ArrayList<Match>();
       try{
           ps = (PreparedStatement) con.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next())
           {
               int idm = rs.getInt("idmatch");
               String date = rs.getString("date");
               String heure = rs.getString("heure");
               String equipe1_h = rs.getString("equipe1_h");
               String equipe2_v = rs.getString("equipe2_v");
               int nb_eh =rs.getInt("ndb_e1");
               int nb_ev=rs.getInt("ndb_e2");
               
               String etat = rs.getString("etat");
               list.add(new Match(idm,date,heure,equipe1_h,equipe2_v,nb_eh,nb_ev,etat));
               
               System.out.println("test");
             
               
           
           
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
       return list;
        
        
        
        
        
    }

    @Override
    public void addMatch(Match m) {
        Connection con = c.getConn();
       String sql = "INSERT INTO tmatch(date,heure,equipe1_h,equipe2_v,ndb_e1,ndb_e2,etat)  values(?,?,?,?,?,?,?);";
       PreparedStatement ps;
       try{
           ps = (PreparedStatement) con.prepareStatement(sql);
           ps.setString(1, m.getDate());
           ps.setString(2, m.getHeure());
           ps.setString(3, m.getEquipe_h());
           ps.setString(4, m.getEquipe_v());
           ps.setInt(5, m.getNb_eh());
           ps.setInt(6, m.getNb_ev());
           ps.setString(7, m.getEtat());
           ps.executeUpdate();
          
               con.close();
 
       }catch (SQLException e){
           e.printStackTrace();
       }
       System.out.println("serv");
    }

    @Override
    public void updateMatch(Match m) {
        Connection con = c.getConn();
       String sql = "UPDATE tmatch SET date = ? , heure = ? , equipe1_h = ? , equipe2_v = ? , ndb_e1 = ? , ndb_e2 = ? , etat= ? WHERE idmatch = ?;";
       PreparedStatement ps;
       try{
           ps = (PreparedStatement) con.prepareStatement(sql);
           ps.setString(1, m.getDate());
           ps.setString(2, m.getHeure());
           ps.setString(3, m.getEquipe_h());
           ps.setString(4, m.getEquipe_v());
           ps.setInt(5, m.getNb_eh());
           ps.setInt(6, m.getNb_ev());
           ps.setString(7, m.getEtat());
           ps.setInt(8, m.getIdm());

           ps.executeUpdate();
          
               con.close();
 
       }catch (SQLException e){
           e.printStackTrace();
       }
        
    }
    
    
    

    @Override
    public void deleteMatch(int id) {
       
        
       Connection con = c.getConn();
       String sql = "delete from tmatch where idmatch= ? ;";
       PreparedStatement ps;
       try{
           ps = (PreparedStatement) con.prepareStatement(sql);
           ps.setInt(1, id);
           
           ps.executeUpdate();
          
               con.close();
              
           
           
          
       }catch (SQLException e){
       }
        
        
        
    }

    
    


 

    
}
