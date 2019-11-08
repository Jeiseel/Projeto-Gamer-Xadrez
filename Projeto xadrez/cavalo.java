package pecas;


import jogador.Jogador;
import jogador.Jogador.Cor;
import movimentos.MovimentoCavalo;


public class Cavalo extends Peca {
	
	public Cavalo(Jogador jogador, int linha, int coluna) {
		super(jogador, linha, coluna);
		super.movimentos.add(new MovimentoCavalo());					
	}

	@Override
	public String toString(){
		return (jogador.getCor() == Cor.BRANCO)? "   \u2658   |":"   \u265E   |";
	}

}
