package BT_Java_Basic;

public class Calculator1 {

    // Hàm trả về, Tổng 2 số nguyên
    public int tong2So(int a, int b){
        return a + b;
    }

    // Hàm trả về, tich 2 số thưc
    public double tich2So(double a, double b){
        return a * b ;
    }

    public static void main(String[] args) {

        // KHởi tạo hàm
        Calculator1 TS = new Calculator1();
        System.out.println("Tổng 2 so : " + (TS.tong2So(3,5) + 1));
        System.out.println("Tích 2 so : " + TS.tich2So(2.4,2.0));

    }
}
