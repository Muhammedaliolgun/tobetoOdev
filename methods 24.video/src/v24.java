
public class v24 {

	public static void main(String[] args) {
		sayibulmaca();
		sayibulmaca();
		sayibulmaca();
		sayibulmaca();
	}
	
	public static void sayibulmaca() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6 ;
		boolean varMi = false ;
		
		
		for (int sayi : sayilar ) {
			if (sayi==aranacak) {
				varMi= true;
				break;
			}
		}
		
		String mesaj="";
		if(varMi) {
			mesaj = "Sayı mevcuttur : "+aranacak ;
			mesajVer(mesaj);
		}else {
			mesajVer("Sayı mevcut değil : "+aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
