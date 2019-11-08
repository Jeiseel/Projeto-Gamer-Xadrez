package movimentos;

import excecoes.MovimentoNaoPermitidoExceptions;
import xadrez.Tabuleiro;

public class MovimentoCavalo implements MovimentoStrategy {


	@Override
	public boolean podeMover(int linhaAtual, int colunaAtual, int linha, int coluna)
			throws MovimentoNaoPermitidoExceptions {
		
		// Primeiro movimento possível
		if(linhaAtual + 2 == linha && colunaAtual + 1 == coluna){
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
		
		// Segundo movimento possível
		if (linhaAtual + 1 == linha && colunaAtual + 2 == coluna){
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
		
		//Terceiro movimento possível
		if(linhaAtual - 1 == linha && colunaAtual + 2 == coluna){
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
		
		// Quarto movimento possível
		if(linhaAtual - 2 == linha && colunaAtual + 1 == coluna){
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
		
		// Quinto movimento possível
		if(linhaAtual - 2 == linha && colunaAtual - 1 == coluna){
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
		
		// Sexto movimento possível
		if(linhaAtual - 1 == linha && colunaAtual - 2 == coluna){
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
		
		// Sétimo movimento possível
		if(linhaAtual + 1 == linha && colunaAtual - 2 == coluna){
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
		
		// Oitavo movimento possível
		if(linhaAtual + 2 == linha && colunaAtual - 1 == coluna){
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
