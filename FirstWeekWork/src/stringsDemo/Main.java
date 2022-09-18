package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel";
		System.out.println(mesaj);
		System.out.println("Eleman sayısı : "+mesaj.length());
		System.out.println("5. eleman : "+mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşaşın!"));
		System.out.println(mesaj.startsWith("B")); //b ile başlıyorsa true
		System.out.println(mesaj.startsWith("A"));// a ile başlamıyorsa false
		System.out.println(mesaj.endsWith("l")); //l ile başlıyorsa true
		System.out.println(mesaj.endsWith("A"));// a ile başlamıyorsa false
		
		char[] karakterler=new char[5];
		mesaj.getChars(0, 5, karakterler, 0);//k-karakterleri ver
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("e"));

		System.out.println(mesaj.replace(' ','-'));//yeni bir metin veriyor boşluklara - işareti koyduk
		System.out.println(mesaj);
		
		//metinden parça alalım
		
		System.out.println(mesaj.substring(2));//2. indexten itibaren kes
		System.out.println(mesaj.substring(2, 5));//2 den başla 5 e kadar al 5 dahil değil
		
		//parçalama yapoalım kelimeler alt alta yazacaktır split
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); //küçük harfe çevir
		System.out.println(mesaj.toUpperCase()); //büyük harfe çevir
		mesaj="   Bugün hava çok güzel   ";//nbaşında ve sonundaki boşlukları atalım trim
		System.out.println(mesaj);
		System.out.println(mesaj.trim());
	}

}
