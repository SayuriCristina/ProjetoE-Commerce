package quickdrink;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import quickdrink.util.Cores;
import quickdrink.model.Suco;
import quickdrink.controller.QuickDrinkController;
import quickdrink.model.Cafe;
import quickdrink.model.Milkshake;

public class Menu {
	public static void main(String[] args) {
		
		QuickDrinkController pedidos = new QuickDrinkController();
		
		Scanner leia = new Scanner (System.in);
		
		int opcao, tamanho, decaf, acucar, leite, nome;
		String sabor, cobertura;
		float preco;
		
		while (true) {
			
			System.out.println("╭┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄ · · ✫ · · ┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄╮");
			System.out.println(Cores.TEXT_PURPLE_BOLD + "                 ❝ QuickDrink ❞" + Cores.TEXT_RESET);
			System.out.println("╰┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄ · · ✫ · · ┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄╯");
			
			System.out.println();
			System.out.println("          1 ➤ Cardápio");
			System.out.println("          2 ➤ Comprar");
			System.out.println("          3 ➤ Meus pedidos");
			System.out.println("          4 ➤ Suporte ao cliente");
			System.out.println("          5 ➤ Sair");
			System.out.println();
			System.out.println("— — — — — — — — — — — — — — — — — — — — — — — —");
			System.out.println("Entre com a opção desejada: ");
			
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros e válidos, conforme o menu.");
				leia.nextLine();
				opcao = 0;
			}
			
			if (opcao == 5) {
				System.out.println("\nQuickDrink: Sua loja de drinks favorita!\nCompre e receba em um click!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			
			case 1:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "1 ➤ Cardápio\n" + Cores.TEXT_RESET);
				tabela();
				
				pressEnter();
				break;
			
			case 2:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "2 ➤ Comprar\n" + Cores.TEXT_RESET);
				
				do {
					System.out.println("Digite o tipo da bebida: ");
					System.out.println("1 ➤ Suco");
					System.out.println("2 ➤ Milkshake");
					System.out.println("3 ➤ Café");
					
					nome = leia.nextInt();
				} while (nome < 1 || nome > 3);
				
				System.out.print("Digite o tamanho (em Ml): ");
				tamanho = leia.nextInt();
				
				
				switch(nome) {
				case 1 -> {
					System.out.print("Digite o sabor: ");
					sabor = leia.next();
					
					System.out.println("Deseja adicionar açúcar?"
							+ "\n1 - Sim"
							+ "\n2 - Não");
					acucar = leia.nextInt();
					
					System.out.println("Deseja adicionar leite no lugar de água?"
							+ "\n1 - Sim"
							+ "\n2 - Não");
					leite = leia.nextInt(); 
					
					preco = tamanho / 25.00f;
					System.out.printf("\nPreço: %.2f reais", preco);
					
					pedidos.fazerPedido(new Suco(pedidos.gerarId(), nome, tamanho, preco, sabor, acucar, leite));
				} 
				
				case 2 -> {
					System.out.print("Digite o sabor: ");
					sabor = leia.next();
					
					System.out.print("Digite o sabor da cobertura: ");
					cobertura = leia.next();
					
					preco = tamanho / 15.00f;
					System.out.printf("\nPreço: %.2f reais", preco);
					
					pedidos.fazerPedido(new Milkshake(pedidos.gerarId(), nome, tamanho, preco, sabor, cobertura));
				}
				
				case 3 -> {
					System.out.println("Deseja descafeínado?"
							+ "\n1 - Sim"
							+ "\n2 - Não");
					decaf = leia.nextInt();
					
					System.out.println("Deseja adicionar açúcar?"
							+ "\n1 - Sim"
							+ "\n2 - Não");
					acucar = leia.nextInt();
					
					System.out.println("Deseja adicionar leite?"
							+ "\n1 - Sim"
							+ "\n2 - Não");
					leite = leia.nextInt(); 
					
					preco = tamanho / 20.00f;
					System.out.printf("\nPreço: %.2f reais", preco);
					
					pedidos.fazerPedido(new Cafe(pedidos.gerarId(), nome, tamanho, preco, decaf, acucar, leite));
				}
				
				
				}
				
				pressEnter();
				break;
				
			case 3:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "3 ➤ Meus pedidos\n" + Cores.TEXT_RESET);
				pedidos.listarPedidos();
				
				pressEnter();
				break;
				
			case 4:
				System.out.println(Cores.TEXT_PURPLE_BOLD + "4 ➤ Suporte ao cliente\n" + Cores.TEXT_RESET);
				
				System.out.println("Por favor, entre em contato pelo e-mail " + Cores.TEXT_CYAN + "sac@quickdrink.com"
						+ Cores.TEXT_RESET +" ou pelo telefone" + Cores.TEXT_CYAN + " +55 (11) 1234-5678." + Cores.TEXT_RESET);
				
				pressEnter();
				break;	
				
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção inválida!\n" + Cores.TEXT_RESET);
				
				pressEnter();
				break;
			
			}
			
		}
		
	}
	

	public static void pressEnter() {
		try {
			System.out.println("\nPressione ENTER para continuar.");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou algo diferente de E.");
		}
	}
	
	public static void sobre() {
		System.out.println("✦ •····················• ✦ •····················• ✦");
		System.out.println(Cores.TEXT_PURPLE_BOLD + "   ❝ Projeto desenvolvido por Sayuri Cristina ❞" + Cores.TEXT_RESET);
		System.out.println("      ˗ˏˋ sayuri.cristinass@gmail.com ˎˊ˗");
		System.out.println("       https://github.com/SayuriCristina");
		System.out.println("✦ •····················• ✦ •····················• ✦");
	}
	
	public static void tabela() {
		System.out.println(Cores.TEXT_PURPLE_BOLD);
		System.out.println("Suco ➤  20 reais - 500 Ml");
		System.out.println("Milkshake ➤ 25 reais - 500 Ml");
		System.out.println("Café ➤ 20 reais - 500 Ml" + Cores.TEXT_RESET);
	}
	
}
