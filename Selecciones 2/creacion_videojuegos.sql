
create table videojuegos(
	codigo int not null,
	nombre varchar(100) not null,
	descripcion varchar(300),
	valoracion int not null,
	constraint codigo_pk primary key(codigo)
);

insert into videojuegos(codigo, nombre, descripcion, valoracion)
values(07563, 'Call of Duty', 'juego de terror', 9);

insert into videojuegos(codigo, nombre, descripcion, valoracion)
values(85421, 'Free Fire', 'juego de guerra', 7);

insert into videojuegos(codigo, nombre, descripcion, valoracion)
values(93475, 'Call of Clans', 'juego de terror', 10);

insert into videojuegos(codigo, nombre, descripcion, valoracion)
values(15983, 'Fornite', 'juego de suspenso', 10);

insert into videojuegos(codigo, nombre, valoracion)
values(35784, 'Minecraft', 3);

insert into videojuegos(codigo, nombre, descripcion, valoracion)
values(54682, 'Tom and Jerry', 'juego de comedia', 8);

insert into videojuegos(codigo, nombre, descripcion, valoracion)
values(01456, 'Ajedres', 'juego de psicoligia', 6);

insert into videojuegos(codigo, nombre, descripcion, valoracion)
values(70215, 'God of Ward', 'juego de aprendisaje', 7);

insert into videojuegos(codigo, nombre, descripcion, valoracion)
values(63240, 'Crash', 'juego de deprote', 9);

insert into videojuegos(codigo, nombre, descripcion, valoracion)
values(63549, 'Dragon Ball', 'juego de baile', 8);


select * from videojuegos

select * from videojuegos
where nombre like 'C%' 
or nombre like '%c%' 
or valoracion = 7

select * from videojuegos
where codigo between 3 and 7 
or valoracion = 7

select * from videojuegos
where (descripcion = 'juego de guerra'
and valoracion > 7 and nombre like 'C%')
or (descripcion = 'juego de guerra'
and valoracion > 8 and nombre like 'D%')

create table plataformas(
	id_plataforma int,
	nombre_plataforma varchar(50) not null,
	codigo_videojuego int,
	constraint id_plataforma_pk primary key (id_plataforma)
)

alter table plataformas
add constraint videojuegos_plataformas_fk
foreign key (codigo_videojuego)
references videojuegos(codigo)

insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(11,'PlayStation 5',07563);

insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(12,'PlayStation 5',85421);

insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(13,'PlayStation 5',93475);

insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(14,'PlayStation 5',15983);

insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(15,'PlayStation 5',35784);

insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(16,'PlayStation 5',54682);

insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(17,'PlayStation 5',01456);

insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(18,'PlayStation 5',70215);

insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(19,'PlayStation 5',63240);

insert into plataformas(id_plataforma,nombre_plataforma,codigo_videojuego)
values(20,'PlayStation 5',63549);

select * from plataformas

select vi.nombre, vi.descripcion, vi.valoracion,pl.nombre_plataforma from
plataformas pl, videojuegos vi
where 
(vi.descripcion = 'juego de guerra' and
vi.valoracion > 7) or
(vi.nombre like 'C%' and
vi.valoracion > 8 or
vi.nombre like 'D%')

select * from 
plataformas pl, videojuegos vi
where 
pl.codigo_videojuego = vi.codigo and
vi.nombre = 'God of Ward'

select codigo_videojuego, count(id_plataforma) from plataformas
group by codigo_videojuego

select round(avg(valoracion),2) 
as valoracion_promedio
from videojuegos
