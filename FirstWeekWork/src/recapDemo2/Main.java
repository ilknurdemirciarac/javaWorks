package recapDemo2;

public class Main {

	public static void main(String[] args) {
		//double[] myList=new double[4];
		
		double[] myList= {1.2,1.3,1.4,5.6};
		double total=0;
		double max=myList[0];
		//sayıları ekrana yazdırdım
		
		for (double number:myList) {
			System.out.println(number);
		}
		//sayıların toplamını ekrara yazdıralım
		
		for (double number:myList) {
			total=total+number;
			System.out.println(number);
		}
		System.out.println("Toplam : "+total);
		
		//enbüyük eleman
		
		for (double number:myList) {
			if (max<number) {
				max=number;				
			}
		}
		System.out.println("En Büyük sayı : "+max);
		


	}

}
