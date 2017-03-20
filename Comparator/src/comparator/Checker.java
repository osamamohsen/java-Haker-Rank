/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;

import java.util.Comparator;
/**
 *
 * @author osama
 */
class Checker implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        if(o1.score < o2.score){
            return 1;
        }else if(o1.score == o2.score){
            return o1.name.compareTo(o2.name);
        }else return -1;
    }
    
}
