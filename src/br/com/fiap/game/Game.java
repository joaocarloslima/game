package br.com.fiap.game;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import br.com.fiap.game.view.PainelJogador;

public class Game extends JFrame{
	
	private static final long serialVersionUID = 1L;
	JTabbedPane abas = new JTabbedPane();

	public static void main(String[] args) {
		new Game().config();
	}

	private void config() {
		Jogador joao = new Jogador("Joao");
		joao.setImagem("guerreiro.png");
		
		Jogador maria = new Jogador("Maria");
		maria.setImagem("mago.png");
		
		Jogador mago = new Mago();
		mago.setImagem("mago.png");
		
		abas.add(new PainelJogador(joao), "joao");
		abas.add(new PainelJogador(mago), "mago");
		abas.add(new PainelJogador(maria), "maria");
		
		init();
		
	}

	private void init() {
		add(abas);
		setSize(500,250);
		setTitle("Game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
