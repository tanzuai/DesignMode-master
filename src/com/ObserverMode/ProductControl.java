package com.ObserverMode;

public class ProductControl {
	private Product product;

	public void setProduct(Product product) {
		this.product = product;
	}

	public void register(PriceObserver priceObsv, NameObserver nameObsv) {
		// 加入观察者
		product.addObserver(nameObsv);
		product.addObserver(priceObsv);
	}

	public void removeNameObserver(PriceObserver priceObsv) {
		product.deleteObserver(priceObsv);
	}

	public void removePriceObserver(NameObserver nameObsv) {
		product.deleteObserver(nameObsv);
	}
}
