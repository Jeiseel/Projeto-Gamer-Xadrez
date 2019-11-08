package pecas;


import jogador.Jogador;
import jogador.Jogador.Cor;
import movimentos.MovimentoRei;


public class Rei extends Peca{
	
	public Rei(Jogador jogador, int linha, int coluna) {		
		super(jogador, linha, coluna);
		super.movimentos.add(new MovimentoRei());		
	}

	@Override
	public String toString(){
		return (jogador.getCor() == Cor.BRANCO)? "  \u2654    |":"  \u265A    |";
	}

}
