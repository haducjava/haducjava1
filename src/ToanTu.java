public class ToanTu {
    public static void main(String[] args) {
        int x = 10;
        int y = 14;
        int tong = x + y;
        int hieu = y - x;
        int tich = x * y;
        int thuong = x / y;
        int du = y % x;
        System.out.println(tong);
        System.out.println(hieu);
        System.out.println(tich);
        System.out.println(thuong);
        System.out.println(du);

        // số thực
        float f1 = 1.2f;
        float f2 = 2.1f;
        float tongf = f1 + f2 ;
        System.out.println(tongf);

        // nâng kiểu trong java
        byte b = 10;
        short s  = 200;
        int i = 30;
        long l = 4000L;
        int Tong3Kieu = b + s + i; // dùng int vì int lớn nhất trong 3 kiểu trên
        System.out.println(Tong3Kieu);
        long Tong4Kieu = b + s + i + l; // dùng long vì long lớn nhất trong 4 kiểu trên
        System.out.println(Tong4Kieu);

        // ép kiểu long xuống int
        int Tongl = (int) l + i + s;
        System.out.println(Tongl);

        // phép gán nhanh phép tính thêm = sau
        int t = 10;
        t = t + 5;
        System.out.println(t); // t = 15

        t += 5; // ví dụ
        System.out.println(t); // t = 20








    }
}
