package abstrak;

public class Kotak extends BangunDatar {
	int panjang,lebar;
    @Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getJumlahSisi() {
		int jumlahSisi = 4;
		return jumlahSisi;
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getLuas(int panjang, int lebar) {
		return panjang*lebar;
		
	}

	@Override
	public double getKeliling(int panjang, int lebar) {
		// TODO Auto-generated method stub
		return (2*panjang)+(2*lebar);
		
	}

	public static void main(String args[]){
		BangunDatar obj = new Kotak();
		System.out.println("Jumlah Sisi = "+obj.getJumlahSisi());
		System.out.println("Luas Kotak = "+obj.getLuas(3, 7));
		System.out.println("Keliling Kotak = "+obj.getKeliling(4,3));

	   }

    
}
