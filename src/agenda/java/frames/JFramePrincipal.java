package agenda.java.frames;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import agenda.java.Agenda;
import agenda.java.Agenda_DAO;
import agenda.java.Horarios;
import agenda.java.cadastro_usuario;

public class JFramePrincipal extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void populartabela(String sql) throws SQLException {

		try {
			Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pacientes", "root",
					"");
			PreparedStatement stmt = (PreparedStatement) cn.prepareStatement(sql);
			stmt.execute();

			ResultSet rs = stmt.executeQuery();

			DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
			model.setNumRows(0);

			while (rs.next()) {

				model.addRow(new Object[] { rs.getInt("cod_pac"), rs.getString("nome"), rs.getString("email"),
						rs.getString("endereco"), rs.getString("est_uf"), rs.getString("telefone"),
						rs.getString("data"), rs.getString("hora"), rs.getString("medico")

				});
			}

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela!");
		}

	}

	Agenda agg = new Agenda();
	Agenda_DAO agd = new Agenda_DAO();

	/**
	 * Creates new form Principal
	 */
	public JFramePrincipal() {
		initComponents();
		setSize(1360, 768);
		setTitle("Agenda");
	    setIconImage(icone());
	    }
	    
	    public Image icone() {
	    	URL url = this.getClass().getResource("icone.jpg");
	    	Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
	    	return iconeTitulo;
	    }

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jMenuBar2 = new javax.swing.JMenuBar();
		jMenu3 = new javax.swing.JMenu();
		jMenu4 = new javax.swing.JMenu();
		jMenu5 = new javax.swing.JMenu();
		jMenuBar3 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenu2 = new javax.swing.JMenu();
		jMenuBar4 = new javax.swing.JMenuBar();
		jMenu6 = new javax.swing.JMenu();
		jMenu7 = new javax.swing.JMenu();
		jMenuBar5 = new javax.swing.JMenuBar();
		jMenu8 = new javax.swing.JMenu();
		jMenu9 = new javax.swing.JMenu();
		jMenu10 = new javax.swing.JMenu();
		jLabel2 = new javax.swing.JLabel();
		cod_pac_txt = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		nome_txt = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		email_txt = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		endereco_txt = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		Salvar = new javax.swing.JButton();
		limpar = new javax.swing.JButton();
		jLabel7 = new javax.swing.JLabel();
		cid_uf = new javax.swing.JTextField();
		deletar = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		atualizar = new javax.swing.JButton();
		alterar = new javax.swing.JButton();
		telefone_txt = new javax.swing.JFormattedTextField();
		jMenuBar1 = new javax.swing.JMenuBar();
		menuarquivo = new javax.swing.JMenu();
		salvar = new javax.swing.JMenuItem();
		cadastrar = new javax.swing.JMenuItem();
		sair = new javax.swing.JMenuItem();
		agenda = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		sobre = new javax.swing.JMenu();
		sob_ag = new javax.swing.JMenuItem();

		jMenu3.setText("File");
		jMenuBar2.add(jMenu3);

		jMenu4.setText("Edit");
		jMenuBar2.add(jMenu4);

		jMenu5.setText("jMenu5");

		jMenu1.setText("File");
		jMenuBar3.add(jMenu1);

		jMenu2.setText("Edit");
		jMenuBar3.add(jMenu2);

		jMenu6.setText("File");
		jMenuBar4.add(jMenu6);

		jMenu7.setText("Edit");
		jMenuBar4.add(jMenu7);

		jMenu8.setText("File");
		jMenuBar5.add(jMenu8);

		jMenu9.setText("Edit");
		jMenuBar5.add(jMenu9);

		jMenu10.setText("jMenu10");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowOpened(java.awt.event.WindowEvent evt) {
				txt(evt);
			}
		});

		jLabel2.setText("Codigo Paciente: ");

		jLabel3.setText("Nome:");

		nome_txt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				nome_txtActionPerformed(evt);
			}
		});

		jLabel4.setText("E-mail:");

		jLabel5.setText("Endereço:");

		endereco_txt.setToolTipText("");

		jLabel6.setText("Telefone:");

		Salvar.setText("Salvar");
		Salvar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SalvarActionPerformed(evt);
			}
		});

		limpar.setText("Limpar");
		limpar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				limparActionPerformed(evt);
			}
		});

		jLabel7.setText("Cidade/UF:");

		cid_uf.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cid_ufActionPerformed(evt);
			}
		});

		deletar.setText("Deletar");
		deletar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				deletarActionPerformed(evt);
			}
		});

		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Código", "Nome", "Email", "Endereco", "Estado", "Telefone", "Data Consulta",
				"Hora Consulta", "Médico" }));
		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				alterarrr(evt);
			}
		});
		jScrollPane1.setViewportView(jTable1);

		atualizar.setText("Atualizar");
		atualizar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				atualizarActionPerformed(evt);
			}
		});

		alterar.setText("Alterar");
		alterar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				alterarActionPerformed(evt);
			}
		});

		try {
			telefone_txt.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######-####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		telefone_txt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				telefone_txtActionPerformed(evt);
			}
		});

		menuarquivo.setText("Arquivo");

		salvar.setText("Salvar Como...");
		salvar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				salvarActionPerformed(evt);
			}
		});
		menuarquivo.add(salvar);

		cadastrar.setText("Cadastrar Usúario");
		cadastrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cadastrarActionPerformed(evt);
			}
		});
		menuarquivo.add(cadastrar);

		sair.setText("Sair");
		sair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sairActionPerformed(evt);
			}
		});
		menuarquivo.add(sair);

		jMenuBar1.add(menuarquivo);

		agenda.setText("Agenda ");

		jMenuItem1.setText("Horarios");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		agenda.add(jMenuItem1);

		jMenuBar1.add(agenda);

		sobre.setText("Sobre");

		sob_ag.setText("Sobre a Agenda");
		sob_ag.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sob_agActionPerformed(evt);
			}
		});
		sobre.add(sob_ag);

		jMenuBar1.add(sobre);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap(576, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addComponent(alterar)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(atualizar)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(Salvar)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(deletar)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(limpar).addGap(35, 35, 35))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addGroup(layout.createSequentialGroup().addComponent(jLabel2)
																.addGap(18, 18, 18)
																.addComponent(
																		cod_pac_txt,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 50,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(jLabel3))
														.addGroup(layout.createSequentialGroup().addComponent(jLabel4)
																.addGap(18, 18, 18)
																.addComponent(email_txt,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 177,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(101, 101, 101)
																.addGroup(layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(jLabel6).addComponent(jLabel5))))
												.addGroup(layout.createSequentialGroup().addComponent(jLabel7)
														.addGap(18, 18, 18)
														.addComponent(cid_uf, javax.swing.GroupLayout.PREFERRED_SIZE,
																177, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(172, 172, 172)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(nome_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 177,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(endereco_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 177,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(telefone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 177,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(422, 422, 422))))
				.addGroup(layout.createSequentialGroup().addComponent(jScrollPane1).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(30, 30, 30)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2)
						.addComponent(cod_pac_txt, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel3).addComponent(nome_txt, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(74, 74, 74)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4)
						.addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel5).addComponent(endereco_txt, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(66, 66, 66)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel7)
						.addComponent(cid_uf, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(telefone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel6))
				.addGap(151, 151, 151)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(Salvar)
						.addComponent(limpar).addComponent(deletar).addComponent(atualizar).addComponent(alterar))
				.addGap(18, 18, 18)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void salvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_salvarActionPerformed

		JFileChooser salvandoArquivo = new JFileChooser();
		salvandoArquivo.setFileFilter(new FileNameExtensionFilter("Documentos de texto (*.txt)", "txt"));
		salvandoArquivo.setAcceptAllFileFilterUsed(false);
		int resultado = salvandoArquivo.showSaveDialog(this);
		if (resultado != JFileChooser.APPROVE_OPTION) {
			return;
		}
		File salvarArquivoEscolhido = salvandoArquivo.getSelectedFile();
		if (!salvarArquivoEscolhido.getAbsolutePath().endsWith(".txt")) {
			salvarArquivoEscolhido = new File(salvarArquivoEscolhido.getAbsolutePath() + ".txt");
		}

		try {
			PrintWriter pw = new PrintWriter(new FileWriter(salvarArquivoEscolhido));
			cod_pac_txt.write(pw);
			pw.print(System.getProperty("line.separator"));
			nome_txt.write(pw);
			pw.print(System.getProperty("line.separator"));
			email_txt.write(pw);
			pw.print(System.getProperty("line.separator"));
			endereco_txt.write(pw);
			pw.print(System.getProperty("line.separator"));
			telefone_txt.write(pw);
			pw.print(System.getProperty("line.separator"));

			JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao Salvar");
		}

	}// GEN-LAST:event_salvarActionPerformed

	private void sairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sairActionPerformed
		JFrameLogin ll = new JFrameLogin();
		ll.setVisible(true);
		dispose();
	}// GEN-LAST:event_sairActionPerformed

	private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SalvarActionPerformed

		try {
			Agenda_DAO ad = new Agenda_DAO();
			Agenda a = new Agenda();

			a.setCod_pac(Integer.parseInt(cod_pac_txt.getText()));
			a.setNome(nome_txt.getText());
			a.setEmail(email_txt.getText());
			a.setEndereco(endereco_txt.getText());
			a.setEstuf(cid_uf.getText());
			a.setTelefone(telefone_txt.getText());
			ad.inserir(a);

			JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");

			cod_pac_txt.setText("");
			nome_txt.setText("");
			email_txt.setText("");
			endereco_txt.setText("");
			cid_uf.setText("");
			telefone_txt.setText("");

			this.populartabela("SELECT * FROM pacientes");

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar");
		} catch (NumberFormatException exx) {
			JOptionPane.showMessageDialog(null, "Erro! Por favor preencha o formulario");
		}

	}// GEN-LAST:event_SalvarActionPerformed

	private void cid_ufActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cid_ufActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_cid_ufActionPerformed

	private void limparActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_limparActionPerformed
		cod_pac_txt.setText("");
		nome_txt.setText("");
		email_txt.setText("");
		endereco_txt.setText("");
		cid_uf.setText("");
		telefone_txt.setText("");

		JOptionPane.showMessageDialog(null, "Limpo com Sucesso");
	}// GEN-LAST:event_limparActionPerformed

	private void sob_agActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sob_agActionPerformed
		JOptionPane.showMessageDialog(null, "Feito por Pedro Bianco ");
	}// GEN-LAST:event_sob_agActionPerformed

	private void deletarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deletarActionPerformed

		if (jTable1.getSelectedRow() != -1) {
			int linha = jTable1.getSelectedRow();
			javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) jTable1.getModel();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con_tabela = (Connection) DriverManager
						.getConnection("jdbc:mysql://localhost:3306/pacientes", "root", "");
				Statement stm = (Statement) con_tabela.createStatement();
				String sql = null;
				String nome = "Deletar o paciente de codigo: " + jTable1.getValueAt(linha, 0).toString() + " ?";
				int opcao_escolhida = JOptionPane.showConfirmDialog(null, nome, "Exclusão ",
						JOptionPane.YES_NO_OPTION);
				if (opcao_escolhida == JOptionPane.YES_OPTION) {
					int conseguiu_excluir = stm.executeUpdate(
							"delete from pacientes where cod_pac ='" + (jTable1.getValueAt(linha, 0).toString()) + "'");
					if (conseguiu_excluir == 1) {
						dtm.removeRow(linha);
						jTable1.setModel(dtm);
						JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
						cod_pac_txt.setText("");
						nome_txt.setText("");
						email_txt.setText("");
						endereco_txt.setText("");
						cid_uf.setText("");
						telefone_txt.setText("");
					}
				} else {
					return;
				}
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Erro a tentar excluir o registro..." + e);
			} catch (ClassNotFoundException e) {
			}

		}

	}// GEN-LAST:event_deletarActionPerformed

	private void txt(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_txt

		try {
			this.populartabela("SELECT * FROM pacientes");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro!!!");
		}
	}// GEN-LAST:event_txt

	private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_atualizarActionPerformed
		try {
			this.populartabela("SELECT * FROM pacientes");
			JOptionPane.showMessageDialog(null, "Tabela atualizada com sucesso!");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao Atualizar a tabela");
		}
	}// GEN-LAST:event_atualizarActionPerformed

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem1ActionPerformed
		Horarios h = new Horarios();
		h.setVisible(true);
	}// GEN-LAST:event_jMenuItem1ActionPerformed

	private void alterarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_alterarActionPerformed

		try {
			agg.setCod_pac(Integer.parseInt(cod_pac_txt.getText()));
			agg.setNome(nome_txt.getText());
			agg.setEmail(email_txt.getText());
			agg.setEndereco(endereco_txt.getText());
			agg.setEstuf(cid_uf.getText());
			agg.setTelefone(telefone_txt.getText());

			agd.alterar(agg);

			this.populartabela("SELECT * FROM pacientes");
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "Erro ao Alterar");

		} catch (NumberFormatException exx) {

			JOptionPane.showMessageDialog(null, "Erro! Por favor preencha o formulario");

		}
	}// GEN-LAST:event_alterarActionPerformed

	private void alterarrr(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_alterarrr

		int linha = jTable1.getSelectedRow();

		cod_pac_txt.setText(jTable1.getValueAt(linha, 0).toString());
		if (nome_txt != null){
			nome_txt.setText(jTable1.getValueAt(linha, 1).toString());
			email_txt.setText(jTable1.getValueAt(linha, 2).toString());
			endereco_txt.setText(jTable1.getValueAt(linha, 3).toString());
			cid_uf.setText(jTable1.getValueAt(linha, 4).toString());
			telefone_txt.setText(jTable1.getValueAt(linha, 5).toString());			
		}

	}// GEN-LAST:event_alterarrr

	private void telefone_txtActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void nome_txtActionPerformed(java.awt.event.ActionEvent evt) {
		
	}

	private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {
		cadastro_usuario cd = new cadastro_usuario();
		cd.setVisible(true);
		dispose();
	}
	private javax.swing.JButton Salvar;
	private javax.swing.JMenu agenda;
	private javax.swing.JButton alterar;
	private javax.swing.JButton atualizar;
	private javax.swing.JMenuItem cadastrar;
	private javax.swing.JTextField cid_uf;
	private javax.swing.JTextField cod_pac_txt;
	private javax.swing.JButton deletar;
	private javax.swing.JTextField email_txt;
	private javax.swing.JTextField endereco_txt;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu10;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenu jMenu5;
	private javax.swing.JMenu jMenu6;
	private javax.swing.JMenu jMenu7;
	private javax.swing.JMenu jMenu8;
	private javax.swing.JMenu jMenu9;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuBar jMenuBar2;
	private javax.swing.JMenuBar jMenuBar3;
	private javax.swing.JMenuBar jMenuBar4;
	private javax.swing.JMenuBar jMenuBar5;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JButton limpar;
	private javax.swing.JMenu menuarquivo;
	private javax.swing.JTextField nome_txt;
	private javax.swing.JMenuItem sair;
	private javax.swing.JMenuItem salvar;
	private javax.swing.JMenuItem sob_ag;
	private javax.swing.JMenu sobre;
	private javax.swing.JFormattedTextField telefone_txt;
	// End of variables declaration//GEN-END:variables

}
