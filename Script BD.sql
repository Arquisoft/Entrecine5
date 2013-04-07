DROP TABLE IF EXISTS entrada
;
DROP TABLE IF EXISTS usuario
;
DROP TABLE IF EXISTS sesion
;
DROP TABLE IF EXISTS pelicula
;
DROP TABLE IF EXISTS sala
;
DROP TABLE IF EXISTS tipo_sesion
;
DROP TABLE IF EXISTS estado_entrada
;
DROP TABLE IF EXISTS entrada_historico
;

CREATE TABLE estado_entrada
(
	nombre VARCHAR(50) NOT NULL,
	PRIMARY KEY (nombre)

) ENGINE=INNODB;


CREATE TABLE entrada_historico
(
	id BIGINT UNSIGNED NOT NULL,
	estado_entrada VARCHAR(50) NOT NULL,
	sesion_id BIGINT UNSIGNED NOT NULL,
	num_fila INTEGER NOT NULL,
	num_asiento INTEGER NOT NULL,
	usuario_id BIGINT,
	PRIMARY KEY (id)

) ENGINE=INNODB;


CREATE TABLE tipo_sesion
(
	nombre VARCHAR(50) NOT NULL,
	precio NUMERIC(6,2) NOT NULL,
	PRIMARY KEY (nombre)

) ENGINE=INNODB;


CREATE TABLE entrada
(
	id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	estado_entrada VARCHAR(50) NOT NULL,
	sesion_id BIGINT UNSIGNED NOT NULL,
	num_fila INTEGER NOT NULL,
	num_asiento INTEGER NOT NULL,
	usuario_id BIGINT UNSIGNED DEFAULT NULL,
	PRIMARY KEY (id),
	KEY (estado_entrada),
	KEY (sesion_id),
	KEY (usuario_id)

) ENGINE=INNODB;


CREATE TABLE sesion
(
	id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	pelicula_id BIGINT UNSIGNED NOT NULL,
	sala_nombre VARCHAR(50) NOT NULL,
	tipo_sesion_nombre VARCHAR(50) NOT NULL,
	hora_inicio DATETIME NOT NULL,
	hora_fin DATETIME NOT NULL,
	PRIMARY KEY (id),
	KEY (pelicula_id),
	KEY (sala_nombre),
	KEY (tipo_sesion_nombre)

) ENGINE=INNODB;


CREATE TABLE sala
(
	nombre VARCHAR(50) NOT NULL,
	PRIMARY KEY (nombre)

) ENGINE=INNODB;


CREATE TABLE pelicula
(
	id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	titulo VARCHAR(50) NOT NULL,
	genero VARCHAR(20),
	director VARCHAR(50),
	actores VARCHAR(100),
	sinopsis VARCHAR(255),
	duracion INTEGER,
	fecha_inicio_cartelera DATE NOT NULL,
	fecha_fin_cartelera DATE,
	PRIMARY KEY (id)

) ENGINE=INNODB;


CREATE TABLE usuario
(
	id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	dni VARCHAR(9) NOT NULL,
	contrasena VARCHAR(50) NOT NULL,
	nombre VARCHAR(50) NOT NULL,
	apellidos VARCHAR(100) NOT NULL,
	num_tarjeta INTEGER NOT NULL,
	PRIMARY KEY (id),
	UNIQUE UQ_usuario_dni(dni),
	UNIQUE UQ_usuario_nombre_usuario(contrasena)

) ENGINE=INNODB;





ALTER TABLE entrada ADD CONSTRAINT FK_entrada_estado_entrada 
	FOREIGN KEY (estado_entrada) REFERENCES estado_entrada (nombre)
	ON UPDATE CASCADE
;

ALTER TABLE entrada ADD CONSTRAINT FK_entrada_sesion 
	FOREIGN KEY (sesion_id) REFERENCES sesion (id)
;

ALTER TABLE entrada ADD CONSTRAINT FK_entrada_usuario 
	FOREIGN KEY (usuario_id) REFERENCES usuario (id)
;

ALTER TABLE sesion ADD CONSTRAINT FK_sesion_pelicula 
	FOREIGN KEY (pelicula_id) REFERENCES pelicula (id)
;

ALTER TABLE sesion ADD CONSTRAINT FK_sesion_sala 
	FOREIGN KEY (sala_nombre) REFERENCES sala (nombre)
	ON UPDATE CASCADE
;

ALTER TABLE sesion ADD CONSTRAINT FK_sesion_tipo_sesion 
	FOREIGN KEY (tipo_sesion_nombre) REFERENCES tipo_sesion (nombre)
	ON UPDATE CASCADE
;
