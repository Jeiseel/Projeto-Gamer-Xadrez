package xadrez;

public class Posicao {
	
	private int coluna;
    private int linha;
    
    public Posicao(int coluna, int linha) {
        this.coluna = coluna;
        this.linha = linha;
    }
    
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    
    public void setLinha(int linha) {
        this.linha = linha;
    }

    
    public int getColuna() {
        return coluna;
    }

   
    public int getLinha() {
        return linha;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Posicao) {
            // Faz casting do objeto para posição.
            Posicao novaPosicao = (Posicao) obj;
            // As posições são iguais somente se suas linhas e colunas forem iguais.
            return this.getLinha() == novaPosicao.getLinha()
                    && this.getColuna() == novaPosicao.getColuna();
        } else {
            return false;
        }
    }

}
