public class Berkaki extends Binatang{
	
	public String jenisBinatang;
	public String makana;


	public Berkaki(String nama, String jenisBinatang){
		super(nama);		
		this.jenisBinatang = jenisBinatang;
	}

	public Berkaki(String nama){
		super(nama);
	}


	public void showJnsBinatang(){
		System.out.println("Jenis Binatang = "+jenisBinatang);
	}

	public void showMakanan(String makanan){
		System.out.println("Makanan = "+makanan);
	}
}