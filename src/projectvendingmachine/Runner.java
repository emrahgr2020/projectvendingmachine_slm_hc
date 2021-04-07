package projectvendingmachine;

public class Runner {

	public static void main(String[] args) {
		
		Products product = new Products();//to String ==> Static olmadigi icin obje olusturarak ulasabiliriz
		//System.out.println(product.toString());//toString i cagirdik
		
		
		Methods methods= new Methods();//select Methods classinda oldugundan obje olusturup cagiriyoruz
		
		System.out.println("Merhaba, alisverise hosgeldiniz!....");
		double money = methods.money();
		System.out.println("Hesabinizda "+ money+ " dollar var");
		System.out.println(methods.select(product));
		money= methods.balance(product.getPrice(), money, product);
		methods.purchase(product.getPrice(), money, product);
	}

}
