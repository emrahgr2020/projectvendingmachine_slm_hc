package projectvendingmachine;

public class Products {
//private yaptik cunku diger class lardan degisiklik yapilamasin
	
	private double snicker 		= 2.5;
	private double chipsAhoy 	= 2.2;
	private double pringles 	= 12.99;
	private double milano 		= 14.3;
	private double reeses 		= 3.9;
	private double cocaCola 	= 2.2;
	private double fanta 		= 2.0;
	private double water 		= 1.0;
	private double arizona 		= 1.5;
	private double skittles 	= 1.99;
	private int productNum;//musterinin secimini saklamak icin yer ayirdim
	private double price;//musteri secim yaptiktan sonra fiyatini saklamak icin
	
	//Source den getter ve setter sectik
	
	public double getSnicker() {
		return snicker;
	}
	
	public double getChipsAhoy() {
		return chipsAhoy;
	}
	
	public double getPringles() {
		return pringles;
	}
	
	public double getMilano() {
		return milano;
	}
	
	public double getReeses() {
		return reeses;
	}
	
	public double getCocaCola() {
		return cocaCola;
	}
	
	public double getFanta() {
		return fanta;
	}
	
	public double getWater() {
		return water;
	}
	
	public double getArizona() {
		return arizona;
	}
	
	public double getSkittles() {
		return skittles;
	}
	
	public int getProductNum() {
		return productNum;
	}
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//Source girerek Generate toString yaparak listeledik
	//Listeye istedigimiz degisiklikleri elle yaptik $ isareti parantezi kaldirma, alt satira yazma gibi
	@Override
	public String toString() {
		return "Prodacts \n1.Snicker = $" + snicker + "\n2.ChipsAhoy = $" + chipsAhoy + "\n3.Pringles = $" + pringles + "\n4.Milano = $"
				+ milano + "\n5.Reeses = $" + reeses + "\n6.CocaCola = $" + cocaCola + "\n7.Fanta = $" + fanta + "\n8.Water = $" + water
				+ "\n9.Arizona = $" + arizona + "\n10.Skittles = $" + skittles;
	}
	

}
