package Pertemuan7;

import java.util.ArrayList;
import java.util.List;

public class NilaiMain {
	
	private List<Nilai> listNilai;
	private List<Mahasiswa> listMhs;
	private List<Matakuliah> listMk;
	
	public NilaiMain(){
		this.listNilai = new ArrayList<Nilai>();
		this.listMhs = new ArrayList<Mahasiswa>();
		this.listMk = new ArrayList<Matakuliah>();
	}
	
	public void initMhs(){
		listMhs.add(new Mahasiswa("113040100","Asep B0udi Cahyadi","Pekanbaru"));
		listMhs.add(new Mahasiswa("113040200","Doni Eka Fauzi","Makasar"));
	}
	
	public void initMatkul(){
		listMk.add(new Matakuliah("IF123","RKPPL",3));
		listMk.add(new Matakuliah("IF234","PSBK",3));
	}
	
	public void initNIlai(){
		listNilai.add(new Nilai(listMhs.get(0), listMk.get(0), 3.0));
		listNilai.add(new Nilai(listMhs.get(1), listMk.get(1), 4.0));
		listNilai.add(new Nilai(listMhs.get(0), listMk.get(0), 4.0));
		listNilai.add(new Nilai(listMhs.get(1), listMk.get(1), 3.0));
	}
	
	public void tampilanMhs(){
		for(Mahasiswa mhs : listMhs){
			System.out.println(mhs);
		}
	}
	
	public void tampilanMatkul(){
		for(Matakuliah mk : listMk){
			System.out.println(mk);
		}
	}
	public void tampilanNilai(){
		for(Nilai n : listNilai){
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		NilaiMain nm = new NilaiMain();
		nm.initMhs();
		nm.initMatkul();
		nm.initNIlai();
		System.out.println("================LIST MAHASISWA=============");
		nm.tampilanMhs();
		System.out.println("================LIST MATAKULIAH=============");
		nm.tampilanMatkul();
		System.out.println("================LIST NILAI=============");
		nm.tampilanNilai();
		System.out.println("============================================");
	}
}
