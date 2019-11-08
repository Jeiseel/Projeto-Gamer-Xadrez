package pecas;


import jogador.Jogador;
import jogador.Jogador.Cor;
import movimentos.MovimentoBispo;
import movimentos.MovimentoTorre;

public class Rainha extends Peca {
	
	public Rainha(Jogador jogador, int linha, int coluna) {
		super(jogador, linha, coluna);
		super.movimentos.add(new MovimentoTorre());
		super.movimentos.add(new MovimentoBispo());
	}

	@Override
	public String toString(){
		return (jogador.getCor() == Cor.BRANCO)? "   \u2655   |":"   \u265B   |";
	}

	

}
