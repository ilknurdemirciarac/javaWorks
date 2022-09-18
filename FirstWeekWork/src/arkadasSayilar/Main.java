package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// SAyı dizisi olsun
		
				int[] sayilar=new int[] {1,2,3,4,5,6,7,8,19,0};
				int aranacak=5;
				
				boolean varMi=false;
				
				for (int i = 0; i < sayilar.length; i++) {
					if(aranacak==sayilar[i])
					{
						varMi=true;
						break;
					}
				}
				if(varMi) {
					System.out.println("SAyı bulundu");
					}
				else {
						System.out.println("SAyı yoktur");

					}

	}

}
