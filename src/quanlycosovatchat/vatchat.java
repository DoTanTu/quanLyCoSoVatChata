/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlycosovatchat;

import java.util.Objects;

/**
 *
 * @author ADMIN
 */
safhksahdf
sgaajsdfhshdan
'jsfasdhn
public class vatchat {
    private String idVatChat;
    private String tenVatChat;
    private int soLuongNhap;
    private int soLuongCon;
    private int soLuongDaSuDung;
    private String phongBanDaSuDung;

    public vatchat(String idVatChat, String tenVatChat, int soLuongNhap, int soLuongCon, int soLuongDaSuDung, String phongBanDaSuDung) {
        this.idVatChat = idVatChat;
        this.tenVatChat = tenVatChat;
        this.soLuongNhap = soLuongNhap;
        this.soLuongCon = soLuongCon;
        this.soLuongDaSuDung = soLuongDaSuDung;
        this.phongBanDaSuDung = phongBanDaSuDung;
    }

    public String getIdVatChat() {
        return idVatChat;
    }

    public void setIdVatChat(String idVatChat) {
        this.idVatChat = idVatChat;
    }

    public String getTenVatChat() {
        return tenVatChat;
    }

    public void setTenVatChat(String tenVatChat) {
        this.tenVatChat = tenVatChat;
    }

    public int getSoLuongNhap() {
        return soLuongNhap;
    }

    public void setSoLuongNhap(int soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }

    public int getSoLuongCon() {
        return soLuongCon;
    }

    public void setSoLuongCon(int soLuongCon) {
        this.soLuongCon = soLuongCon;
    }

    public int getSoLuongDaSuDung() {
        return soLuongDaSuDung;
    }

    public void setSoLuongDaSuDung(int soLuongDaSuDung) {
        this.soLuongDaSuDung = soLuongDaSuDung;
    }

    public String getPhongBanDaSuDung() {
        return phongBanDaSuDung;
    }

    public void setPhongBanDaSuDung(String phongBanDaSuDung) {
        this.phongBanDaSuDung = phongBanDaSuDung;
    }

    @Override
    public String toString() {
        return "vatchat{" + "idVatChat=" + idVatChat + ", tenVatChat=" + tenVatChat + ", soLuongNhap=" + soLuongNhap + ", soLuongCon=" + soLuongCon + ", soLuongDaSuDung=" + soLuongDaSuDung + ", phongBanDaSuDung=" + phongBanDaSuDung + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idVatChat);
        hash = 89 * hash + Objects.hashCode(this.tenVatChat);
        hash = 89 * hash + this.soLuongNhap;
        hash = 89 * hash + this.soLuongCon;
        hash = 89 * hash + this.soLuongDaSuDung;
        hash = 89 * hash + Objects.hashCode(this.phongBanDaSuDung);
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
        final vatchat other = (vatchat) obj;
        if (this.soLuongNhap != other.soLuongNhap) {
            return false;
        }
        if (this.soLuongCon != other.soLuongCon) {
            return false;
        }
        if (this.soLuongDaSuDung != other.soLuongDaSuDung) {
            return false;
        }
        if (!Objects.equals(this.idVatChat, other.idVatChat)) {
            return false;
        }
        if (!Objects.equals(this.tenVatChat, other.tenVatChat)) {
            return false;
        }
        if (!Objects.equals(this.phongBanDaSuDung, other.phongBanDaSuDung)) {
            return false;
        }
        return true;
    }
    
    
}
