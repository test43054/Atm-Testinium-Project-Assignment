package com.halkbank.islemler;

public class Islemler {

    public String hesapParaEkle(String yatirilanPara ,String hesapBakiyesi) {

        Integer i =Integer.valueOf(yatirilanPara);
        Integer j = Integer.valueOf(hesapBakiyesi);

        j = j + i;

        return j.toString();

    }

    public String hesapParaCek(String cekilenPara ,String hesapBakiyesi) {

        Integer i =Integer.valueOf(cekilenPara);
        Integer j = Integer.valueOf(hesapBakiyesi);

        j = j - i;

        return j.toString();

    }




}
