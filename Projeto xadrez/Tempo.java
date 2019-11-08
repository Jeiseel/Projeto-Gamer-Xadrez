package thread;

import javax.swing.JOptionPane;

public class Tempo implements Runnable{
	
	int segundo;
	public Tempo(){
		segundo = 30;
	}

	@Override
	public void run() {
		try {
			while(true){
				segundo--;
				System.out.print(segundo);
				Thread.sleep(1000);
				if(segundo==20){
					JOptionPane.showMessageDialog(null, "10 segundos restante.");										
				}
			}
		} catch (InterruptedException e) {
			e.getMessage();package pecas;


import jogador.Jogador;
import jogador.Jogador.Cor;
import movimentos.MovimentoTorre;

public class Torre extends Peca {
	
	public Torre(Jogador jogador, int linha,int coluna ) {
		super(jogador, linha, coluna);
		super.movimentos.add(new MovimentoTorre());
	}

	@Override
	public String toString(){
		return (jogador.getCor() == Cor.BRANCO)? "   \u2656   |":"   \u265C   |";
	}

	

}

		}
	}
	
	public int getSegundo(){
		return this.segundo;
	}
	public void inicializaSegundo(){
		this.segundo = 30;
	}
}
