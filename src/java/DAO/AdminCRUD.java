/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mega
 */
public class AdminCRUD implements AdminInterface {
    
    DbConnect c = new DbConnect();

    @Override
    public boolean checkUser(String mail) {
        Connection con = c.getConn();
       String sql = "select * from admins where mail='" + mail+ "'";
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
    public Admin isLoginValid(String mail, String pwd) {
               Admin u = new Admin();
        
        Connection con = c.getConn();
       String sql = "select * from admins where mail='" + mail+ "' and pwd='"+pwd+"'";
       PreparedStatement ps;
       try{
           ps = (PreparedStatement) con.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           if(rs.next())
           {
               u.setIdadmin(rs.getInt("idadmin"));
               u.setNamea(rs.getString("namea"));
               u.setMail(rs.getString("mail"));
               u.setPwd(rs.getString("pwd"));
               
               con.close();
               return u;
               
           
           
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
       return u;
    }
    
}
