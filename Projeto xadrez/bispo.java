package pecas;

import jogador.Jogador;
import jogador.Jogador.Cor;
import movimentos.MovimentoBispo;


public class Bispo extends Peca {
	
	public Bispo(Jogador jogador, int linha, int coluna) {
		super(jogador, linha, coluna);
		super.movimentos.add(new MovimentoBispo());
	}
package movimentos;


import excecoes.MovimentoNaoPermitidoExceptions;
import xadrez.Tabuleiro;

public class MovimentoTorre implements MovimentoStrategy {
	
	@Override
	public boolean podeMover(int linhaAtual, int colunaAtual, int linha, int coluna)throws MovimentoNaoPermitidoExceptions{
		if (linhaAtual == linha && colunaAtual < coluna){
			while(true){
				coluna --;
				if(Tabuleiro.tab[linha][coluna] == null){
					if(linhaAtual == linha && colunaAtual == coluna){
						return true;						
					}else{
						continue;
					}
				}else{
						if(!Tabuleiro.tab[linhaAtual][colunaAtual].getJogador().getCor().equals(Tabuleiro.tab[linha][coluna])
								&& colunaAtual == coluna){
							return true;				
					}
						return false;								
					
					}						
				}			
		}
		if(linhaAtual< linha && colunaAtual == coluna){
			while(true){
				linha --;
				if(Tabuleiro.tab[linha][coluna] == null){
					if(linhaAtual == linha && colunaAtual == coluna){
						return true;						
					}else{
						continue;
					}
				}else{
					if(!Tabuleiro.tab[linhaAtual][colunaAtual].getJogador().getCor().equals(Tabuleiro.tab[linha][coluna])
							&& linhaAtual == linha){
						return true;				
				}
					return false;								
				
				}					
			}
		}
		if(linhaAtual > linha && colunaAtual == coluna){
			while(true){
				linha ++;
				if(Tabuleiro.tab[linha][coluna] == null){
					if(linhaAtual == linha && colunaAtual == coluna){
						return true;						
					}else{
						continue;
					}
				}else{
					if(!Tabuleiro.tab[linhaAtual][colunaAtual].getJogador().getCor().equals(Tabuleiro.tab[linha][coluna])
							&& linhaAtual == linha){
						return true;				
				}
					return false;								
				
				}	
			}
		}
		if( linhaAtual == linha && colunaAtual > coluna){
			while(true){
				coluna ++;
				if(Tabuleiro.tab[linha][coluna] == null){
					if(linhaAtual == linha && colunaAtual == coluna){
						return true;						
					}else{
						continue;
					}					
				}else{
					if(!Tabuleiro.tab[linhaAtual][colunaAtual].getJogador().getCor().equals(Tabuleiro.tab[linha][coluna])
							&& colunaAtual == coluna){
						return true;				
				}
					return false;								
				}
			}
		}else{
			return false;
		}
	}
}


	@Override
	public String toString(){
		return (jogador.getCor() == Cor.BRANCO)? "   \u2657   |":"   \u265D   |";
	}

		
}
	
