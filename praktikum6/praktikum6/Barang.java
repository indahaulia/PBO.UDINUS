package praktikum6;
import java.util.Scanner;

public class Barang {
    String nama;
    Barang next;
    public static Scanner in=new Scanner(System.in);
    public static Scanner str=new Scanner(System.in);
    public void input(){
        System.out.print("Masukkan Nama Barang        : ");
        nama=str.nextLine();
        next=null;
    }
    public void view(){
        System.out.println("Stock Barang        : "+nama);
    }
    public static void main(String[] args) {
        int menu=0;
        Stack st=new Stack();
        while(menu!=5){
            System.out.print("1.Tambahkan stock buku (push)\n2.Hapus stock buku (pop)\n3.Lihat Stock (view)\n4.Cek Stock (isEmpty)\n5.Exit\n silahkan pilih (angka): ");
            menu=in.nextInt();
            if(menu==1){
                Barang baru=new Barang();
                baru.input();
                st.push(baru);
            }
            else if(menu==2) st.pop();
            else if(menu==3) st.view();
            else if(menu==4) st.isEmpty();
            else if(menu==5) System.out.println("keluar . . .");
            else System.out.println("salah . . .");
            System.out.println(" ");
        }
    }
}
