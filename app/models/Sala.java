package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Sala extends Model {

	private static final long serialVersionUID = 1L;

	@Id
	@Required
	public String nombre;
	
	@OneToMany(mappedBy = "sala")
	public List<Sesion> sesiones = new ArrayList<Sesion>();

	public static List<Sala> all() {
		return find.all();
	}

	public static void create(Sala sala) {
		sala.save();
	}

	public static void remove(String nombre) {
		find.ref(nombre).delete();
	}

	public static Finder<String, Sala> find = new Finder<String, Sala>(
			String.class, Sala.class);

}
