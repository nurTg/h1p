package met;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DSSV {
    private ArrayList<SinhVien> danhSach;

    public DSSV(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public DSSV() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    public void themSinhVien(SinhVien sv) {
        this.danhSach.add(sv);
    }

    public void inDSSV() {
        for (SinhVien sinhVien : danhSach) {
            System.out.println(sinhVien);
        }
    }
    public boolean Checkempty(){
        return this.danhSach.isEmpty();
    }
    public int SoLuongSinhVien(){
        return this.danhSach.size();
    }
    public void LamRongDanhSach(){
        this.danhSach.removeAll(danhSach);
    }
    public boolean kiemTraTonTai(SinhVien sv){
        return this.danhSach.contains(sv);
    }
    public boolean xoaSinhVien(SinhVien sv){
        return this.danhSach.remove(sv);
    }
    public void timSinhVien(String ten){
        for(SinhVien sinhVien : danhSach){
            if(sinhVien.getTen().indexOf(ten)>=0){
                System.out.println(sinhVien);
            }
        }
    }
    public void sapXepSinhVienGiamDanTheoDiem(){
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if(sv1.getNamsinh()<sv2.getNamsinh()){
                    return -1;
                }else if(sv1.getNamsinh()>sv2.getNamsinh()){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
    }
}