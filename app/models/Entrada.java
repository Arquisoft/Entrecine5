package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.db.ebean.Model;

@Entity
public class Entrada extends Model {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	public Long id;
	
	@Column(name = "estado_entrada_nombre")
	@ManyToOne
	public EstadoEntrada estadoEntrada;
	
	@Column(name = "sesion_id")
	@ManyToOne
	public Sesion sesion;
	
	@Column(nullable = false,name = "num_fila")
	public Integer numFila;
	
	@Column(nullable = false, name = "num_asiento")
	public Integer numAsiento;
	
	@Column(name = "usuario_id")
	@ManyToOne
	public Usuario usuario;

}
