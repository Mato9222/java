package kr.or.ddit.study07.sec02.test04;

public class ElectroniProd extends Prod{
	private int V;
	private int sobi;
	
	public int getV() {
		return V;
	}
	public void setV(int v) {
		V = v;
	}
	public int getSobi() {
		return sobi;
	}
	public void setSobi(int sobi) {
		this.sobi = sobi;
	}
	
	@Override
	public String toString() {
		return "ElectroniProd [전압량 = " + getV() + ", 전력소비량= " + getSobi() + "W , 상품 이름 = " + getName()
				+ ", 상품 가격 =" + getPrice() + "]";
	}
	

}
