package implementasi;

public class Kotak implements Resizeable {

    public double resizeLuas(int panjang, int lebar) {
        double luas = (2*panjang)*(2*lebar);
        return luas;
     
    }
    public double resizeKeliling(int panjang, int lebar) {
        panjang = 2*panjang;
        lebar = 2*lebar;
        double keliling = ((2*panjang) * (2*lebar));
        return keliling;
     
    }

    public double getLuas(int panjang, int lebar) {
        return panjang * lebar;
     
    }

    public double getKeliling(int panjang, int lebar) {
        return ((2*panjang) * (2*lebar));
       
    }


}
