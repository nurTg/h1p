package quanlynhaga;
import java.util.Scanner;
public class Khachhang {
    String CMND;
    String tenKH;
    String gaDen;
    double giaTien;

    public Khachhang(String CMND, String tenKH, String gaDen, double giaTien) {
        this.CMND = CMND;
        this.tenKH = tenKH;
        this.gaDen = gaDen;
        this.giaTien = giaTien;
    }

    public Khachhang() {
    }

    @Override
    public String toString() {
        return "Khachhang{" + "CMND=" + CMND + ", tenKH=" + tenKH + ", gaDen=" + gaDen + ", giaTien=" + giaTien + '}';
    }
    public void input(){
        System.out.println("Nhap CMND: ");
        CMND = new Scanner(System.in).nextLine();
        System.out.println("Nhap ten khach hang: ");
        tenKH = new Scanner(System.in).nextLine();
        System.out.println("Nhap ga den: ");
        gaDen = new Scanner(System.in).nextLine();
        System.out.println("Nhap gia tien: ");
        double gia = new Scanner(System.in).nextDouble();
        giaTien = gia>0? gia:0;
    }
    
}
