package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Pelicula extends Model {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	public Long id;

	@Column(nullable = false)
	@Required
	public String titulo;

	public String genero;
	public String sinopsis;
	public Integer duracion;

	@Column(nullable = false, name = "fecha_inicio_cartelera")
	public Date fechaInicioCartelera;
	
	@Column(name = "fecha_fin_cartelera")
	public Date fechaFinCartelera;

	@OneToMany(mappedBy = "pelicula")
	public List<Sesion> sesiones = new ArrayList<Sesion>();
	
	public static List<Pelicula> all(){
		return find.all();
	}

	public static void create(Pelicula pelicula) {
		pelicula.save();
	}

	public static void remove(Long id) {
		find.ref(id).delete();
	}

	public static Finder<Long, Pelicula> find = new Finder<Long, Pelicula>(
			Long.class, Pelicula.class);

}
