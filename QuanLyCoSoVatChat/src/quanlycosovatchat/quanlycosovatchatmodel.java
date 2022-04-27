/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlycosovatchat;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Vector;

/**
 *
 * @author ADMIN
 */
public class quanlycosovatchatmodel {
    private ArrayList<vatchat> dsVatChat;

    public quanlycosovatchatmodel() {
         this.dsVatChat = new ArrayList<vatchat>();
    }

    public quanlycosovatchatmodel(ArrayList<vatchat> dsVatChat) {
        this.dsVatChat = dsVatChat;
    }

    public ArrayList<vatchat> getDsVatChat() {
        return dsVatChat;
    }

    public void setDsVatChat(ArrayList<vatchat> dsVatChat) {
        this.dsVatChat = dsVatChat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("quanlycosovatchatmodel{dsVatChat=").append(dsVatChat);
        sb.append('}');
        System.out.println("adhaksd");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.dsVatChat);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final quanlycosovatchatmodel other = (quanlycosovatchatmodel) obj;
        if (!Objects.equals(this.dsVatChat, other.dsVatChat)) {
            return false;
        }
        return true;
    }
    
    public void addRow(Vector vector) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
