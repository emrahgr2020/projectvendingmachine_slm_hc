package projectvendingmachine;

import java.util.Scanner;

public class Methods {
	public double money() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kac dollar yatirmak istersiniz?");
		double money = scan.nextDouble();
		return money;

	}
//Urunleri listeliyor Urun numarasini musteriye sectirtiyor secilen urun fiyatini return ediyor
	
	public double select(Products product) {// musteriye secim yaptirip fiyat gosterecegiz
											// Products product yazmamin sebebi urunler bu class da oldugundan
											// bu classa ulasmaliyim

		System.out.println(product.toString());// urunleri gosteriyoruz

		Scanner scan = new Scanner(System.in);//musteriye secim yaptiriyoruz

		do {
			System.out.println("Lutfen almak istediginiz urunun numarasinigiriniz(1'den 10'a kadar)");//musteriye mesaj veriyoruz
			System.out.println("Cikis icin '0' a basiniz");
			product.setProductNum(scan.nextInt());// setProductNum musteriden gelen secimi ekledik
			if (product.getProductNum() < 0 || product.getProductNum() > 10) {//yanlis girdiginde duzeltsin diye
				System.out.println("Gecerli bir product numarasi giriniz(1'den 10'a kadar)");
			}

		} while (product.getProductNum() < 0 || product.getProductNum() > 10);//urun sectiriyoruz

		switch (product.getProductNum()) {
		case 0:
			System.out.println("Tesekkur eder tekrar bekleriz...");
			break;
		case 1:
			product.setPrice(product.getSnicker());// fiyati set ediyoruz Snicker in fiyatini getirerek
			break;
		case 2:
			product.setPrice(product.getChipsAhoy());//fiyatini aliyoruz
			break;
		case 3:
			product.setPrice(product.getPringles());
			break;
		case 4:
			product.setPrice(product.getMilano());
			break;
		case 5:
			product.setPrice(product.getReeses());
			break;
		case 6:
			product.setPrice(product.getCocaCola());
			break;
		case 7:
			product.setPrice(product.getFanta());
			break;
		case 8:
			product.setPrice(product.getWater());
			break;
		case 9:
			product.setPrice(product.getArizona());
			break;
		case 10:
			product.setPrice(product.getSkittles());
			break;
		}
		return product.getPrice();
	}
	
	
	public double balance(double price, double money, Products product) {//balance==bakiye
		//double price, double money, Products product bunlari yazmamizin sebebi
		//bakiyeyi etkileyen unsurlar olmasi
		double eklenecek;
		
		while(money<price) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Bakiye yetersiz, para eklemek istermisiniz ? (Y/N)");
			
			char onay= scan.next().toUpperCase().charAt(0);
			
			if(onay=='N') {//para ekleniyecek cikartiyoruz
				System.out.println("Bakiyeniz "+money);
				System.out.println("Tesekkur eder tekrar bekleriz...");
				break;
			}else if(onay=='Y') {//para ekliyoruz
				System.out.println("Ne kadar eklemek istersiniz");
				eklenecek=scan.nextDouble();
				money +=eklenecek;
				System.out.println("Hesabinizda "+money+" dollar var");
				
				price = select(product);//liste gelsin diye ve sonra paradondurecek diye price ye atadik
				
			}else {
				System.out.println("Lutfen 'Y' veya 'N' seciniz");
			}
		}
		return money;
	}
	
	
	
	
	
	public void purchase(double price, double money, Products product) {//purchase==satin almak  
		char onay='Y';
		while(money>=product.getPrice()) {//bu sart olunca devreye girecek satin alma methodu
			
			money-=product.getPrice();
			System.out.println("Hesabinizda "+money+" dollar var");
			
			Scanner scan= new Scanner (System.in);
			System.out.println("Alisverise devam etmek istermisiniz? (Y/N)");
			
			onay=scan.next().toUpperCase().charAt(0);
			
			if(onay=='N') {
				System.out.println("Tesekkur eder, yine bekleriz...");
				break;
			}else if(onay=='Y'){
				product.setPrice(select(product));//musteri nin urunlerden secim yapip fiyat dondursun diye
				money =balance(product.getPrice(), money, product);//musterinin parasindan para dusuyor
			}else {
				System.out.println("Lutfen 'Y' veya 'N' seciniz...");
			}
		}
	}
	
	
}
