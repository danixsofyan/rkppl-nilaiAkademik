package Pertemuan7;

public class Nilai {
	
	private Mahasiswa mhs;
	private Matakuliah mk;
	private double nilai;
	
	public Nilai(){
		
	}
	
	public Nilai(Mahasiswa mhs, Matakuliah mk, double nilai){
		this.mhs = mhs;
		this.mk = mk;
		this.nilai = nilai;
	}

	public Mahasiswa getMhs() {
		return mhs;
	}

	public void setMhs(Mahasiswa mhs) {
		this.mhs = mhs;
	}

	public Matakuliah getMk() {
		return mk;
	}

	public void setMk(Matakuliah mk) {
		this.mk = mk;
	}

	public double getNilai() {
		return nilai;
	}

	public void setNilai(double nilai) {
		this.nilai = nilai;
	}

	@Override
	public String toString() {
		return "Nilai [mhs=" + mhs + ", mk=" + mk + ", nilai=" + nilai + "]";
	}
	
	

}
