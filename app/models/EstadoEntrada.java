package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import play.db.ebean.Model;

@Entity
public class EstadoEntrada extends Model{

	private static final long serialVersionUID = 1L;
	
	@Id
	public String nombre;
	
	@OneToMany(mappedBy = "estadoEntrada")
	public List<Entrada> entradas = new ArrayList<Entrada>();
	
	public static List<EstadoEntrada> all() {
		return find.all();
	}

	public static void create(EstadoEntrada estadoEntrada) {
		estadoEntrada.save();
	}

	public static void remove(String nombre) {
		find.ref(nombre).delete();
	}

	public static Finder<String, EstadoEntrada> find = new Finder<String, EstadoEntrada>(
			String.class, EstadoEntrada.class);

}
