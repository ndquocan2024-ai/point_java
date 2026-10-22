import java.util.Scanner;

public class Point{
    private String tenDiem;
    private double hoanhDo;
    private double tungDo;

    public Point(String tenDiem, double hoanhDo, double tungDo) {
        this.tenDiem = tenDiem;
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }

    public Point() {
        this.tenDiem = "A";
        this.hoanhDo = 0;
        this.tungDo = 0;
    }

    public Point(double hoanhDo, double tungDo) {
        this.tenDiem = "A";
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }

    public String getTenDiem() { 
        return tenDiem; 
    }
    public void setTenDiem(String tenDiem) { 
        this.tenDiem = tenDiem; 
    }

    public double getHoanhDo() { 
        return hoanhDo; 
    }
    public void setHoanhDo(double hoanhDo) {
         this.hoanhDo = hoanhDo; 
    }

    public double getTungDo() {
         return tungDo; 
    }
    public void setTungDo(double tungDo) {
         this.tungDo = tungDo; 
    }

    public void nhap(Scanner scannner) {
        System.out.print("Nhap ten diem: ");
        this.tenDiem = scannner.nextLine();
        System.out.print("Nhap tung do: ");
        this.tungDo = scannner.nextDouble();
        System.out.print("Nhap hoanh do: ");
        this.hoanhDo = scannner.nextDouble();
        scannner.nextLine();
    }

    private static String dinhDang(double x) {
        if (x == (long) x) {
            return String.valueOf((long) x);
        }
        return String.valueOf(x);            
    }

    public void in() {
        System.out.println(tenDiem + "(" + dinhDang(tungDo) + ", " + dinhDang(hoanhDo) + ")");
    }
}



