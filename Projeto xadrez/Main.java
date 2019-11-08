package xadrez;

import java.util.List;

import javax.swing.JOptionPane;
import excecoes.MovimentoNaoPermitidoExceptions;
import jogador.Jogador;
import jogador.Jogador.Cor;
import movimentos.MovimentoStrategy;
import pecas.Peca;

public class Main {
	
	public static void main(String[] args) throws MovimentoNaoPermitidoExceptions {
		
		String nome1 = JOptionPane.showInputDialog(" Jogador 1: ");
		String nome2 = JOptionPane.showInputDialog(" Jogador 2: ");
		
		Jogador j1 = new Jogador(nome1,Cor.BRANCO);
		Jogador j2 = new Jogador (nome2, Cor.PRETO);
		
		Tabuleiro t = new Tabuleiro (j1, j2);
		System.out.println(t);
		
		
		Jogador jogadorDaVez = j1;
		JOptionPane.showMessageDialog(null,"Jogador da vez: " + nome1);
		
		
		while(true){
			try{
			int x0 = Integer.parseInt(JOptionPane.showInputDialog(" Informe a LINHA ATUAL da peça de deseja mover. "));
			int y0 = Integer.parseInt(JOptionPane.showInputDialog(" Informe a COLUNA ATUAL da peça de deseja mover. "));
		
			Peca peca = Tabuleiro.getTabuleiro().getPeca(x0, y0);
			System.out.println(peca);
			
			int x1 = Integer.parseInt(JOptionPane.showInputDialog(" Informe a LINHA que deseja colocar a peça. "));
			int y1 = Integer.parseInt(JOptionPane.showInputDialog(" Informe a COLUNA que deseja colocar a peça. "));
			System.out.println(x1);
			System.out.println(y1);
			
			List<MovimentoStrategy> movimentos = peca.getMovimentos();
			for(MovimentoStrategy a: movimentos){
				if(a.podeMover(x0, y0, x1, y1)){ 
					peca.mover(jogadorDaVez, x0, y0, x1, y1);
					System.out.println(t);
				}else{
					JOptionPane.showMessageDialog(null,"Movimento inexistente!");

				}
			}
			if (jogadorDaVez == j1){
				jogadorDaVez = j2;
				JOptionPane.showMessageDialog(null,"Jogador da vez: " + nome2);
				
			}else{
				jogadorDaVez = j1;
				JOptionPane.showMessageDialog(null,"Jogador da vez: " + nome1);
				
			}
			
			}catch(MovimentoNaoPermitidoExceptions e ){
				System.out.println(e.getMessage());
			}			
		}		
	}
}
