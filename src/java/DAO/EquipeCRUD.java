/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Equipe;
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
public class EquipeCRUD implements EquipeInterface {
 DbConnect c = new DbConnect();
    @Override
    public List<Equipe> getAllEquipes() {
        
        
       Connection con = c.getConn();
       String sql = "select * from equipe";
       PreparedStatement ps;
       List<Equipe> list =new ArrayList<Equipe>();
       try{
           ps = (PreparedStatement) con.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next())
           {
               int ide = rs.getInt("ide");
               String nome = rs.getString("nome");
               String ville = rs.getString("ville");
               String pays = rs.getString("pays");
               
                          
               list.add(new Equipe(ide,nome,ville,pays));
               
               System.out.println("test");
             
                                
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
       return list;
                            
    }
    
    
    
    
    
    

    @Override
    public Equipe getEquipeById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete_e(int id) {
       Connection con = c.getConn();
       String sql = "delete from equipe where ide= ? ;";
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
    public void addEquipe(Equipe e) {
               Connection con = c.getConn();
       String sql = "INSERT INTO equipe(nome,ville,pays)  values(?,?,?);";
       PreparedStatement ps;
       try{
           ps = (PreparedStatement) con.prepareStatement(sql);
           ps.setString(1, e.getNom_e());
           ps.setString(2, e.getVille());
           ps.setString(3, e.getPays());
          
           ps.executeUpdate();
          
               con.close();
 
       }catch (SQLException x){
           x.printStackTrace();
       }
      
    }
    
    
    

    @Override
    public void updateEquipe(Equipe e) {
       Connection con = c.getConn();
       String sql = "UPDATE equipe SET nome = ? , ville = ? , pays = ? WHERE ide = ?;";
       PreparedStatement ps;
       try{
           ps = (PreparedStatement) con.prepareStatement(sql);
           ps.setString(1, e.getNom_e());
           ps.setString(2, e.getVille());
           ps.setString(3, e.getPays());
           ps.setInt(4,e.getIde());
          
           ps.executeUpdate();
          
               con.close();
 
       }catch (SQLException x){
           x.printStackTrace();
       }
      
        
    }

    @Override
    public List<Equipe> getAllequipe(int id) {
        Connection con = c.getConn();
       String sql = "select * from equipe where ide ="+id;
       PreparedStatement ps;
       List<Equipe> list =new ArrayList<Equipe>();
       try{
           ps = (PreparedStatement) con.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next())
           {
               int ide = rs.getInt("ide");
               String nome = rs.getString("nome");
               String ville = rs.getString("ville");
               String pays = rs.getString("pays");
               
                          
               list.add(new Equipe(ide,nome,ville,pays));
               
               System.out.println("test");
             
                                
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
       return list;
    }
    
}
