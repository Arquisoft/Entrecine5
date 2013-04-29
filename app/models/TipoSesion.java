package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class TipoSesion extends Model{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	public String nombre;
	
	@Required
	@Column(nullable = false)
	public Double precio;
	
	@OneToMany(mappedBy = "tipoSesion")
	public List<Sesion> sesiones;

	public static List<TipoSesion> all() {
		return find.all();
	}

	public static void create(TipoSesion tipoSesion) {
		tipoSesion.save();
	}

	public static void remove(String nombre) {
		find.ref(nombre).delete();
	}

	public static Finder<String, TipoSesion> find = new Finder<String, TipoSesion>(
			String.class, TipoSesion.class);
	

}
