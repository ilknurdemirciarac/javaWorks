package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		//Türkiye'deki bölgeler ve bölgelerdeki şehirler için
		
		String[][] sehirler=new String[7][4];
		sehirler[0][0]="İstanbul";
		sehirler[0][1]="Edirne";
		sehirler[0][2]="Tekirdağ";
		sehirler[0][3]="Bursa";
		sehirler[1][0]="Ankara";
		sehirler[1][1]="Çankırı";
		sehirler[1][3]="Kayseri";
		sehirler[1][3]="Nevşehir";
		sehirler[2][0]="İzmir";
		sehirler[2][1]="Manisa";
		sehirler[2][2]="Aydın";
		sehirler[2][3]="Muğla";
		sehirler[3][0]="Antalya";
		sehirler[3][1]="Mersin";
		sehirler[3][2]="Adana";
		sehirler[3][3]="Burdur";
		sehirler[4][0]="Erzurum";
		sehirler[4][1]="Kars";
		sehirler[4][2]="Ardahan";
		sehirler[4][3]="Iğdır";
		sehirler[5][0]="Gaziantep";
		sehirler[5][1]="Şanlıurfa";
		sehirler[5][2]="Siirt";
		sehirler[5][3]="Adıyaman";
		sehirler[6][0]="Ordu";
		sehirler[6][1]="Kastamonu";
		sehirler[6][2]="Trabzon";
		sehirler[6][3]="Samsun";
		
		
		for (int i = 0; i < sehirler.length;i++ ) {
			
			
			switch (i) {
			case 0:
				System.out.println("Marmara Bölgesi");				
				break;
			case 1:
				System.out.println("İç Anadolu Bölgesi");				
				break;
			case 2:
				System.out.println("Ege Bölgesi");				
				break;
			case 3:
				System.out.println("Akdeniz Bölgesi");				
				break;
			case 4:
				System.out.println("Doğu Anadolu Bölgesi");				
				break;
			case 5:
				System.out.println("Güneydoğu Anadolu Bölgesi");				
				break;
			case 6:
				System.out.println("Karadeniz Bölgesi");				
				break;	

			default:
				break;
			}
			System.out.println("****************************");
			for(int j=0;j<4;j++) {
			System.out.println(sehirler[i][j]);
				
			}
			System.out.println("****************************");
			
			
		}
		
		
		

	}

}
