package projeto;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cliente {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		try {
			Registry meuRegistro = LocateRegistry.getRegistry("localhost", 1099);
			Calculadora c = (Calculadora)Naming.lookup("//localhost/Calculadora");
			
			while(true) {
				String menu = JOptionPane.showInputDialog(" > Calculadora Remota \n > Projeto 1 \n > Sistemas Distribuidos \n > Iago Conrado e Joao Marcos \n"
						+ "\n"
						+ "Digite o numero que corresponde a sua operacao: \n"
						+ "\n"
						+ "Soma (1) \n"
						+ "Subtracao (2) \n"
						+ "Multiplicacao (3) \n"
						+ "Divisao (4) \n"
						+ "Sair (Cancelar)");
				switch(menu) {
					case "1":{
						int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
						int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
						
						JOptionPane.showMessageDialog(null, "resultado : " + c.add(x,y));
						break;
					}
					case "2":{
						int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
						int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
						
						JOptionPane.showMessageDialog(null, "resultado : " + c.sub(x,y));
						break;
					}
					case "3":{
						int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
						int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
						
						JOptionPane.showMessageDialog(null, "ressultado : " + c.mul(x,y));
						break;
					}
					case "4":{
						int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
						int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
						
						JOptionPane.showMessageDialog(null, "resultado : " + c.div(x,y));
						break;
					}
				}
			}
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Cliente nao conectado");
		}
	}
}
