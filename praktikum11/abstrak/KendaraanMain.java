package abstrak;

public class KendaraanMain {
    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan();

        int jumlahroda = 4;
		mobil.setJumlahRoda(jumlahroda);
		
		System.out.println(mobil.getJumlahRoda());
        
    }
}
