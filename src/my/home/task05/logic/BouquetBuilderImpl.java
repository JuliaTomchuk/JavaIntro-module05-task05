package my.home.task05.logic;

import java.util.ArrayList;
import java.util.List;

import my.home.task05.entity.Bouquet;
import my.home.task05.entity.Flower;
import my.home.task05.entity.Paper;
import my.home.task05.entity.Ribbon;

public class BouquetBuilderImpl implements BouquetBuilder {

	private List<Flower> flowers;
	private Paper paper;
	private Ribbon ribbon;

	public BouquetBuilderImpl() {
		flowers = new ArrayList<>();
	}

	@Override
	public void setFlower(List<String> flowersFromClient) throws NoSuchFlowersException {
		Flower[] stock = Flower.values();
		boolean flag = false;
		for (int i = 0; i < flowersFromClient.size(); i++) {
			for (int j = 0; j < stock.length; j++) {
				if (stock[j].toString().equalsIgnoreCase(flowersFromClient.get(i))) {
					flowers.add(stock[j]);
					flag = true;
				}
			}

			if (!flag) {
				throw new NoSuchFlowersException("Flower " + flowersFromClient.get(i) + " out of stock");
			}
		}

	}

	@Override
	public void setRibbon(String ribbonFromClient) throws NoSuchRibbonsException {

		boolean flag = false;
		Ribbon[] stock = Ribbon.values();
		for (int i = 0; i < stock.length; i++) {
			if (stock[i].toString().equalsIgnoreCase(ribbonFromClient)) {
				ribbon = stock[i];
				flag = true;
			}
		}
		if (!flag) {
			throw new NoSuchRibbonsException("Ribbon " + ribbonFromClient + " out of stock");
		}

	}

	@Override
	public void setPaper(String paperFromClient) throws NoSuchPaperException {
		Paper[] stock = Paper.values();
		boolean flag = false;
		for (int i = 0; i < stock.length; i++) {
			if (stock[i].toString().equalsIgnoreCase(paperFromClient)) {
				paper = stock[i];
				flag = true;

			}

		}
		if (!flag) {
			throw new NoSuchPaperException("Papper " + paperFromClient + " out of stock");
		}

	}

	public Bouquet getBouquet() {
		return new Bouquet(flowers, paper, ribbon);
	}

}
