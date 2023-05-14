package entities;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double cover() {
		double cover;
		if(feeding() >30) {
			cover = 0.0;
		}else {
			cover = 4.0;
		}
		return cover;
	}	
		public double feeding() {
			return(5.0 * beer) + (3.0 * softDrink)+(7.0 * barbecue);
		}
		
		public double ticket() {
			double ticket = 0.0;
			if (gender == 'M') {
				ticket = (double) 10;				
			} else {
				ticket = 8.0;
			}
			return ticket;
		}
		public double total() {
			return cover()+feeding()+ticket();
		}
		public String toString() {
			String coverFinal;
			if(cover() == 0.0) {
				coverFinal = "VOCÊ ESTÁ ISENTO DE COUVERT!!";
			}else {
				coverFinal = "ATENÇÃO COUVERT = R$ " + String.format("%.2f", cover());
			}
			
			return "\n====  RELATÓRIO FINAL  =======\n" 
			+ "SEU CONSUMO R$ " + String.format("%.2f%n", feeding()) 
			+ coverFinal + "\r\n" 
			+ "INGRESSO R$ " + String.format("%.2f%n", ticket()) 
			+ "\r\n" + "VALOR TOTAL A SER PAGO:  " + String.format("%.2f%n", total());		

	}
}