package vetores2;

import javax.swing.JOptionPane;

public class vetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String impressão = "";
		String nomes[] = new String[10];
		
		 
		for (int c=0; c<=10; c++) {
			
			nomes[c] = JOptionPane.showInputDialog("Digite 10 nomes: ");
			
			impressão = impressão + " " + nomes[c]; 
			
			
			
		JOptionPane.showMessageDialog(null, "" + impressão);
		System.exit(0);
		}

	}

}
