package quickdrink;

import java.util.Scanner;
import quickdrink.util.Cores;

public class Menu {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int opcao;
		
		while (true) {
			
			//System.out.println(Cores.TEXT_PURPLE);
			System.out.println("╭┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄ · · ✫ · · ┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄╮");
			System.out.println(Cores.TEXT_PURPLE_BOLD + "                 ❝ QuickDrink ❞" + Cores.TEXT_RESET);
			System.out.println("╰┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄ · · ✫ · · ┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄╯");
			//System.out.println(Cores.TEXT_RESET);
			System.out.println();
			System.out.println("          1 ➤ Produtos");
			System.out.println("          2 ➤ Comprar");
			System.out.println("          3 ➤ Meus pedidos");
			System.out.println("          4 ➤ Suporte ao cliente");
			System.out.println("          5 ➤ Sair");
			System.out.println();
			System.out.println("— — — — — — — — — — — — — — — — — — — — — — — —");
			System.out.println("Entre com a opção desejada: ");
			
			opcao = leia.nextInt();
			
			if (opcao == 5) {
				System.out.println("\nQuickDrink: Sua loja de drinks favorita! Compre e receba em um click");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			
			case 1:
				System.out.println("Produtos\n\n");
				
				
				break;
			
			case 2:
				System.out.println("2 ➤ Promoções\n\n");
				
				
				break;
				
			case 3:
				System.out.println("3 ➤ Carrinho de compras\n\n");
				
				
				
				
				break;
				
			case 4:
				System.out.println("6 ➤ Meus pedidos\n\n");
				
				
				break;	
				
			case 5:
				System.out.println("7 ➤ Suporte ao cliente\n\n");
				
				System.out.println("Por favor, entre em contato pelo e-mail ou pelo telefone +55 (11) 1234-5678.");
				
				
				break;	
				
			default:
				System.out.println("\nOpção inválida!\n");
				
				
				break;
			
			} // fecha o switch
			
			
			
		} // fecha o while
		
	} // fecha o main
	
	public static void sobre() {
		System.out.println("✦ •····················• ✦ •····················• ✦");
		System.out.println(Cores.TEXT_PURPLE_BOLD + "   ❝ Projeto desenvolvido por Sayuri Cristina ❞" + Cores.TEXT_RESET);
		System.out.println("      ˗ˏˋ sayuri.cristinass@gmail.com ˎˊ˗");
		System.out.println("       https://github.com/SayuriCristina");
		System.out.println("✦ •····················• ✦ •····················• ✦");
	}

} // fecha a classe
