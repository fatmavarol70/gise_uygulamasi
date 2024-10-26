package gişe_ugulaması;

import java.util.Random;

public class TCKN {
    private Long id;
    private String dogumYeri;
    private String tckn;
    boolean kontrol = true;

    public TCKN() {
    }

    public String getTckn() {
        return this.tckn;
    }

    public void setTckn(String tckn) {
        if (tckn.length() == 11) {
            int gişeNo;
            for(int i = 0; i < tckn.length(); ++i) {
                gişeNo = tckn.charAt(i);
                if (!Character.isDigit((char)gişeNo)) {
                    this.kontrol = false;
                    break;
                }

                this.kontrol = true;
            }

            if (this.kontrol) {
                Random random = new Random();
                gişeNo = random.nextInt(100);
                this.sonucuYazdir("GİŞE NO:" + gişeNo);
            } else {
                this.sonucuYazdir("LLütfen bütün karakterleri raka olacak sekilde giriniz.");
            }
        } else {
            this.sonucuYazdir("tc 11 karakter olmak zorundur");
        }

        this.tckn = tckn;
    }

    public void sonucuYazdir(String sonuc) {
        System.out.println(sonuc);
    }

    public void setDogumYeri(String dogumYeri) {
        this.dogumYeri = dogumYeri;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDogumYeri() {
        return this.dogumYeri;
    }

    public Long getId() {
        return this.id;
    }
}
