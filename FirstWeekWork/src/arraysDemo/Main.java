package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1="Ramazan";
		String ogrenci2="İbrahim";
		String ogrenci3="Rana";
		String ogrenci4="İsmail";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		
		String[] ogrenciler= new String[4];
		ogrenciler[0]="Ramazan";
		ogrenciler[1]="İbrahim";
		ogrenciler[2]="İsmail";
		ogrenciler[3]="İlknur";
		//ogrenciler[4]="İlknur";
		
		System.out.println("for döngüsü");
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("foreach döngüsü");
		for (String ogrenci : ogrenciler) {
			
			System.out.println(ogrenci);
			
		}

	}

}
