package org.example;

public class Chuoi {
    public static void main(String[] args) {
        //String trong java
        String greet = "Hello hii";

        //chuyen doi chuoi chu hoa thanh chu thuong
        System.out.println("Do dai cua chuoi " + greet.length());  // dem do dai
        System.out.println(greet.toLowerCase()); //chu thuong
        System.out.println(greet.toUpperCase()); //chu hoa


        //Noi chuoi
        System.out.println("Loi chao " + greet);
        System.out.println("Loi chao ".concat(greet));

    }
}
