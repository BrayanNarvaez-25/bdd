create table videojuegos(
	codigo int not null,
	nombre varchar(100) not null,
	descripcion varchar(300),
	valoracion int not null,
	constraint codigo_pk primary key(codigo)
)

insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(1,'eFootball','',10)

insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(2,'Clash Royale','',10)

insert into videojuegos(codigo,nombre,descripcion,valoracion)
values(3,'Mario Bross','Clasico',10)

select codigo,nombre,valoracion from videojuegos