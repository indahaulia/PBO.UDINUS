package abstrak;

public abstract class BangunDatar {
    int x,y,z;
    int jumlahSisi;
	
	public void pindahkan(int a, int b)
	{
		x = a;
		y = b;
	}
	public abstract void draw();
	public abstract void resize();
	public abstract int getJumlahSisi();
	public abstract double getLuas(int x, int y);
	public abstract double getKeliling(int x, int y);


}
