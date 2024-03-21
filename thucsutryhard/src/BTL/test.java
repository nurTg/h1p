package BTL;

import java.io.IOException;
import java.util.Scanner;

public class test {

    public static void menu() {
        System.out.println("MENU------------");
        System.out.println("1. Nhập danh sách thiết bị");
        System.out.println("2. Hiện danh sách thiết bị");
        System.out.println("0. Thoát");
    }

    public static void main(String[] args){
        DSThietBI dstb = new DSThietBI();
        Scanner sc = new Scanner(System.in);
        int lc = 0;
        do {
            menu();
            while (true) {
                try {
                    System.out.println("Vui lòng nhập chức năng");
                    lc = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Vui lòng nhập lại");
                    sc.nextLine();
                }
            }
            switch (lc){
                case 1:
                    dstb.nhapDSTB();break;
                case 2:
                    dstb.hienDSTB();break;
                case 3:
                    System.out.println("Nhập id thiết bị cần kiểm tra:");String id= sc.nextLine();
                    ThietBi e= new ThietBi(id);
                    System.out.println("Thiết bị có tồn tại hay không:"+dstb.checkTB(e));break;
                case 4:
                    System.out.println("Nhập id thiết bị cần xóa:");
                    id = sc.nextLine();
                    e = new ThietBi(id);
                    System.out.println("Tình trạng xóa:"+dstb.xoaTB(e));break;
                case 5:
                    System.out.println("Nhập id thiết bị cần tìm kiếm:");
                    id = sc.nextLine();
                    dstb.TimTB();
                case 6:
                    dstb.sapXep();
            }

        }while (lc!=0);
    }
}
