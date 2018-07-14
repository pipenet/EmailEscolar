package cl.inacap.emailescolar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import cl.inacap.emailescolar.dto.User;

@ManagedBean
@ViewScoped
public class MainBean {
	
	private User usuario = new User();
	
	public void login() {
		//hacerlogin(usuario);
		System.out.println(usuario.getUser() + " -> " + usuario.getPassword());
		//redirect
	}
	
	public User getUsuario() {
		return usuario;
	}

	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}

}
