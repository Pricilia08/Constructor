public class BinatangTest{
	public static void main(String[] args) {
		Berkaki k1 = new Berkaki("Kucing");
		k1.showNama();
		k1.showJnsBinatang();
		k1.showMakanan("ikan");
		System.out.println("");

		Berkaki k2 = new Berkaki("Kelinci","Herbivora");
		k2.showNama();
		k2.showJnsBinatang();
		k2.showMakanan("wortel");
	}
}