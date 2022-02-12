package my.home.task05.entity;

import java.util.List;

public class Bouquet {

	private List<Flower> flowers;
	private Paper paper;
	private Ribbon ribbon;

	public Bouquet(List<Flower> flowers, Paper paper, Ribbon ribbon) {
		super();
		this.flowers = flowers;
		this.paper = paper;
		this.ribbon = ribbon;
	}

	public Bouquet() {

	}

	public List<Flower> getFlowers() {
		return flowers;
	}

	public void setFlowers(List<Flower> flowers) {
		this.flowers = flowers;
	}

	public Paper getPaper() {
		return paper;
	}

	public void setPapper(Paper paper) {
		this.paper = paper;
	}

	public Ribbon getRibbon() {
		return ribbon;
	}

	public void setRibbon(Ribbon ribbon) {
		this.ribbon = ribbon;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flowers == null) ? 0 : flowers.hashCode());
		result = prime * result + ((paper == null) ? 0 : paper.hashCode());
		result = prime * result + ((ribbon == null) ? 0 : ribbon.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bouquet other = (Bouquet) obj;
		if (flowers == null) {
			if (other.flowers != null)
				return false;
		} else if (!flowers.equals(other.flowers))
			return false;
		if (paper != other.paper)
			return false;
		if (ribbon != other.ribbon)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[flowers=" + flowers + ", paper=" + paper + ", ribbon=" + ribbon + "]";
	}

}