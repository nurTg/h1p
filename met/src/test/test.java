package test;

import met.DSSV;
import met.SinhVien;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DSSV dssv = new DSSV();
        int lc=0;
        do{
            System.out.println("MENU------------");
            System.out.println("Vui long lua chon chuc nang:");
            System.out.println("1.   Them sinh vien vao danh sach\n" +
                               "2    Hien danh sach sinh vien\n"+
                               "3    Kiem tra danh sach co rong hay khong\n"
                            +  "4    Lay ra so luong sinh vien trong danh sach\n"
            +                  "5    Lam rong danh sach sinh vien\n"
            +                  "6    Kiem tra sinh vien co ton tai co trong danh sach hay khong dua ten ten\n"
            +                  "7    Xoa sinh vien dua tren ten sinh vien\n"
            +                  "8    Tim sinh vien theo ten\n"
            +                  "9    Sap xep sinh vien tu thap den lon theo nam sinh\n");
            lc= sc.nextInt();
            sc.nextLine();
            if(lc==1){
                System.out.println("Nhap ten SV:"); String ten = sc.nextLine();
                System.out.println("Nhap nam SV");int namsinh= sc.nextInt();
                SinhVien sv= new SinhVien(ten, namsinh);
                dssv.themSinhVien(sv);
            }else if(lc==2){
                dssv.inDSSV();
            }else if(lc==3){
                System.out.println("Danh sach rong"+dssv.Checkempty());
            }else if ((lc==4)){
                System.out.println("So luong hien tai:"+dssv.SoLuongSinhVien());
            } else if (lc==5) {
                dssv.LamRongDanhSach();
            } else if (lc==6) {
                System.out.println("Nhap ten sinh vien:"); String ten= sc.nextLine();
                SinhVien sv = new SinhVien(ten);
                System.out.println("Kiem tra sinh vien co trong danh sach"+ dssv.kiemTraTonTai(sv));
            } else if (lc==7) {
                System.out.println("Nhap ten sinh vien muon xoa:"); String ten=sc.nextLine();
                SinhVien sv = new SinhVien(ten);
                System.out.println("Xoa sinh vien trong danh sach"+ dssv.xoaSinhVien(sv));
            } else if (lc==8) {
                System.out.println("Nhap ten sinh vien muon tim"); String ten=sc.nextLine();
                SinhVien sv= new SinhVien(ten);
                System.out.println("Sinh vien can tim la");
                dssv.timSinhVien(ten);
            } else if (lc==9) {
                dssv.sapXepSinhVienGiamDanTheoDiem();
                dssv.inDSSV();
            }

        }while (lc!=0);
    }
}
