package org.springframework.beans.lookup;

import javax.jws.soap.SOAPBinding;

/**
 * @author 13932105637
 * @version l.0
 * @className User
 * @date 2021/5/18 11:10
 * @description TODO
 **/
 class User {
	public void showMe(){
		System.out.println("i am user");
	}
}
class Teacher extends User{

	@Override
	public void showMe() {
		System.out.println("i am Teacher");
	}
}

class Student extends User{
	@Override
	public void showMe() {
		System.out.println("i am student");
	}
}

public abstract class GetBeanTest{
 	public abstract User getBean();

	public void showMe(){
		this.getBean().showMe();
	}
}
