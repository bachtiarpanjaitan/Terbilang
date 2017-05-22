/**
 * 
 */
package Bataxdev;

/**
 * @author bachtiarpanjaitan
 *
 */
public class Terbilang {

	/**
	 * 
	 */
	long angka;
	private static String[] bilangan = {" ", "Satu", "Dua", "Tiga", "Empat", "Lima",
			"Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
	
	public Terbilang(long input) {
		// TODO Auto-generated constructor stub
		this.angka = input;
		Konversi(input);
	}
	
	public static String Konversi(long inputBilangan){
		if(inputBilangan < 12){
			return "" + bilangan[(int)inputBilangan];
		}
		else if(inputBilangan < 20){
			return Konversi(inputBilangan - 10) + " Belas ";
		}
		else if(inputBilangan < 100){
			return (Konversi(inputBilangan / 10) + " Puluh ") +  Konversi(inputBilangan % 10); 
		}
		else if(inputBilangan < 200 ){ 
			return "Seratus " + Konversi(inputBilangan - 100);
		}
		else if(inputBilangan < 1000){
			return (Konversi(inputBilangan / 100) + " Ratus " ) + Konversi(inputBilangan % 100);
		}
		else if(inputBilangan < 2000){
			return "Seribu " + Konversi(inputBilangan - 1000);
		}
		else if(inputBilangan < 1000000){
			return (Konversi(inputBilangan /1000) + " Ribu ") + Konversi(inputBilangan % 1000);
		}
		else if(inputBilangan < 1000000000){
			return (Konversi(inputBilangan /1000000) + " Juta ") + Konversi(inputBilangan % 1000000);
		}
		return null;
	}

}
