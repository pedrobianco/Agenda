package agenda.java;

import javax.swing.JOptionPane;

public class ValidarLogin {
	
	LoginDAO log = new LoginDAO();
	
	public boolean validar(String login, Long senha) {
		boolean validou = false;
		try {
			Usuarios usu = log.consultaPorLogin(login);
			if (usu != null) {
				if (usu.getLogin().equals(login) && usu.getSenha().equals(senha)) {
					 JOptionPane.showMessageDialog(null, "Seja Bem vindo: " + login, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
					 return validou = true;
				} else {
					JOptionPane.showMessageDialog(null, "Login ou Senha invalidos");
				}
			}
		} catch (Exception e) {
			System.out.println("Erro ao validar o usuario");
		}
		return validou;
	}
}
