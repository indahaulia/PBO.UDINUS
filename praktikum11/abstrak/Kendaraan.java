package abstrak;

public abstract class Kendaraan {
	private String merk;
	private String model;
	private int jumlahRoda;
	private boolean isAuto; 
	
	public String getMerk() {
		return merk;
	}
	public void setMerk(String merk) {
		this.merk = merk;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getJumlahRoda() {
		return jumlahRoda;
	}
	public void setJumlahRoda(int jumlahRoda) {
		this.jumlahRoda = jumlahRoda;
	}

	public void jenis(boolean isAuto){
		this.isAuto = isAuto;
		if(this.isAuto){
			System.out.println("Sepeda otomatis");
			}
		else{
			System.out.println("Sepeda kayuh");
			}

	}

	public abstract void nyalakan();
}