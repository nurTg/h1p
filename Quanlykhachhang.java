package quanlynhaga;

import java.util.Iterator;
import java.util.Vector;
import java.util.List;
import java.util.Scanner;

public class Quanlykhachhang {
    List<Khachhang> dsKhachhang;
    public Quanlykhachhang(){
        dsKhachhang =new  Vector<Khachhang>();
    }
    public boolean isCheckCMND(String CMND){
        Iterator<Khachhang> it = dsKhachhang.iterator();
        while(it.hasNext()){
            //Kiem tra xem so CMND da ton tai hay chua
            Khachhang khachhang = it.next();
            if(khachhang.CMND.equals(CMND)){
                return  true;
            } 
        }
        return  false;
    }
    public Khachhang searchCMND(String CMND){
        Iterator<Khachhang> it = dsKhachhang.iterator();
        while(it.hasNext()){
            Khachhang khachhang = it.next();
            if(khachhang.CMND.equals(CMND)){
                return  khachhang;
            }
        }
        return null;
    }
    public boolean themKhach(){
        Danhsachcho danhsachcho = new Danhsachcho();
        danhsachcho.input();
        if(isCheckCMND(danhsachcho.CMND) == false){
            dsKhachhang.add(danhsachcho);
            return true;
        }
        return  false;
    }
    public Khachhang searchtenKH(String tenKH){
        Iterator<Khachhang> it = dsKhachhang.iterator();
        while(it.hasNext()){
            Khachhang khachhang = it.next();
            if(khachhang.tenKH.equals(tenKH)){
                return  khachhang;
            }
        }
        return null;
    }
    public boolean Banve(String cmnd){
        Iterator<Khachhang> it = dsKhachhang.iterator();
        while(it.hasNext()){
            //kiem tra xem cmnd da ton tai hay chua
            Khachhang khachhang = it.next();
            if( khachhang instanceof Danhsachcho){
                if(khachhang.CMND.compareTo(cmnd)==0){
                    //thuc hien cap nhat ga den
                    System.out.println("Nhap ga den: ");
                    String gaden = new Scanner(System.in).nextLine();
                    ((Danhsachcho) khachhang).gaDen = gaden;
                    System.out.println("Nhap gia tien: ");
                    double gia = new Scanner(System.in).nextDouble();
                    ((Danhsachcho) khachhang).giaTien = gia;
                    return true; 
                }else{
                    Danhsachdabanve danhsachdabanve = new Danhsachdabanve();
                    danhsachdabanve.input();
                    Danhsachcho danhsachcho = new Danhsachcho();
                    dsKhachhang.remove(danhsachcho);
                }
            }
            
        }
        return false;
    }
    public boolean huyVe(String tenKH){
        Khachhang khachhang = searchtenKH(tenKH);
        if(khachhang !=null){
            System.out.println("Ban co muon xoa phong " + khachhang.tenKH + "? \n1. Co, 2. Khong");
            int chon = new Scanner(System.in).nextInt();
            if(chon == 1){
                dsKhachhang.remove(khachhang);
                return  true;
            }else{
            return  false;
            }
        }
        return false;  
    }
    public void HienDS(){
        for (Khachhang khachhang : dsKhachhang) {
            khachhang.toString();
        }
    }
}
