package controller;

public class QtdNum {

	public QtdNum() {
		super();
	}
	public int quantidade(int a, int b) {
		// se o numero for menor que 10, o resultado é zero, então ele não será somado
		if (a / 10 == 0) {
			if (a == b) {
				return 1;}
			return 0;
		}else{
			if (a%10 == b) {
				return 1 + quantidade(a/10, b);
			}
				return quantidade(a/10, b);
		}
		
	}
}
//