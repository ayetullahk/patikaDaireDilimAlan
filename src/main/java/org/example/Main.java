package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int r,a;
       double pi=3.14,sonuc;
       Scanner inp = new Scanner(System.in);
        System.out.print("Cember yarı capı giriniz:");
       r= inp.nextInt();
        System.out.print("Cember merkez acısını giriniz:");
       a= inp.nextInt();
       sonuc=(pi * (r*r) * a) / 360;
        System.out.print("Daire dilim alanı:"+sonuc);

    }
}