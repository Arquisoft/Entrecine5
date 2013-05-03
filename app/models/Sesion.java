package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.db.ebean.Model;

@Entity
public class Sesion extends Model {

	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue
	public Long id;
	
	@Column(name = "pelicula_id")
	@ManyToOne
	public Pelicula pelicula;
	
	@Column(name = "sala_id")
	@ManyToOne
	public Sala sala;
	
	@Column(name = "tipo_sesion_nombre")
	@ManyToOne
	public TipoSesion tipoSesion;
	
	@Column(nullable = false, name = "hora_inicio")
	public Date horaInicio;
	
	@Column(nullable = false, name = "hora_fin")
	public Date horaFin;
	
	@OneToMany(mappedBy = "sesion")
	public List<Entrada> entradas = new ArrayList<Entrada>();
	
	public static List<Sesion> all() {
		return find.all();
	}

	public static void create(Sesion sesion) {
		sesion.save();
	}

	public static void remove(Long id) {
		find.ref(id).delete();
	}

	public static Finder<Long, Sesion> find = new Finder<Long, Sesion>(
			Long.class, Sesion.class);
	
	public static void update(Sesion sesion,Long id){
		sesion.update();
	}

}
