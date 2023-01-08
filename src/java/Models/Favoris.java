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
public class Favoris {
    
    private int idf;
    private int idu;

    public Favoris(int idf, int idu, String equipe) {
        this.idf = idf;
        this.idu = idu;
        this.equipe = equipe;
    }
    private String equipe;

    public Favoris(int idu, String equipe) {
        this.idu = idu;
        this.equipe = equipe;
    }

    public Favoris() {
    }

    public int getIdf() {
        return idf;
    }

    public void setIdf(int idf) {
        this.idf = idf;
    }

    public int getIdu() {
        return idu;
    }

    public void setIdu(int idu) {
        this.idu = idu;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return "Favoris{" + "idf=" + idf + ", idu=" + idu + ", equipe=" + equipe + '}';
    }


    
}
