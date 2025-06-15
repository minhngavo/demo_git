package org.example;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
// // vòng lặp while
//     giá trị ban đầu
//     while(điều kiện){
//         thực hiẹn logic
//          thay đổi giá trị ban đầu
// }
        //yêu cầu: in ra 5 dòng hello world
        int i = 1;
        while (i <= 5) {
            System.out.println("hello world");
            i++;  // i = i + 1 hoặc i += 1 thay đổi giá trị ban đầu
        }

//yeu cau: in ra so n lan

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap vo so lan: ");
//        int soLan = scanner.nextInt();
//
//        int lan = 1;
//        while (lan <= soLan){
//            System.out.println("hello 05");
//            lan++;
//        }
//

//        vòng lặp do .. while
//        giá trị ban đầu
//        do {
//            thực hiện logic
//            làm thay đổi giá trị ban đầu
//        } while(điều kiện)

        int index = 1;
        do {
            System.out.println("Gia tri i: " + index);
            index++;
        } while (index <= 5);

        //Vòng lặp for
        //for(giá trị khởi tạo; điều kiện; cập nhật giá trị khởi tạo)
        for (int j = 1; j <= 5; j++) {
            System.out.println("Gia tri j: " + i);

        }

        // BT1: Cho phép user nhậo vào số N. Tính tổng từ 1 đến n

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vo so lan: ");
        int soNLan = scanner.nextInt();
        int sum = 0;
        for (int k = 0; k <= soNLan; k++) {
            sum += k;
        }
        System.out.println("Tong gia tri k: " + sum);


        // BT2: Cho phép user nhập vào số N. Tính tổng số chẵn từ 0 đến n

        System.out.println("Nhap vo so lan: ");
        int soNLan1 = scanner.nextInt();
        int sum1 = 0;
        for(int k = 0; k <= soNLan1; k++){    //--> cách nhanh hơn chi hết cho 2: for(int k =0; k <= soNLan; k+=2
          if( k % 2 == 0){                   //--> cách nhanh hơn chi hết cho 3: for(int k =3; k <= soNLan; k+=3
            sum1 += k;
        }
    }
        System.out.println("Tong gia tri k: " + sum );
    }
}
