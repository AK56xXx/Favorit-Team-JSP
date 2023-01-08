/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Favoris;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mega
 */
public class FavorisCRUD implements FavorisInterface {
    DbConnect c = new DbConnect();
    @Override
    public void addFav(Favoris fa) {
        
       Connection con = c.getConn();
       String sql = "insert into favoris(idu,equipe) values(?,?);";
       PreparedStatement ps;
       try{
           ps = (PreparedStatement) con.prepareStatement(sql);
           ps.setInt(1, fa.getIdu());
           ps.setString(2, fa.getEquipe());
        
           ps.executeUpdate();
          
               con.close();
                   
          
       }catch (SQLException e){
           e.printStackTrace();
       }
    }

    @Override
    public void delete(int id) {
           
       Connection con = c.getConn();
       String sql = "delete from favoris where idf= ? ;";
       PreparedStatement ps;
       try{
           ps = (PreparedStatement) con.prepareStatement(sql);
           ps.setInt(1, id);
           
           ps.executeUpdate();
          
               con.close();
              
           
           
          
       }catch (SQLException e){
       }
        
   }

    @Override
    public List<Favoris> getAllFav(int id) {
       
               Connection con = c.getConn();
       String sql = "select * from favoris where idu="+id;
       PreparedStatement ps;
       List<Favoris> list =new ArrayList<Favoris>();
       try{
           ps = (PreparedStatement) con.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next())
           {
               int idf = rs.getInt("idf");
               int idu = rs.getInt("idu");
               String equipe = rs.getString("equipe");
              
             
               
             
               list.add(new Favoris(idf,idu,equipe));
                   
           
           
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
       return list;
        
        
    }
    
    
    
        
   
             
    
}
