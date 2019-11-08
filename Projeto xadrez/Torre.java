package pecas;


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
