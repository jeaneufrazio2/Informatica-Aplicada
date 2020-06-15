package senai;

import javax.swing.JOptionPane;

public class Desafio18 {
	
	public static void main(String[] args) {
		
		String menu = "1 - Digitar uma frase e retornar ela em Caixa Alta\n"+
		    "2 - Digitar uma frase e retornar ela em Caixa Baixa\n"+
			"3 - Soletrar uma Palavra\n"+
		    "4 - Digitar uma Frase, depois substiuir um determinado carácter pelo carácter @\n"+
			"5 - Digitar uma Frase, depois informar a posição inicial e final para cortar a frase, tornando apenas o que foi cortado\n"+
		    "0 - Sair";
		String frase = "";
		int escolha = -1;
		
		
		while (escolha != 0) {
			escolha = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (escolha) {
			case 01:
				frase = JOptionPane.showInputDialog("Digite uma frase");
				JOptionPane.showMessageDialog(null, frase.toUpperCase());				
				break;
			case 02:
				frase = JOptionPane.showInputDialog("Digite uma frase");
				JOptionPane.showMessageDialog(null, frase.toLowerCase());
				break;
			case 03:
				frase = JOptionPane.showInputDialog("Digite uma palavra");
				int qtd = frase.length();
				for (int i = 0; i < qtd; i++) {
					JOptionPane.showMessageDialog(null, frase.charAt(i) + " ");
						}
				JOptionPane.showMessageDialog(null, frase);				
				break;
			case 04:
				frase = JOptionPane.showInputDialog("Digite uma frase");
				String subst = JOptionPane.showInputDialog("Digite qual letra sera substituida");
				JOptionPane.showMessageDialog(null, frase.replace(subst, "@"));
				break;
			case 05:
				frase = JOptionPane.showInputDialog("Digite uma frase");
				int primeira = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da primeira letra"));
				int ultima = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da utlima letra"));
				JOptionPane.showMessageDialog(null, frase.substring(primeira, ultima));
				break;
			case 0:
				
				break;

			default:
				break;
			}
			
		}
		
	}

}
