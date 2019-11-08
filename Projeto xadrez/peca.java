package pecas;
import java.util.ArrayList;
import java.util.List;

import excecoes.MovimentoNaoPermitidoExceptions;
import movimentos.MovimentoStrategy;
import jogador.Jogador;
import jogador.Jogador.Cor;
import xadrez.Tabuleiro;



public abstract class Peca {
	
	protected List<MovimentoStrategy> movimentos;
	protected Jogador jogador;
	protected boolean superior;
	protected int linha, coluna, linhaAtual, colunaAtual;

	public Peca (Jogador jogador, int linha, int coluna){

		this.linha = linha;
		this.coluna = coluna;
		this.jogador = jogador;
		superior = (jogador.getCor() == Cor.BRANCO ? true : false );
		movimentos = new ArrayList<MovimentoStrategy>();
	}

	public void mover(Jogador jogador, int linhaAtual, int colunaAtual, int linha, int coluna) throws MovimentoNaoPermitidoExceptions{

		if(!this.jogador.equals(jogador))
			throw new MovimentoNaoPermitidoExceptions("Erro: movimento não permitido");
		boolean podeMover = true;
		for(MovimentoStrategy movimento : movimentos){
			podeMover = podeMover || movimento.podeMover(linhaAtual, colunaAtual, linha, coluna);
			if(podeMover){
				Tabuleiro tabuleiro = new Tabuleiro();
				Peca pecaOrigem = tabuleiro.getPeca (linhaAtual, colunaAtual);
				tabuleiro.setPeca(linhaAtual, colunaAtual, null);
				tabuleiro.setPeca(linha, coluna, pecaOrigem);
			}	
			else{
			throw new MovimentoNaoPermitidoExceptions("Erro: movimento não permitido");
			}
		}
	}

	public void setPosicao (int linha, int coluna){
		this.coluna = coluna;
		this.linha = linha;
	}

	public Jogador getJogador(){
		return jogador;
	}

	public List<MovimentoStrategy> getMovimentos(){
		return this.movimentos;
	}
}
