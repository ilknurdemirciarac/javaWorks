package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		//Sesli Harfler kalın sesli bir harf ince sesli bir harf
		
		char harf='E';
		
		//8 adet durum var
		
		switch (harf) {
		case 'A':
			System.out.println("Kalın sesli bir harf");
			break;
		case 'I': 
			System.out.println("Kalın sesli bir harf");
			break;
		case 'O': 
			System.out.println("Kalın sesli bir harf");
			break;
		case 'U':
			System.out.println("Kalın sesli bir harf");
			break;
		case 'E':
			System.out.println("İnce sesli bir harf");
			break;
		case 'İ':
			System.out.println("İnce sesli bir harf");
			break;
		case 'Ö': 
			System.out.println("İnce sesli bir harf");
			break;
		case 'Ü':
			System.out.println("İnce sesli bir harf");
			break;

		default:
			break;
		}
		
		

	}

}
