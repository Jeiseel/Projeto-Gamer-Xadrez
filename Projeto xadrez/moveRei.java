package movimentos;



import excecoes.MovimentoNaoPermitidoExceptions;
import xadrez.Tabuleiro;

public class MovimentoRei implements MovimentoStrategy {



	@Override
	public boolean podeMover(int linhaAtual, int colunaAtual, int linha, int coluna)throws MovimentoNaoPermitidoExceptions {
		
		if( linhaAtual + 1 == linha && colunaAtual + 1 == coluna){
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
		if(linhaAtual + 1 == linha && colunaAtual + 1 == coluna){
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
		if( linhaAtual - 1 == linha && colunaAtual + 1 == coluna){
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
		if(linhaAtual + 1 == linha && colunaAtual - 1 == coluna){
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
		if(linhaAtual - 1 == linha && colunaAtual == coluna){
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
		if (linhaAtual + 1 == linha && colunaAtual == coluna){
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
		if(linhaAtual == linha && colunaAtual - 1 == coluna){
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
		if(linhaAtual == linha && colunaAtual + 1 == coluna){
			if(Tabuleiro.tab[linha][coluna] == null){
				return true;
			}
			if(!Tabuleiro.tab[linhaAtual][colunaAtual].getJogador().getCor().equals(Tabuleiro.tab[linha][coluna])
					&& Tabuleiro.tab[linha][coluna]!= null){
				return true;
			}
			return false;
		}else{
			return false;
		}		
	}
}
