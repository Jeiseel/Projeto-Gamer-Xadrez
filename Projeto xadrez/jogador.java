package jogador;

public class Jogador {
	
	public enum Cor{
		BRANCO, PRETO;
	}
	private String nome;
	private Cor cor;
	
	public boolean equals(Object obj){
		if(obj == null)
			return false;
		
		else if (obj instanceof Jogador){
			Jogador play = (Jogador) obj;
			if (play.getCor() ==  cor)
				return true;			
		}
		return false;
	}
	
	public Jogador (String nome, Cor cor){
		this.nome = nome;
		this.cor = cor;
	}
	
	public Cor getCor(){
		return cor;
	}
	
	public String getNome(){
		return nome;
	}
	
	

}
