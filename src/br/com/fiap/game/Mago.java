package br.com.fiap.game;

public class Mago extends Jogador {
	
	
	@Override
	public void atacar(Jogador jogador) {
		if(getMp() > 0) {
			jogador.receberDano(10);
			this.ganharExperiencia(1);
		}
	}


}
