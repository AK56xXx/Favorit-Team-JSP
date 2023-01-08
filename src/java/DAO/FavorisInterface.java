/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Favoris;
import java.util.List;

/**
 *
 * @author mega
 */
public interface FavorisInterface {
    
    public void addFav(Favoris fa);
    public void delete(int id);
    public List<Favoris> getAllFav(int idu);
    
}
