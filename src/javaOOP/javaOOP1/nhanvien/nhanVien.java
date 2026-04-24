package javaOOP.javaOOP1.nhanvien;

public class nhanVien {

    public String name ;
    public int age;

    public static String getName(String name){
        return name;
    }

    public static int getAge(int age){
        return age;
    }

    public static void main(String[] args) {
        //nhanVien nv = new nhanVien();
        //System.out.println(nv.getName("Võ Thị Anh"));
        //System.out.println(nv.getAge(31));

        nhanVien.getName("Võ Thị ANh");
        nhanVien.getAge(31);

    }
}
