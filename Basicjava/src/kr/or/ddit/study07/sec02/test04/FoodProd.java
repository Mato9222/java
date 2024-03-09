package kr.or.ddit.study07.sec02.test04;

public class FoodProd extends Prod {
	
	private String life;

	public String getLife() {
		return life;
	}

	public void setLife(String life) {
		this.life = life;
	}

	@Override
	public String toString() {
		return "FoodProd [유통기한 " + getLife() + ", 상품 이름 = " + getName() + ", 상품 가격 = " + getPrice() + "]";
	}

	
}
