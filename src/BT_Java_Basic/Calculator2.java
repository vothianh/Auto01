package BT_Java_Basic;

public class Calculator2 {

    // Hàm không trả về, Tổng 2 số nguyên
    public void tong2So(int a, int b){
        System.out.println("Tổng 2 số a + b = " + ( a + b ));
    }

    // Hàm không trả về, tich 2 số thưc
    public void tich2So(double a, double b){
        System.out.println("Tích 2 số a * b = " + ( a * b));
    }

    public static void main(String[] args) {

        // KHởi tạo hàm
        Calculator2 TS = new Calculator2();
        TS.tong2So(2,1);
        TS.tich2So(2.1, 1.0);

    }
}
