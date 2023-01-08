/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Models.User;
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
public class UserCRUD implements UserInterface {

    DbConnect c = new DbConnect();
    @Override
    public void addUser(User u) {
       Connection con = c.getConn();
       String sql = "insert into users(nom,prenom,email,password) values(?,?,?,?);";
       PreparedStatement ps;
       try{
           ps = (PreparedStatement) con.prepareStatement(sql);
           ps.setString(1, u.getNom());
           ps.setString(2, u.getPrenom());
           ps.setString(3, u.getEmail());
           ps.setString(4, u.getPassword());
           ps.executeUpdate();
          
               con.close();
              
           
           
          
       }catch (SQLException e){
           e.printStackTrace();
       }
     }

    @Override
    public boolean checkUser(String email) {
      Connection con = c.getConn();
       String sql = "select * from users where email='" + email+ "'";
       PreparedStatement ps;
       try{
           ps = (PreparedStatement) con.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           System.out.println("crud ok");
           if(rs.next())
           {
               System.out.println("crud nrxt");
               con.close();
               return true;
               
           
           
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
       return false;
    }

    @Override
    public User isLoginValid(String email, String password) {
        
        User u = new User();
        
        Connection con = c.getConn();
       String sql = "select * from users where email='" + email+ "' and password='"+password+"'";
       PreparedStatement ps;
       try{
           ps = (PreparedStatement) con.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           if(rs.next())
           {
               u.setId(rs.getInt("id"));
               u.setEmail(rs.getString("email"));
               u.setNom(rs.getString("nom"));
               con.close();
               return u;
               
           
           
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
       return u;
        }

    @Override
    public List<User> getAllUsers() {
       Connection con = c.getConn();
       String sql = "select * from users";
       PreparedStatement ps;
       List<User> list =new ArrayList<User>();
       try{
           ps = (PreparedStatement) con.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next())
           {
               int id = rs.getInt("id");
               String nom = rs.getString("nom");
               String prenom = rs.getString("prenom");
               String email = rs.getString("email");
               String password = rs.getString("password");
               
                          
               list.add(new User(id,nom,prenom,email,password));
               
               System.out.println("test");
             
                                
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
       return list;
       
    }
    
    

    @Override
    public List<User> getAllUser(int idu) {
       Connection con = c.getConn();
       String sql = "select * from users where id ="+idu;
       PreparedStatement ps;
       List<User> list =new ArrayList<User>();
       try{
           ps = (PreparedStatement) con.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           while(rs.next())
           {
               int id = rs.getInt("id");
               String nom = rs.getString("nom");
               String prenom = rs.getString("prenom");
               String email = rs.getString("email");
               String password = rs.getString("password");
               
                          
               list.add(new User(id,nom,prenom,email,password));
               
               System.out.println("test");
             
                                
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
       return list;
    }

    @Override
    public void updateUser(User u) {
       Connection con = c.getConn();
       String sql = "UPDATE users SET nom = ? , prenom = ? , email = ? , password = ? WHERE id = ?;";
       PreparedStatement ps;
       try{
           ps = (PreparedStatement) con.prepareStatement(sql);
           ps.setString(1, u.getNom());
           ps.setString(2, u.getPrenom());
           ps.setString(3, u.getEmail());
           ps.setString(4, u.getPassword());
           ps.setInt(5,u.getId());
           ps.executeUpdate();
          
               con.close();
              
               
       }catch (SQLException e){
           e.printStackTrace();
       }
       
    }

    @Override
    public void deleteUser(int id) {
       Connection con = c.getConn();
       String sql = "delete from users where id= ? ;";
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
