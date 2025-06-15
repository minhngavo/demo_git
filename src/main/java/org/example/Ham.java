package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ham {
    //Hàm đc định nghĩa
    //có 2 loại hàm
    //hàm không có gt trả về (hàm thực hiện logic
    //static void tenHam(){}
        static void greeting(){
            System.out.println("Xin chao testing 05");
        }


    //hàm có gt trả về
    //static <kiểu dl> tenHam(truyền tham số){}
        static double dtb(double diemToan, double diemLy, double diemHoa){
            double dtb =(diemToan + diemHoa + diemLy) / 3;
            return dtb;
    }
    public static void main(String[] args) {
        greeting(); //gọi ở trong main lấy hàm muốn trả về

        double diemToan = 7;
        double diemHoa = 4;
        double diemLy = 6;
        double dtb =(diemToan + diemHoa + diemLy) / 3;
        System.out.println(dtb);

//Bt: tính tiền lương, cho phép user nhập số ngày làm và số tiền 1 ngày. Biết tổng lương = ngày làm * số tiền

  }


}
