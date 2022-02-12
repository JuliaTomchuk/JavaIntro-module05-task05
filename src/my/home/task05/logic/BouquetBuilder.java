package my.home.task05.logic;

import java.util.List;

import my.home.task05.entity.Bouquet;

public interface BouquetBuilder {

	void setFlower(List<String> flowers) throws NoSuchFlowersException;

	void setPaper(String paper) throws NoSuchPaperException;

	void setRibbon(String ribbon) throws NoSuchRibbonsException;

	Bouquet getBouquet();

}
