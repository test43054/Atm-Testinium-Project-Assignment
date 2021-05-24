package com.halkbank.atmproject;

import com.halkbank.islemler.Islemler;
import com.halkbank.musteriler.BireyselMusteri;
import com.halkbank.musteriler.KurumsalMusteri;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //5 Müşteri oluşturuyorum bu proje'ye en uygun düşecek collection type hashmap bence

        //Müşteri1
        Map<String, String> bireyselMusteri0 = new HashMap<>();
        bireyselMusteri0.put("Müşteri Numarası", "11852");
        bireyselMusteri0.put("TC Kimlik Numarası", "77689911446");
        bireyselMusteri0.put("Adı Soyadı", "Pekgüzel Tavasapı");
        bireyselMusteri0.put("Hesap Bakiyesi", "555");
        bireyselMusteri0.put("Ev Adresi", "Tarihi Manastır Caddesi irfan sokak Geniş Evleri no:77");

        BireyselMusteri musteri0 = new BireyselMusteri();

        musteri0.setBankaMusteriNo(bireyselMusteri0.get("Müşteri Numarası"));
        musteri0.setTcKimlikNo(bireyselMusteri0.get("TC Kimlik Numarası"));
        musteri0.setAdSoyad(bireyselMusteri0.get("Adı Soyadı"));
        musteri0.setHesapBakiyesi(bireyselMusteri0.get("Hesap Bakiyesi"));
        musteri0.setEvAdresi(bireyselMusteri0.get("Ev Adresi"));
       /*
        for (Map.Entry deneme : bireyselMusteri0.entrySet()) {
            System.out.println(deneme.getKey() + " - " + deneme.getValue());
        }
        */

        //Müşteri2
        Map<String, String> bireyselMusteri1 = new HashMap<>();
        bireyselMusteri1.put("Müşteri Numarası", "12555");
        bireyselMusteri1.put("TC Kimlik Numarası", "64145696146");
        bireyselMusteri1.put("Adı Soyadı", "Satılmış Portakal ");
        bireyselMusteri1.put("Hesap Bakiyesi", "888");
        bireyselMusteri1.put("Ev Adresi", "Nilüfer caddesi,Cemil Bey sokak Kule evleri no:11");

        BireyselMusteri musteri1 = new BireyselMusteri();

        musteri1.setBankaMusteriNo(bireyselMusteri1.get("Müşteri Numarası"));
        musteri1.setTcKimlikNo(bireyselMusteri1.get("TC Kimlik Numarası"));
        musteri1.setAdSoyad(bireyselMusteri1.get("Adı Soyadı"));
        musteri1.setHesapBakiyesi(bireyselMusteri1.get("Hesap Bakiyesi"));
        musteri1.setEvAdresi(bireyselMusteri1.get("Ev Adresi"));

        //Müşteri3
        Map<String, String> bireyselMusteri2 = new HashMap<>();
        bireyselMusteri2.put("Müşteri Numarası", "99555");
        bireyselMusteri2.put("TC Kimlik Numarası", "99536787936");
        bireyselMusteri2.put("Adı Soyadı", "Danyal Topatan");
        bireyselMusteri2.put("Hesap Bakiyesi", "8855");
        bireyselMusteri2.put("Ev Adresi", "Yemiş caddesi fetret sok. cemilbey evleri no:33");

        BireyselMusteri musteri2 = new BireyselMusteri();

        musteri2.setBankaMusteriNo(bireyselMusteri2.get("Müşteri Numarası"));
        musteri2.setTcKimlikNo(bireyselMusteri2.get("TC Kimlik Numarası"));
        musteri2.setAdSoyad(bireyselMusteri2.get("Adı Soyadı"));
        musteri2.setHesapBakiyesi(bireyselMusteri2.get("Hesap Bakiyesi"));
        musteri2.setEvAdresi(bireyselMusteri2.get("Ev Adresi"));

        //Müşteri4
        Map<String, String> kurumsalMusteri3 = new HashMap<>();
        kurumsalMusteri3.put("Müşteri Numarası", "55638");
        kurumsalMusteri3.put("TC Kimlik Numarası", "84749307866");
        kurumsalMusteri3.put("Adı Soyadı", "Güçlü Kuvvetli");
        kurumsalMusteri3.put("Hesap Bakiyesi", "1025");
        kurumsalMusteri3.put("Şirket İsmi", "Güçlü Yazılım");

        KurumsalMusteri musteri3 = new KurumsalMusteri();

        musteri3.setBankaMusteriNo(kurumsalMusteri3.get("Müşteri Numarası"));
        musteri3.setTcKimlikNo(kurumsalMusteri3.get("TC Kimlik Numarası"));
        musteri3.setAdSoyad(kurumsalMusteri3.get("Adı Soyadı"));
        musteri3.setHesapBakiyesi(kurumsalMusteri3.get("Hesap Bakiyesi"));
        musteri3.setSirketAdi(kurumsalMusteri3.get("Şirket İsmi"));


        //Müşteri5
        Map<String, String> kurumsalMusteri4 = new HashMap<>();
        kurumsalMusteri4.put("Müşteri Numarası", "99655");
        kurumsalMusteri4.put("TC Kimlik Numarası", "44423291874");
        kurumsalMusteri4.put("Adı Soyadı", "Efsane Çilek");
        kurumsalMusteri4.put("Hesap Bakiyesi", "1550");
        kurumsalMusteri4.put("Şirket İsmi", "Çilek Yazılım");

        KurumsalMusteri musteri4 = new KurumsalMusteri();

        musteri4.setBankaMusteriNo(kurumsalMusteri4.get("Müşteri Numarası"));
        musteri4.setTcKimlikNo(kurumsalMusteri4.get("TC Kimlik Numarası"));
        musteri4.setAdSoyad(kurumsalMusteri4.get("Adı Soyadı"));
        musteri4.setHesapBakiyesi(kurumsalMusteri4.get("Hesap Bakiyesi"));
        musteri4.setSirketAdi(kurumsalMusteri4.get("Şirket İsmi"));

        /*
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Müşteri Numarası Giriniz Lütfen");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Müşteri Numarası : " + userName);  // Output user input
        */

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Lütfen Müşteri Numaranızı Giriniz");
        String musteriNumarası = myObj.nextLine();

        //1.müşteri
        if (musteriNumarası.equals(musteri0.getBankaMusteriNo())) {

            System.out.println("Müşteri Numarası-->" + musteri0.getBankaMusteriNo());
            System.out.println("Ad Soyad-->" + musteri0.getAdSoyad());
            System.out.println("TC Kimlik Numarası-->" + musteri0.getTcKimlikNo());
            System.out.println("Hesap Bakiyesi-->" + musteri0.getHesapBakiyesi());
            System.out.println("Ev Adresi-->" + musteri0.getEvAdresi());

            Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Lütfen Yapacağınız İşlemi Seçiniz(1->Para Yatırma  ---  2->Para Çekme)");
            String islem = myObj1.nextLine();


            if (islem.equals("1")) {

                Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Kaç TL yatırmak istiyorsunuz ?");
                String yatirilanPara = myObj2.nextLine();

                Islemler parayatir = new Islemler();
                //System.out.println("Hesaptaki Total Miktar " + y.hesapParaEkle(yatirilanPara ,musteri0.getHesapBakiyesi() ));

                String qq = parayatir.hesapParaEkle(yatirilanPara, musteri0.getHesapBakiyesi());

                bireyselMusteri0.put("Hesap Bakiyesi", qq);
                musteri0.setHesapBakiyesi(bireyselMusteri0.get("Hesap Bakiyesi")); //Burada üstteki değeri ezdi database gibi olsaydı yerine geçicekti yani

                System.out.println("Para Yatırdıktan Sonra oluşan Hesap Bakiyeniz" + "--->" + musteri0.getHesapBakiyesi() + "TL");

            } else if (islem.equals("2")) {

                Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Kaç TL çekmek istiyorsunuz ?");
                String cekilenPara = myObj3.nextLine();

                Islemler paracek = new Islemler();

                String qq = paracek.hesapParaCek(cekilenPara, musteri0.getHesapBakiyesi());

                bireyselMusteri0.put("Hesap Bakiyesi", qq);
                musteri0.setHesapBakiyesi(bireyselMusteri0.get("Hesap Bakiyesi")); //Burada üstteki değeri ezdi database gibi olsaydı yerine geçicekti yani

                System.out.println("Para Çekildikten Sonra oluşan Hesap Bakiyeniz" + "--->" + musteri0.getHesapBakiyesi() + "TL");
            } else {
                System.out.println("Yanlış Tuşladınız Tekrar seçiniz lütfen");
            }

            //2.müşteri
        } else if (musteriNumarası.equals(musteri1.getBankaMusteriNo())) {
            System.out.println("Müşteri Numarası-->" + musteri1.getBankaMusteriNo());
            System.out.println("Ad Soyad-->" + musteri1.getAdSoyad());
            System.out.println("TC Kimlik Numarası-->" + musteri1.getTcKimlikNo());
            System.out.println("Hesap Bakiyesi-->" + musteri1.getHesapBakiyesi());
            System.out.println("Ev Adresi-->" + musteri1.getEvAdresi());

            Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Lütfen Yapacağınız İşlemi Seçiniz(1->Para Yatırma  ---  2->Para Çekme)");
            String islem = myObj1.nextLine();

            if (islem.equals("1")) {

                Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Kaç TL yatırmak istiyorsunuz ?");
                String yatirilanPara = myObj2.nextLine();

                Islemler parayatir = new Islemler();
                //System.out.println("Hesaptaki Total Miktar " + y.hesapParaEkle(yatirilanPara ,musteri0.getHesapBakiyesi() ));

                String qq = parayatir.hesapParaEkle(yatirilanPara, musteri1.getHesapBakiyesi());

                bireyselMusteri1.put("Hesap Bakiyesi", qq);
                musteri1.setHesapBakiyesi(bireyselMusteri1.get("Hesap Bakiyesi")); //Burada üstteki değeri ezdi database gibi olsaydı yerine geçicekti yani

                System.out.println("Para Yatırdıktan Sonra oluşan Hesap Bakiyeniz" + "--->" + musteri1.getHesapBakiyesi() + "TL");

            } else if (islem.equals("2")) {

                Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Kaç TL çekmek istiyorsunuz ?");
                String cekilenPara = myObj3.nextLine();

                Islemler paracek = new Islemler();

                String qq = paracek.hesapParaCek(cekilenPara, musteri1.getHesapBakiyesi());

                bireyselMusteri1.put("Hesap Bakiyesi", qq);
                musteri1.setHesapBakiyesi(bireyselMusteri1.get("Hesap Bakiyesi")); //Burada üstteki değeri ezdi database gibi olsaydı yerine geçicekti yani

                System.out.println("Para Çekildikten Sonra oluşan Hesap Bakiyeniz" + "--->" + musteri1.getHesapBakiyesi() + "TL");
            } else {
                System.out.println("Yanlış Tuşladınız Tekrar seçiniz lütfen");
            }
            //3.müşteri
        } else if (musteriNumarası.equals(musteri2.getBankaMusteriNo())) {
            System.out.println("Müşteri Numarası-->" + musteri2.getBankaMusteriNo());
            System.out.println("Ad Soyad-->" + musteri2.getAdSoyad());
            System.out.println("TC Kimlik Numarası-->" + musteri2.getTcKimlikNo());
            System.out.println("Hesap Bakiyesi-->" + musteri2.getHesapBakiyesi());
            System.out.println("Ev Adresi-->" + musteri2.getEvAdresi());

            Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Lütfen Yapacağınız İşlemi Seçiniz(1->Para Yatırma  ---  2->Para Çekme)");
            String islem = myObj1.nextLine();

            if (islem.equals("1")) {

                Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Kaç TL yatırmak istiyorsunuz ?");
                String yatirilanPara = myObj2.nextLine();

                Islemler parayatir = new Islemler();
                //System.out.println("Hesaptaki Total Miktar " + y.hesapParaEkle(yatirilanPara ,musteri0.getHesapBakiyesi() ));

                String qq = parayatir.hesapParaEkle(yatirilanPara, musteri2.getHesapBakiyesi());

                bireyselMusteri2.put("Hesap Bakiyesi", qq);
                musteri2.setHesapBakiyesi(bireyselMusteri2.get("Hesap Bakiyesi")); //Burada üstteki değeri ezdi database gibi olsaydı yerine geçicekti yani

                System.out.println("Para Yatırdıktan Sonra oluşan Hesap Bakiyeniz" + "--->" + musteri2.getHesapBakiyesi() + "TL");

            } else if (islem.equals("2")) {

                Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Kaç TL çekmek istiyorsunuz ? ");
                String cekilenPara = myObj3.nextLine();

                Islemler paracek = new Islemler();

                String qq = paracek.hesapParaCek(cekilenPara, musteri2.getHesapBakiyesi());

                bireyselMusteri2.put("Hesap Bakiyesi", qq);
                musteri2.setHesapBakiyesi(bireyselMusteri2.get("Hesap Bakiyesi")); //Burada üstteki değeri ezdi database gibi olsaydı yerine geçicekti yani

                System.out.println("Para Çekildikten Sonra oluşan Hesap Bakiyeniz" + "--->" + musteri2.getHesapBakiyesi() + "TL");
            } else {
                System.out.println("Yanlış Tuşladınız Tekrar seçiniz lütfen");
            }
            //4. müşteri
        } else if (musteriNumarası.equals(musteri3.getBankaMusteriNo())) {
            System.out.println("Müşteri Numarası-->" + musteri3.getBankaMusteriNo());
            System.out.println("Ad Soyad-->" + musteri3.getAdSoyad());
            System.out.println("TC Kimlik Numarası-->" + musteri3.getTcKimlikNo());
            System.out.println("Hesap Bakiyesi-->" + musteri3.getHesapBakiyesi());
            System.out.println("Şirket İsmi-->" + musteri3.getSirketAdi());

            Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Lütfen Yapacağınız İşlemi Seçiniz(1->Para Yatırma  ---  2->Para Çekme)");
            String islem = myObj1.nextLine();

            if (islem.equals("1")) {

                Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Kaç TL yatırmak istiyorsunuz ?");
                String yatirilanPara = myObj2.nextLine();

                Islemler parayatir = new Islemler();
                //System.out.println("Hesaptaki Total Miktar " + y.hesapParaEkle(yatirilanPara ,musteri0.getHesapBakiyesi() ));

                String qq = parayatir.hesapParaEkle(yatirilanPara, musteri3.getHesapBakiyesi());

                kurumsalMusteri3.put("Hesap Bakiyesi", qq);
                musteri3.setHesapBakiyesi(kurumsalMusteri3.get("Hesap Bakiyesi")); //Burada üstteki değeri ezdi database gibi olsaydı yerine geçicekti yani

                System.out.println("Para Yatırdıktan Sonra oluşan Hesap Bakiyeniz" + "--->" + musteri3.getHesapBakiyesi() + "TL");

            } else if (islem.equals("2")) {

                Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Kaç TL çekmek istiyorsunuz ?");
                String cekilenPara = myObj3.nextLine();

                Islemler paracek = new Islemler();

                String qq = paracek.hesapParaCek(cekilenPara, musteri3.getHesapBakiyesi());

                kurumsalMusteri3.put("Hesap Bakiyesi", qq);
                musteri3.setHesapBakiyesi(kurumsalMusteri3.get("Hesap Bakiyesi")); //Burada üstteki değeri ezdi database gibi olsaydı yerine geçicekti yani

                System.out.println("Para Çekildikten Sonra oluşan Hesap Bakiyeniz" + "--->" + musteri3.getHesapBakiyesi() + "TL");
            } else {
                System.out.println("Yanlış Tuşladınız Tekrar seçiniz lütfen");
            }
            //5.müşteri
        } else if (musteriNumarası.equals(musteri4.getBankaMusteriNo())) {
            System.out.println("Müşteri Numarası-->" + musteri4.getBankaMusteriNo());
            System.out.println("Ad Soyad-->" + musteri4.getAdSoyad());
            System.out.println("TC Kimlik Numarası-->" + musteri4.getTcKimlikNo());
            System.out.println("Hesap Bakiyesi-->" + musteri4.getHesapBakiyesi());
            System.out.println("Şirket İsmi-->" + musteri4.getSirketAdi());

            Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Lütfen Yapacağınız İşlemi Seçiniz(1->Para Yatırma  ---  2->Para Çekme)");
            String islem = myObj1.nextLine();

            if (islem.equals("1")) {

                Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Kaç TL yatırmak istiyorsunuz ? ");
                String yatirilanPara = myObj2.nextLine();

                Islemler parayatir = new Islemler();
                //System.out.println("Hesaptaki Total Miktar " + y.hesapParaEkle(yatirilanPara ,musteri0.getHesapBakiyesi() ));

                String qq = parayatir.hesapParaEkle(yatirilanPara, musteri4.getHesapBakiyesi());

                kurumsalMusteri4.put("Hesap Bakiyesi", qq);
                musteri4.setHesapBakiyesi(kurumsalMusteri4.get("Hesap Bakiyesi")); //Burada üstteki değeri ezdi database gibi olsaydı yerine geçicekti yani

                System.out.println("Para Yatırdıktan Sonra oluşan Hesap Bakiyeniz" + "--->" + musteri4.getHesapBakiyesi() + "TL");

            } else if (islem.equals("2")) {

                Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Kaç TL çekmek istiyorsunuz ? ");
                String cekilenPara = myObj3.nextLine();

                Islemler paracek = new Islemler();

                String qq = paracek.hesapParaCek(cekilenPara, musteri4.getHesapBakiyesi());

                kurumsalMusteri4.put("Hesap Bakiyesi", qq);
                musteri4.setHesapBakiyesi(kurumsalMusteri4.get("Hesap Bakiyesi")); //Burada üstteki değeri ezdi database gibi olsaydı yerine geçicekti yani

                System.out.println("Para Çekildikten Sonra oluşan Hesap Bakiyeniz" + "--->" + musteri4.getHesapBakiyesi() + "TL");
            } else {
                System.out.println("Yanlış Tuşladınız Tekrar seçiniz lütfen");
            }
        } else {
            System.out.println("Böyle bir Müşterimiz Bulunmamaktadır!!");
        }


    }

}
