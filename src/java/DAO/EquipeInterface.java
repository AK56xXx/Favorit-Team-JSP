/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Equipe;
import java.util.List;

/**
 *
 * @author mega
 */
public interface EquipeInterface {
    
    
    public List<Equipe> getAllEquipes();
    public Equipe getEquipeById(int id);
    public void delete_e(int id);
    public void addEquipe(Equipe e);
    public void updateEquipe( Equipe e);
    public List<Equipe> getAllequipe(int id);
}
    

