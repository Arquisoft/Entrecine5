package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Usuario extends Model {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	public Long id;

	@Required
	@Column(nullable = false, unique = true)
	public String email;

	@Required
	@Column(nullable = false, unique = true)
	public String dni;

	@Required
	@Column(nullable = false)
	public String contrasena;

	@Required
	@Column(nullable = false)
	public String nombre;

	@Required
	@Column(nullable = false)
	public String apellidos;

	@Required
	@Column(nullable = false, name = "num_tarjeta")
	public Integer numTarjeta;
	
	@OneToMany(mappedBy = "usuario")
	public List<Entrada> entradas = new ArrayList<Entrada>();

	public static List<Usuario> all() {
		return find.all();
	}

	public static void create(Usuario usuario) {
		usuario.save();
	}

	public static void remove(Long id) {
		find.ref(id).delete();
	}

	public static Finder<Long, Usuario> find = new Finder<Long, Usuario>(
			Long.class, Usuario.class);

}
