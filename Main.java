import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Point p1 = new Point();
        p1.in();                       

        Point p2 = new Point(4, 2);   
        p2.in();                       

        Point p3 = new Point("BB", 1.5, 3);
        p3.in();

        p3.setTenDiem("C");
        p3.setHoanhDo(7);
        p3.setTungDo(8.5);
        System.out.println(p3.getTenDiem() + " " + p3.getHoanhDo() + " " + p3.getTungDo());
        p3.in();                

        Point p4 = new Point();
        p4.nhap(scanner);
        p4.in();

        scanner.close();
    }
}
