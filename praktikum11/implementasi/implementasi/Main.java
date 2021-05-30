package implementasi;

public class Main {
    public static void main(String[] args) {
        
        // membuat objek kotak
        Resizeable objek = new Kotak();
        System.out.println("Luas = "+objek.getLuas(4, 5));
        System.out.println("Keliling = "+objek.getKeliling(4, 5));
        System.out.println("Luas 2x ukuran = "+objek.resizeLuas(4, 5));
        System.out.println("Keliling 2x ukuran = "+objek.resizeKeliling(4, 5));
    }
    
}
