package abstrak;

public class Segitiga extends BangunDatar {
	int alas,tinggi;
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
		int jumlahSisi = 3;
		return jumlahSisi;
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getLuas(int alas, int tinggi) {
		double luas = alas*tinggi*0.5; 
		return luas;
		
	}

	@Override
	public double getKeliling(int alas,int tinggi) {
		// TODO Auto-generated method stub
		return alas+alas+alas;
		
	}

	public static void main(String args[]){
		BangunDatar obj1 = new Segitiga();
		System.out.println("Jumlah Sisi = "+obj1.getJumlahSisi());
		System.out.println("Luas Segitiga = "+obj1.getLuas(9, 7));
		System.out.println("Keliling Segitga Sama Sisi = "+obj1.getKeliling(4,0));

	   }

    
}
