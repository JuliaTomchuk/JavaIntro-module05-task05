package my.home.task05.main;

import java.util.ArrayList;
import my.home.task05.entity.Bouquet;
import my.home.task05.logic.BouquetBuilder;
import my.home.task05.logic.BouquetBuilderImpl;
import my.home.task05.logic.NoSuchFlowersException;
import my.home.task05.logic.NoSuchPaperException;
import my.home.task05.logic.NoSuchRibbonsException;

/* Реализовать приложение, позволяющее создавать цветочную композицию. Состfвляющими цветочной композиции являются цветы и упаковка*/
public class Main {

	public static void main(String[] args) {

		BouquetBuilder builder = new BouquetBuilderImpl();
		ArrayList<String> myFlowers = new ArrayList<>();
		myFlowers.add("lily");
		myFlowers.add("rose");
		myFlowers.add("PEONY");
		myFlowers.add("CHRYSANTHEMEM");
		try {
			builder.setFlower(myFlowers);
		} catch (NoSuchFlowersException e) {

			e.printStackTrace();
		}

		try {
			builder.setPaper("newspaper");
		} catch (NoSuchPaperException e) {

			e.printStackTrace();
		}

		try {
			builder.setRibbon("PINK");
		} catch (NoSuchRibbonsException e) {

			e.printStackTrace();
		}
		Bouquet myBouquet = builder.getBouquet();

		System.out.println(myBouquet);
	}

}
