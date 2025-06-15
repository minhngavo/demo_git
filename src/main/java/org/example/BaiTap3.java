package org.example;
//BT:
import java.util.Scanner;

public class BaiTap3 {

    static void diemTrungBinh(double math, double ly, double hoa) {
        double diemTBM = (math + ly + hoa) / 3;
        return diemTBM;
    }

    static String xepLoai(double diemTB) {
        String result = "";
        if (diemTB > 0 && diemTB < 5) {
            result = ("Hoc sinh yeu");
        } else if (diemTB >= 5 && diemTB < 6) {
            result = ("Hoc sinh Trung Binh");
        } else if (diemTB >= 6 && diemTB < 7) {
            result = ("Hoc sinh Kha");
        } else if (diemTB >= 7 && diemTB < 8) {
            result = ("Hoc sinh Gioi");
        } else if (diemTB >= 8 && diemTB <= 10) {
            result = ("Hoc sinh Xuat sac");
        } else {
            result = ("vui long nhap lai diem: ");
        }
        return result;
    }

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap ten hoc sinh: ");
            String name1 = scanner.nextLine();

            System.out.print("Diem mon Toan: ");
            double math = scanner.nextDouble();

            System.out.print("Diem mon Ly: ");
            double ly = scanner.nextDouble();

            System.out.print("Diem mon Hoa: ");
            double hoa = scanner.nextDouble();

            //process
            double diemTBM = diemTrungBinh(math, ly, hoa);
            String danhGia = xepLoai(diemTBM);
            System.out.println("Diem trung binh 3 mon: " + diemTBM);

        }
    }




