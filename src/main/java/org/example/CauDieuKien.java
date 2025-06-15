package org.example;

import java.util.Scanner;

public class CauDieuKien {
    public static void main(String[] args) {
        //Cau lenh if
        //if(dieu kien){thuc hien logic}
        //dieu kien dung
        if(9 > 2){
            System.out.println("Dieu kien dung"); //Sai nen kh in ra
        }
        //dieu kien sai
        if(2 > 9){
            System.out.println("dieu kien dung");
        }
        //Viet chuong trinh hom nay co phai la ngay di hoc khong?
        int day = 4;
        if(day == 4 || day == 8){
            System.out.println("Hom nay di hoc");
        }
        //Cau if ... else
        //if(dieu kien){thuc hien logic} else {thuc hien logic}
        int a = 8;
        int b = 10;
        if(a > b){
            System.out.println("So a lon hon so b");  //bor qua
        }else {
            System.out.println("So b lon hon so a"); // in ra
        }
        //Bai tap: user du tuoi di hoc (>=18)
        Scanner tuoiDiHoc = new Scanner(System.in);
        System.out.print("Nhap tuoi sinh vien: ");
        int soTuoi = tuoiDiHoc.nextInt(); //luu gt tu user nhap
        if(soTuoi >= 18){
            System.out.println("Ban du tuoi di hoc");
        }else {
            System.out.println("Xin loi ban chua du tuoi");
        }
        //Dieu kien else ... if (khi co hon 2 dk)
        //toan tu 3 ngoi -> dieu kien ? thuc hien logic 1 : thuc hien logic 2
        String result = (soTuoi >= 18) ? "Du tuoi di hoc" : "Chua du tuoi";
        System.out.println(result);


        //if(dk 1){thuc hien logic}else if(dk 2){thuc hien logic 2}else{logic 3}
        int c = 10;
        if(c == 10){
            System.out.println("so 10");
        } else if (c == 11){
            System.out.println("so 11");
        } else if (c == 12){
            System.out.println("so 12");
        }else {
            System.out.println("Vui long nhap lai so");
        }
    //Bai tap in diem hoc sinh goi kha trung binh
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten hoc sinh: ");
       String name1 = scanner.nextLine();

        System.out.print("Diem mon Toan: ");
       double math = scanner.nextDouble();

        System.out.print("Diem mon Ly: ");
       double ly = scanner.nextDouble();

        System.out.print("Diem mon Hoa: ");
        double hoa = scanner.nextDouble();

        double diemTB = (math + ly + hoa) / 3;
        System.out.println("Diem trung binh 3 mon: " + diemTB);

    if(diemTB > 0 && diemTB < 5){
        System.out.println("Hoc sinh yeu");
    }else if (diemTB >= 5 && diemTB < 6){
        System.out.println("Hoc sinh Trung Binh");
    }else if (diemTB >=6 && diemTB < 7){
        System.out.println("Hoc sinh Kha");
    }else if (diemTB >= 7 && diemTB < 8){
        System.out.println("Hoc sinh Gioi");
    }else if (diemTB >= 8 && diemTB <= 10){
        System.out.println("Hoc sinh Xuat sac");
    }else {
        System.out.println("vui long nhap lai diem: ");
    }

    //Switch case
        //switch (gia tri dem di so sanh){
    //    case gia tri so sanh
    //            thuc hien logic
    //            break
        int d = 10;
    switch (d){
        case 5:
            System.out.println("so 5");
            break;
        case 10:
            System.out.println("so 10");
            break;
        default:
            System.out.println("vui long kt lại");
    }
    //Luu ý: nên dùng switch case - giá so sánh là giá trị cụ thể, đk đơn giản (==)
    }
}
