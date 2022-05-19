package br.com.fiap.game;

public class Jogador {
	
	private String nome;
	private int xp;
	private int mp;
	private int hp = 100;
	private boolean envenenado;
	private String imagem;
	
	public Jogador() {
		
	}
	
	public Jogador(String nome) {
		this.nome = nome;
	}
	
	public void receberDano(int pontos) {
		if(pontos>0) hp -= pontos;
	}
	
	public void receberCura(int pontos) {
		if(pontos>0) hp += pontos;
	}
	
	public void ganharExperiencia(int pontos) {
		if(pontos>0) xp += pontos;
	}
	
	public void receberAntidoto() {
		envenenado = !envenenado;
	}
	
	public void atacar(Jogador jogador) {
		this.ganharExperiencia(2);
		jogador.receberDano(5);
	}
	
	public int getHp() {
		return hp;
	}

	public int getXp() {
		return xp;
	}

	public boolean isEnvenenado() {
		return envenenado;
	}

	public String getNome() {
		return nome;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public int getMp() {
		return mp;
	}
	
}
