import java.util.Scanner;

public class DACBP {

	public static void main(String[] args) {
		int a;
		double alan,cevre,dda;
	
		Scanner inp = new Scanner(System.in);
		System.out.println("L�tfen Dairenin Yar� �ap�n� Giriniz");
		a=inp.nextInt();
		alan=3.14*a*a;
		cevre=2*3.14*a;
		System.out.println("Alan: "+alan);
		System.out.println("�evre: "+cevre);
		dda=(3.14*(a*a)*alan)/360; //Merkez A��s�n�n �l��s� a nedir tam anlayamad���m i�in alanla �arpt�m
		System.out.println("Daire diliminin alan�: "+dda);

	}

}
