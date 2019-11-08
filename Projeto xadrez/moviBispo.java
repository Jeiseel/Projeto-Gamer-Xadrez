package movimentos;

import excecoes.MovimentoNaoPermitidoExceptions;
import xadrez.Tabuleiro;

public class MovimentoBispo implements MovimentoStrategy{

	@Override
	public boolean podeMover(int linhaAtual, int colunaAtual, int linha, int coluna)
			throws MovimentoNaoPermitidoExceptions {
		
		if(linhaAtual < linha && colunaAtual > coluna){
			if(Tabuleiro.tab[linha][coluna] == null){
				return true;
			}
			if(!Tabuleiro.tab[linhaAtual][colunaAtual].getJogador().getCor().equals(Tabuleiro.tab[linha][coluna])
					&& Tabuleiro.tab[linha][coluna]!= null){
				return true;
			}else{
				return false;
			}			
		}
		
		if(linhaAtual < linha && colunaAtual < coluna){
			if(Tabuleiro.tab[linha][coluna] == null){
				return true;
			}
			if(!Tabuleiro.tab[linhaAtual][colunaAtual].getJogador().getCor().equals(Tabuleiro.tab[linha][coluna])
					&& Tabuleiro.tab[linha][coluna]!= null){
				return true;
			}else{
				return false;
			}				
		}
		
		if(linhaAtual > linha && colunaAtual < coluna){
			if(Tabuleiro.tab[linha][coluna] == null){
				return true;
			}
			if(!Tabuleiro.tab[linhaAtual][colunaAtual].getJogador().getCor().equals(Tabuleiro.tab[linha][coluna])
					&& Tabuleiro.tab[linha][coluna]!= null){
				return true;
			}else{
				return false;
			}				
		}
		
		if(linhaAtual > linha && colunaAtual > coluna){
			if(Tabuleiro.tab[linha][coluna] == null){
				return true;
			}
			if(!Tabuleiro.tab[linhaAtual][colunaAtual].getJogador().getCor().equals(Tabuleiro.tab[linha][coluna])
					&& Tabuleiro.tab[linha][coluna]!= null){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
}
