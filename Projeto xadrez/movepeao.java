package movimentos;

import xadrez.Tabuleiro;
import excecoes.MovimentoNaoPermitidoExceptions;

public class MovimentoPeao implements MovimentoStrategy{

	@Override
	public boolean podeMover(int linhaAtual, int colunaAtual, int linha, int coluna)
			throws MovimentoNaoPermitidoExceptions {

		if(( linhaAtual+2==linha && colunaAtual+1==coluna)){
			if(Tabuleiro.tab[linha][coluna] == null){
				return true;
			}
			else{
				if((!Tabuleiro.tab[linhaAtual][colunaAtual].getJogador().getCor().equals(Tabuleiro.tab[linha][coluna].getJogador().getCor()))){
					return true;
				}
			}
		}
		if(linhaAtual-2==linha && colunaAtual-1==coluna){

			if(Tabuleiro.tab[linha][coluna] == null){
				return true;
			}
			else{
				if((!Tabuleiro.tab[linhaAtual][colunaAtual].getJogador().getCor().equals(Tabuleiro.tab[linha][coluna].getJogador().getCor()))){

					return true;
				}
			}
		}
		if(linhaAtual + 1 == linha && colunaAtual - 1 == coluna){
			if((!Tabuleiro.tab[linhaAtual][colunaAtual].getJogador().getCor().equals(Tabuleiro.tab[linha][coluna].getJogador().getCor()))){

				return true;
			}else{
				if(Tabuleiro.tab[linha][coluna] == null){
					return false;
				}
			}
		}

		if(linhaAtual == 1 &&(linhaAtual+2==linha && colunaAtual==coluna)){
			if(Tabuleiro.tab[linha][coluna] == null){

				return true;
			}
			else{
				return false;
			}
		}
		if(linhaAtual == 6 &&(linhaAtual-2==linha && colunaAtual==coluna)){
			if(Tabuleiro.tab[linha][coluna] == null){

				return true;
			}
			else{
				return false;
			}
		}
		if(linhaAtual+1==linha && colunaAtual==coluna){
			if(Tabuleiro.tab[linha][coluna] == null){

				return true;
			}
			else{
				return false;
			}
		}
		if(linhaAtual-1==linha && colunaAtual==coluna){
			if(Tabuleiro.tab[linha][coluna] == null){

				return true;
			}else{
				return false;
			}
		}
		if((linhaAtual-1==linha && colunaAtual+1==coluna) || (linhaAtual-1==linha && colunaAtual-1==coluna) ){

			if((!(Tabuleiro.tab[linha][coluna] == null)) && 
					(!Tabuleiro.tab[linha][coluna].getJogador().getCor().equals(Tabuleiro.tab[linhaAtual][colunaAtual].getJogador().getCor()))){

				return true;
			}

			else{
				return false;
			}
		}
		else{

			return false;
		}
	}

}

