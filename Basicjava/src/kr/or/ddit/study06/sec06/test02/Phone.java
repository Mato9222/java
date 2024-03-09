package kr.or.ddit.study06.sec06.test02;

public class Phone {
	int PhoneNum;
	String name;
	String group;
	int key;
	
	public int getPhoneNum() {
		return PhoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		PhoneNum = phoneNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	
	@Override
	public String toString() {
		return "Phone [PhoneNum=" + PhoneNum + ", name=" + name + ", group=" + group + ", num=" + key + "]";
	}
	
	
}
