package gişe_ugulaması;

import java.util.Scanner;

public class AnaSınıf {
    public AnaSınıf() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gişe Uygulamasına Hoşgeldiniz: ");
        System.out.println("Lütfen Tc Giriniz");
        String tckn = scan.nextLine();
        TCKN tcknNesne = new TCKN();
        tcknNesne.setTckn(tckn);
    }
}
