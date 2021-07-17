
public class Main {

	public static void main(String[] args) {
		
		Smartphone sm = new Smartphone("Xmi","England","1c");
		Notebook nt = new Notebook("Lenovo","USA","1d");
		Powerbank pb = new Powerbank("Solar","Danmark","1k");
		
		Kabel kab = new Kabel("Solar","Danmark","1d","1k");
		
		if(nt.get(pb, kab)) {
			System.out.println("Podhodit");
		}
		else  {
			System.out.println("Ne podhodit");
		}

	}

}
