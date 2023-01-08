/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Admin;

/**
 *
 * @author mega
 */
public interface AdminInterface {
    
    public boolean checkUser(String mail);
    public Admin isLoginValid(String mail,String pwd);
    
}
