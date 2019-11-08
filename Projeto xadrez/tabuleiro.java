import jogador.Jogador;
import pecas.Bispo;
import pecas.Cavalo;
import pecas.Peao;
import pecas.Peca;
import pecas.Rainha;
import pecas.Rei;
import pecas.Torre;

public class Tabuleiro {
		
	public static Peca[][] tab;	
		
	@Override
	public String toString() {
		String saida = "";
		saida += "        0     1     2     3     4     5     6     7  \n";
		
		for(int i = 0; i < tab.length; i++){
			saida += "     _____ _____ _____ _____ _____ _____ _____ _____\n";
			saida += ("  "+i+" |");
			for(int j = 0; j < tab[i].length; j++){
				saida += ((tab[i][j]==null)? "      |":tab[i][j].toString());
			}
			saida += "\n";
		}
		saida += "     _____ _____ _____ _____ _____ _____ _____ _____\n";
		return saida;
	}
	
	public static Tabuleiro getTabuleiro() {	
		return new Tabuleiro();
	}
	
	public Tabuleiro(){
	}

	public Tabuleiro (Jogador j1, Jogador j2){
		tab = new Peca[8][8];
		int linha = 0, coluna = 0;
		//torre
		tab[linha][coluna] = new Torre(j1, linha,coluna);
		coluna = 7;
		tab[linha][coluna] = new Torre(j1, linha, coluna);
		
		//cavalo
		coluna = 1;
		tab[linha][coluna] = new Cavalo(j1, linha, coluna);
		coluna = 6;
		tab[linha][coluna] = new Cavalo(j1, linha, coluna);
		
		//bispo
		coluna = 2;
		tab[linha][coluna] = new Bispo(j1, linha, coluna);
		coluna = 5;
		tab[linha][coluna] = new Bispo(j1, linha, coluna);
		
		//Rainha
		coluna = 3;
		tab[linha][coluna] = new Rainha(j1, linha, coluna);
		
		//Rei
		coluna = 4;
		tab[linha][coluna] = new Rei(j1, linha, coluna);
		
		for( int k = 0; k <= 7; k++){
			tab [1][k] = new Peao(j1, 1,k);	
		}
		
		//jogador 2
				linha = 7; 
				coluna = 0;
		
		//torre
				tab[linha][coluna] = new Torre(j2, linha,coluna);
				coluna = 7;
				tab[linha][coluna] = new Torre(j2, linha, coluna);
				
				//cavalo
				coluna = 1;
				tab[linha][coluna] = new Cavalo(j2, linha, coluna);
				coluna = 6;
				tab[linha][coluna] = new Cavalo(j2, linha, coluna);
				
				//bispo
				coluna = 2;
				tab[linha][coluna] = new Bispo(j2, linha, coluna);
				coluna = 5;
				tab[linha][coluna] = new Bispo(j2, linha, coluna);
				
				//Rainha
				coluna = 3;
				tab[linha][coluna] = new Rainha(j2, linha, coluna);
				
				//Rei
				coluna = 4;
				tab[linha][coluna] = new Rei(j2, linha, coluna);
				
				for( int k = 0; k <= 7; k++){
					tab [6][k] = new Peao(j2,6,k);
		
				}		
	}

	public Peca getPeca(int linha, int coluna) {
		return tab[linha][coluna];
	}

	public void setPeca(int linhaAtual, int colunaAtual, Object object) {
		tab[linhaAtual][colunaAtual] = (Peca) object;
	}	