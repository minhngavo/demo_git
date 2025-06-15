package org.example;

public class Mang {
    public static void main(String[] args) {
    //khởi tạo gt mang
        int[] numbers = {10,11,23,4};
        String[] name = {"Hi", "Ha"};
        System.out.println(name[0]);
        name[1] = "HoHo";   //muốn thay đổi giá trị mảng
        System.out.println(name[1]);
    //chieu dai mang
    int length = name.length;
        System.out.println("Chieu dai mang: " + length);
    //duyệt mảng
    for(int i = 0; i < name.length; i++){
        System.out.println("Tên thứ: " + (i+1) + ": " +name[i]);
    }
    //duyệt mảng dùng lặp for-each (note: chỉ dùng cho mảng)
    for(int number: numbers){
        System.out.println(number);
    }

    //nâng cao: duyệt mảng ngược
    for(int index = numbers.length - 1; index >= 0; index--){
        System.out.println(numbers[index]);
    }


    }
}
