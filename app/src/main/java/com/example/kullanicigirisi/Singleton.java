package com.example.kullanicigirisi;

public class Singleton
{
    private String kullaniciAdi;
    private String kullaniciParola;
    private static Singleton singleton;
    private Singleton(){
    }
    //Kullanıcı Adı için getter ve setter
    public String getKullaniciAdi(){
        return kullaniciAdi;
    }
    public void setKullaniciAdi(String kullaniciAdi){
        this.kullaniciAdi = kullaniciAdi;
    }
    // Kullanıcı Parolası için getter ve setter
    public String getKullaniciParola(){
        return kullaniciParola;
    }
    public void setKullaniciParola(String kullaniciParola){
        this.kullaniciParola=kullaniciParola;
    }
    //Singleton sınıfının nesne oluşturması
    public static Singleton getInstance(){
        if (singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}