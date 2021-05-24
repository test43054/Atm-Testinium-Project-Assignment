package com.halkbank.musteriler;

public class Musteri {

    private String tcKimlikNo = null;
    private String adSoyad = null;
    private String hesapBakiyesi = null;
    private String bankaMusteriNo = null;

    public String getBankaMusteriNo() {
        return bankaMusteriNo;
    }

    public void setBankaMusteriNo(String bankaMusteriNo) {
        this.bankaMusteriNo = bankaMusteriNo;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(String hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }
}
