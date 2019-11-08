package pecas;


import jogador.Jogador;
import jogador.Jogador.Cor;
import movimentos.MovimentoPeao;


public class Peao extends Peca {

	public Peao (Jogador jogador, int linha, int coluna){
		super(jogador, linha, coluna);
		super.movimentos.add(new MovimentoPeao());
	}

	@Override
	public String toString(){
		return (jogador.getCor() == Cor.BRANCO)? "   \u2659   |":"   \u265F   |";
	}
}
