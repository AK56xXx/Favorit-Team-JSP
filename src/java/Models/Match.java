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
public class Match {
    
    private int idm;
    private String date;
    private String heure;
    private String equipe_h;
    private String equipe_v;
    private int nb_eh;
    private int nb_ev;
    private String etat;

    public Match(int idm, String date, String heure, String equipe_h, String equipe_v, int nb_eh, int nb_ev, String etat) {
        this.idm = idm;
        this.date = date;
        this.heure = heure;
        this.equipe_h = equipe_h;
        this.equipe_v = equipe_v;
        this.nb_eh = nb_eh;
        this.nb_ev = nb_ev;
        this.etat = etat;
    }

    public Match(String date, String heure, String equipe_h, String equipe_v, int nb_eh, int nb_ev, String etat) {
        this.date = date;
        this.heure = heure;
        this.equipe_h = equipe_h;
        this.equipe_v = equipe_v;
        this.nb_eh = nb_eh;
        this.nb_ev = nb_ev;
        this.etat = etat;
    }

    public Match() {
    }

    public int getIdm() {
        return idm;
    }

    public void setIdm(int idm) {
        this.idm = idm;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getEquipe_h() {
        return equipe_h;
    }

    public void setEquipe_h(String equipe_h) {
        this.equipe_h = equipe_h;
    }

    public String getEquipe_v() {
        return equipe_v;
    }

    public void setEquipe_v(String equipe_v) {
        this.equipe_v = equipe_v;
    }

    public int getNb_eh() {
        return nb_eh;
    }

    public void setNb_eh(int nb_eh) {
        this.nb_eh = nb_eh;
    }

    public int getNb_ev() {
        return nb_ev;
    }

    public void setNb_ev(int nb_ev) {
        this.nb_ev = nb_ev;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Match{" + "idm=" + idm + ", date=" + date + ", heure=" + heure + ", equipe_h=" + equipe_h + ", equipe_v=" + equipe_v + ", nb_eh=" + nb_eh + ", nb_ev=" + nb_ev + ", etat=" + etat + '}';
    }
    
    
    
    
}
