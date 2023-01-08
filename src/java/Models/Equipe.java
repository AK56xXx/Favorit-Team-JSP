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
public class Equipe {

    private int ide;
    private String nom_e;
    private String ville;
    private String pays;

    public Equipe(int ide, String nom_e, String ville, String pays) {
        this.ide = ide;
        this.nom_e = nom_e;
        this.ville = ville;
        this.pays = pays;
    }

    public Equipe(String nom_e, String ville, String pays) {
        this.nom_e = nom_e;
        this.ville = ville;
        this.pays = pays;
    }

    public Equipe() {
    }

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public String getNom_e() {
        return nom_e;
    }

    public void setNom_e(String nom_e) {
        this.nom_e = nom_e;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public String toString() {
        return "Equipe{" + "ide=" + ide + ", nom_e=" + nom_e + ", ville=" + ville + ", pays=" + pays + '}';
    }
}
