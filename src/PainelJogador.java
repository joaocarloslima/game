import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelJogador extends JPanel {

	private static final long serialVersionUID = 1L;
	private Jogador jogador;
	
	JPanel painelDados = new JPanel();
	JPanel painelBotoes = new JPanel();

	private JLabel imagem = new JLabel();
	private JLabel lblNome;
	private JLabel lblXp;
	private JLabel lblHp;
	private JLabel lblMp;
	private JLabel lblEnvenenado;
	
	public PainelJogador(Jogador jogador) {
		this.jogador = jogador;
		render();
	}

	private void render() {
		remove(imagem);
		remove(painelDados);
		remove(painelBotoes);
		
		painelDados = new JPanel();
		painelBotoes = new JPanel();
		
		setLayout(new GridLayout(1,3));
		
		imagem = new JLabel(new ImageIcon("src/resources/" + jogador.getImagem()));
		
		lblNome = new JLabel(jogador.getNome());
		lblXp = new JLabel(String.valueOf(jogador.getXp()));
		lblHp = new JLabel(String.valueOf(jogador.getHp()));;
		lblMp = new JLabel(String.valueOf(jogador.getMp()));;
		lblEnvenenado = new JLabel(String.valueOf(jogador.isEnvenenado()));
		
		painelDados.setLayout(new GridLayout(5,2));
		painelDados.add(new JLabel("Nome:"));
		painelDados.add(lblNome);
		painelDados.add(new JLabel("HP:"));
		painelDados.add(lblHp);
		painelDados.add(new JLabel("XP:"));
		painelDados.add(lblXp);
		painelDados.add(new JLabel("MP:"));
		painelDados.add(lblMp);
		painelDados.add(new JLabel("Envenenado:"));
		painelDados.add(lblEnvenenado);
		
		JButton btnDano = new JButton("receber dano");
		JButton btnCura = new JButton("receber cura");
		JButton btnXp = new JButton("ganhar experiência");
		JButton btnAntidoto = new JButton("receber antidoto");
		JButton btnAtacar = new JButton("atacar");

		painelBotoes.add(btnDano);
		painelBotoes.add(btnCura);
		painelBotoes.add(btnXp);
		painelBotoes.add(btnAntidoto);
		painelBotoes.add(btnAtacar);
		
		btnDano.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				render();
			}
		});
		
		btnCura.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnXp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnAtacar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				render();
			}
		});
		
		btnAntidoto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				render();
			}
		});
		
		

		add(imagem);
		add(painelDados);
		add(painelBotoes);
	}

}
