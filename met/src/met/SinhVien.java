package met;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class SinhVien implements Comparable<SinhVien> {
    String ten;
    int namsinh;

    public SinhVien(String ten) {
        this.ten = ten;
    }

    public SinhVien(String ten, int namsinh) {
        this.ten = ten;
        this.namsinh = namsinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }


    @Override
    public String toString() {
        return "SinhVien{" +
                "ten='" + ten + '\'' +
                ", namsinh=" + namsinh +
                '}';
    }
    public int compareTo(SinhVien o){
        return this.ten.compareTo(o.ten);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return Objects.equals(ten, sinhVien.ten);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ten, namsinh);
    }
}
