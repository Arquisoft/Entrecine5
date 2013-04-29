# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table entrada (
  id                        bigint not null,
  estado_entrada_nombre     varchar(255),
  sesion_id                 bigint,
  num_fila                  integer not null,
  num_asiento               integer not null,
  usuario_id                bigint,
  constraint pk_entrada primary key (id))
;

create table estado_entrada (
  nombre                    varchar(255) not null,
  constraint pk_estado_entrada primary key (nombre))
;

create table pelicula (
  id                        bigint not null,
  titulo                    varchar(255) not null,
  genero                    varchar(255),
  sinopsis                  varchar(255),
  duracion                  integer,
  fecha_inicio_cartelera    timestamp not null,
  fecha_fin_cartelera       timestamp,
  constraint pk_pelicula primary key (id))
;

create table sala (
  nombre                    varchar(255) not null,
  constraint pk_sala primary key (nombre))
;

create table sesion (
  id                        bigint not null,
  pelicula_id               bigint,
  sala_nombre               varchar(255),
  tipo_sesion_nombre        varchar(255),
  hora_inicio               timestamp not null,
  hora_fin                  timestamp not null,
  constraint pk_sesion primary key (id))
;

create table tipo_sesion (
  nombre                    varchar(255) not null,
  precio                    double not null,
  constraint pk_tipo_sesion primary key (nombre))
;

create table usuario (
  id                        bigint not null,
  email                     varchar(255) not null,
  dni                       varchar(255) not null,
  contrasena                varchar(255) not null,
  nombre                    varchar(255) not null,
  apellidos                 varchar(255) not null,
  num_tarjeta               integer not null,
  constraint uq_usuario_email unique (email),
  constraint uq_usuario_dni unique (dni),
  constraint pk_usuario primary key (id))
;

create sequence entrada_seq;

create sequence estado_entrada_seq;

create sequence pelicula_seq;

create sequence sala_seq;

create sequence sesion_seq;

create sequence tipo_sesion_seq;

create sequence usuario_seq;

alter table entrada add constraint fk_entrada_estadoEntrada_1 foreign key (estado_entrada_nombre) references estado_entrada (nombre) on delete restrict on update restrict;
create index ix_entrada_estadoEntrada_1 on entrada (estado_entrada_nombre);
alter table entrada add constraint fk_entrada_sesion_2 foreign key (sesion_id) references sesion (id) on delete restrict on update restrict;
create index ix_entrada_sesion_2 on entrada (sesion_id);
alter table entrada add constraint fk_entrada_usuario_3 foreign key (usuario_id) references usuario (id) on delete restrict on update restrict;
create index ix_entrada_usuario_3 on entrada (usuario_id);
alter table sesion add constraint fk_sesion_pelicula_4 foreign key (pelicula_id) references pelicula (id) on delete restrict on update restrict;
create index ix_sesion_pelicula_4 on sesion (pelicula_id);
alter table sesion add constraint fk_sesion_sala_5 foreign key (sala_nombre) references sala (nombre) on delete restrict on update restrict;
create index ix_sesion_sala_5 on sesion (sala_nombre);
alter table sesion add constraint fk_sesion_tipoSesion_6 foreign key (tipo_sesion_nombre) references tipo_sesion (nombre) on delete restrict on update restrict;
create index ix_sesion_tipoSesion_6 on sesion (tipo_sesion_nombre);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists entrada;

drop table if exists estado_entrada;

drop table if exists pelicula;

drop table if exists sala;

drop table if exists sesion;

drop table if exists tipo_sesion;

drop table if exists usuario;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists entrada_seq;

drop sequence if exists estado_entrada_seq;

drop sequence if exists pelicula_seq;

drop sequence if exists sala_seq;

drop sequence if exists sesion_seq;

drop sequence if exists tipo_sesion_seq;

drop sequence if exists usuario_seq;

