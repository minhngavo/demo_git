package org.example;

public class ToanTu {
    public static void main(String[] args) {
        int a = 20;
        int b = 15;
        System.out.println("Tong " + (a + b) );
        System.out.println("Hieu " + (a - b) );
        System.out.println("Tich " + (a * b) );
        System.out.println("Thuong " + (a / b) );
        System.out.println("Du " + (a % b) );

//Tien to va hau to
    //tien to
        System.out.println(++a);
    //hau to
        int c = 10;
        int d = c;
        System.out.println(d++);
        System.out.println(d);

//toan tu so sanh
    // so sanh (==)
    int e = 10;
    int f = 19;
    boolean soSanh = (e == f);
        System.out.println(soSanh);
    boolean soSKhongBang = ( e != f);
        System.out.println(soSKhongBang);

//Toan tu logic
    // and(&&)
    boolean rs1 = (10 == 10) && (15 == 15);
        System.out.println(rs1); //true
    // or(||)
        boolean rs2 = (10 == 9) || (15 == 15);
        System.out.println(rs1);  //true
    //phu dinh !
    boolean rs3 = !(2>1);
        System.out.println(rs3);

//Quy tắc đặt tên biến
//bắt buộc bằng chữ cái, kh số
//kh đc dặt trùng với từ khoá của java (public, class, void, statis,..)
//dặt tên theo quy tắc camel case ==> hoten - hoTen
    }
}
