package view;
import controller.QtdNum;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int num1, num2;
		QtdNum qd = new QtdNum();
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		
		
			if (num1 < 10 || num1 > 99999) {
				JOptionPane.showMessageDialog(null, "Número inválido");
			} else if (num2 > 9) {
				JOptionPane.showMessageDialog(null, "Número inváildo");
			} 
			
			int total = qd.quantidade(num1, num2);
			System.out.println(total);
				
		
	}

}
