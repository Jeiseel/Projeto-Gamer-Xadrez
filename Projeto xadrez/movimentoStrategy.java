package movimentos;

import excecoes.MovimentoNaoPermitidoExceptions;

public interface MovimentoStrategy {
	
	boolean podeMover(int linhaAtual, int colunaAtual, int linha, int coluna) throws MovimentoNaoPermitidoExceptions;

}