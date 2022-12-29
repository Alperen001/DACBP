import java.util.Scanner;

public class DACBP {

	public static void main(String[] args) {
		int a;
		double alan,cevre,dda;
	
		Scanner inp = new Scanner(System.in);
		System.out.println("Lütfen Dairenin Yarý Çapýný Giriniz");
		a=inp.nextInt();
		alan=3.14*a*a;
		cevre=2*3.14*a;
		System.out.println("Alan: "+alan);
		System.out.println("Çevre: "+cevre);
		dda=(3.14*(a*a)*alan)/360; //Merkez Açýsýnýn Ölçüsü a nedir tam anlayamadýðým için alanla çarptým
		System.out.println("Daire diliminin alaný: "+dda);

	}

}
