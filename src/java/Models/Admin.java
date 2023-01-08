/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author mega
 */
public class Admin {
    
    private int idadmin;
    private String namea;
    private String mail;
    private String pwd;

    public Admin(int idadmin, String namea, String mail, String pwd) {
        this.idadmin = idadmin;
        this.namea = namea;
        this.mail = mail;
        this.pwd = pwd;
    }

    public Admin(String namea, String mail, String pwd) {
        this.namea = namea;
        this.mail = mail;
        this.pwd = pwd;
    }

    public Admin() {
    }

    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }

    public String getNamea() {
        return namea;
    }

    public void setNamea(String namea) {
        this.namea = namea;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    
    
}
