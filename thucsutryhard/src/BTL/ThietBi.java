package BTL;

import java.util.Objects;
import java.util.Scanner;

public class ThietBi {
    public ThietBi(String id) {
        this.id = id;
    }

    public ThietBi(int soTB) {
        this.soTB = soTB;
    }

    public int getSoTB() {
        return soTB;
    }

    public void setSoTB(int soTB) {
        this.soTB = soTB;
    }

    int soTB;
    String id,name,describe;

    public ThietBi() {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.quantity = quantity;
        this.price = price;
    }

    int quantity;
    double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void NhapTB(){
        Scanner sc= new Scanner(System.in);
        while (true){
            try{
                System.out.println("Nhập tên thiết bị:");
                name = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại!");
                sc.nextLine();
            }
        }
        while (true){
            try{
                System.out.println("Nhập mã thiết bị:");
                id = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại!");
                sc.nextLine();
            }
        }
        while (true){
            try{
                System.out.println("Mô tả thiết bị:");
                describe = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại!");
                sc.nextLine();
            }
        }
        while (true){
            try{
                System.out.println("Nhập số lượng thiết bị:");
                quantity = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại!");
                sc.nextLine();
            }
        }
        while (true){
            try{
                System.out.println("Nhập giá thiết bị:");
                price = sc.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Bạn hãy nhập lại!");
                sc.nextLine();
            }
        }
    }

    @Override
    public String toString() {
        return "ThietBi{" +
                "soTB=" + soTB +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
    public int CompareTo(ThietBi o){
        return this.id.compareTo(o.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThietBi thietBi = (ThietBi) o;
        return Objects.equals(id, thietBi.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
