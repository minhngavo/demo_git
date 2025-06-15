package org.example;

import java.util.Scanner;
//Bt: tính tiền lương, cho phép user nhập số ngày làm và số tiền 1 ngày. Biết tổng lương = ngày làm * số tiền

public class BaiTap2 {

    static double sumSalary(double salary1, double day1){
        double sum = day1 * salary1;
        return sum;
    }
    public static void main(String[] args) {

        //Mô hình IPO
        //input
        //giá trị tu phia người dùng nhập

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten nhan vien: ");
        String name = scanner.nextLine();

        System.out.print("Nhập số tiền: ");
        double salary1 = scanner.nextDouble();

        System.out.print("Nhập số ngày làm: ");
        double day1 = scanner.nextDouble();

        //process
        //giá trị từ ngừoi dùng nhập đi thực hiện logic yêu cầu cảu bài toán

        double sum = sumSalary(salary1, day1);
        //output
        //giá trị đầu ra từ đề

        System.out.println("Tong tien luong cua ban la: " + sum);
    }
}