package BT_Java_Basic;

public class SinhVien {

    String lop = "12A4"; // Biến Toàn cục
    static String truong = "THPT NL2"; // Biến Static

    public static void main(String[] args) {
        // Khai báo biến cục bộ
        String ten = "Anh";
        int tuoi = 31;

        // in ra màn hình
        System.out.println("Tên : " + ten);
        System.out.println("Tuổi: " + tuoi);
        // Gọi biến toàn cục vào
        SinhVien sinhvien = new SinhVien();
        System.out.println("Lơp" + sinhvien.lop);
        // in biến Static, có thể gọi trực tiếp
        System.out.println("Trường: " + truong);

        // Gọi các biến của class ThongTin qua, bằng cách gọi tên slass chấm tên biến là được
        System.out.println("Bằng cấp: " + ThongTin.BANG);
        System.out.println("Chức vụ: " + ThongTin.CHUCVU);

        // Gọi biến Toàn cục qua thì phải khơi tạo đối tượng class
        ThongTin thongtin = new ThongTin();
        System.out.println("Cơ Sở: " + thongtin.CO_SO);

    }
}
