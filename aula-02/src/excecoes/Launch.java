package excecoes;

import javax.swing.JOptionPane;

public class Launch {

	public static void main(String[] args) {
		double altura = 0.0;
		
		try {
			altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Altura inválida");
		}
		
		System.out.println("Altura é " + altura);
	}
	
}
