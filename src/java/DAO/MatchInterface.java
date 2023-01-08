/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Match;
import java.util.List;

/**
 *
 * @author AK
 */

public interface MatchInterface {
    public List<Match> getAllMatch();
    

    public List<Match> getAllMatch(int id);
    
    public void addMatch(Match m);
    
    public void updateMatch(Match m);
    
    public void deleteMatch(int id);
    
}



