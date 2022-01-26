package fr.univamu.iut.exo02;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Promotion promotion = new Promotion();
		System.out.println(promotion);
		
		promotion.sortByFirstName();
		System.out.println(promotion);
		
		promotion.sortById();
		System.out.println(promotion);
		
		promotion.sortByLastName();
		System.out.println(promotion);
		
		
	}

}
