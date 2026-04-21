package BT_Java_Basic;

public class OnTap {

    public static int number = 100;
    //public static int n;

    public static void soSanh(int n){
        if( n == number){
            System.out.println("n bằng 100");
        }else if(n < number){
            System.out.println("n nhỏ hơn 100");

        }else{
            System.out.println("n lơn hơn 100");
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;
        int d = 10;
        System.out.println((a < b) && (a == d));

        // HÀm so sánh n và number
        soSanh(100);

        }
    }
