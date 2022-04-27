/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlycosovatchat;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class vatchatdao {
    List<vatchat> slVC = new ArrayList<>();

    public vatchatdao() {
    }
    
    public List<vatchat> getSlVC() {
        return slVC;
    }

    public void setSlVC(List<vatchat> slVC) {
        this.slVC = slVC;
    }
    
    public List<vatchat> GetAllVatChat(){
        return slVC;
    }

     public vatchat findvatchatByMVC(String mvc){
        for (vatchat ts : slVC){
            if (ts.getIdVatChat().equalsIgnoreCase(mvc)){
                return ts;
            }
        }
         System.out.println("Ga lam bro");
        return null; 
    }
    
    
}
