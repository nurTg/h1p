package quanlynhaga;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Quanlykhachhang quanlykhachhang = new Quanlykhachhang();
        int chon;
        while(true){
            menu();
            chon = new Scanner(System.in).nextInt();
            switch(chon){
                case 1:
                    System.out.println("Them khach hang moi");
                    quanlykhachhang.themKhach();
                    break;
                case 2:
                    System.out.println("Nhap so CMND: ");
                    String cmnd = new Scanner(System.in).nextLine();
                    quanlykhachhang.Banve(cmnd);
                    break;
                case 3:
                    quanlykhachhang.HienDS();
                    break;
                case 4:
                    System.out.println("Moi nhap ten khach hang can huy ve: ");
                    String ten = new Scanner(System.in).nextLine();
                    quanlykhachhang.huyVe(ten);
                    break;
                default:
                        break;
            }
            if(chon <=0 || chon >4){
                break;
            }
        }
    }
    public static void menu(){
        System.out.println("Quan ly nha ga: ");
        System.out.println("1. Them khach moi");
        System.out.println("2. Ban ve cho khach hang");
        System.out.println("3. Hien danh sach khach hang");
        System.out.println("4. Huy mua ve");
        System.out.print("Lua chon chua ban la: ");
    }
}
// chua xong
