package Pertemuan7;

public class Matakuliah {
	
	private String idMatkul;
	private String namaMatkul;
	private int sks;
	
	public Matakuliah(){
		
	}
	
	public Matakuliah(String idMatkul, String namaMatkul, int sks){
		super();
		this.idMatkul = idMatkul;
		this.namaMatkul = namaMatkul;
		this.sks = sks;
	}

	public String getIdMatkul() {
		return idMatkul;
	}

	public void setIdMatkul(String idMatkul) {
		this.idMatkul = idMatkul;
	}

	public String getNamaMatkul() {
		return namaMatkul;
	}

	public void setNamaMatkul(String namaMatkul) {
		this.namaMatkul = namaMatkul;
	}

	public int getSks() {
		return sks;
	}

	public void setSks(int sks) {
		this.sks = sks;
	}

	@Override
	public String toString() {
		return "Matakuliah [idMatkul=" + idMatkul + ", namaMatkul="
				+ namaMatkul + ", sks=" + sks + "]";
	}
	
	
}
