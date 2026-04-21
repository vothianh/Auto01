package BT_Java_Basic;

public class for_arr {

    public static void main(String[] args) {
        int mang[] = new int[26];
        int index = 0;

        for(int i = 0 ; i <= 50; i++){
            if(i % 2==0){
                System.out.print(i + " ");
                mang[index] = i;
                index++;
            }
        }
        System.out.print("\n");
        // duyệt mảng
        System.out.println("Duyệt mảng:");
        for(int value : mang){

            System.out.println(value);
        }
    }
}
