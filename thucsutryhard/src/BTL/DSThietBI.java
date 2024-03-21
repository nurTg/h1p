package BTL;

import BTL.ThietBi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DSThietBI implements Serializable {
    ArrayList<ThietBi> DSTB = new ArrayList<ThietBi>();

    public void nhapDSTB() {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            try {
                System.out.println("Nhập số lượng thiết bị có trong danh sách:");
                n = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại!");
                sc.nextLine();
            }
        }
        for (int i=0;i<n;i++){
            ThietBi e = new ThietBi();
            if(DSTB.size()==0){
                e.setSoTB(0);
            }else {
                e.setSoTB(DSTB.size());
            }
            System.out.println("\n Nhập thông tin phòng thứ"+(DSTB.size()+1)+":");
            e.NhapTB();
            DSTB.add(e);
        }
    }
    public void hienDSTB(){
        for(ThietBi thietBi: DSTB){
            System.out.println(thietBi.toString());
        }
    }
    public boolean checkTB(ThietBi e){
        return DSTB.contains(e);
    }
    public boolean xoaTB(ThietBi e){
        return DSTB.remove(e);
    }
    public void TimTB(){
        for( ThietBi thietBi :DSTB){
            if(thietBi.getId().indexOf(thietBi.id)>=0);
            System.out.println(thietBi);
        }
    }
    public void sapXep(){
        Collections.sort(DSTB, new Comparator<ThietBi>() {
            @Override
            public int compare(ThietBi o1, ThietBi o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (ThietBi thietBi :DSTB){
            System.out.println(thietBi);
        }
    }
}
