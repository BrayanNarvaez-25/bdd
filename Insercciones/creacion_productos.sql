create table productos(
	codigo int not null,
	nombre varchar(50) not null,
	descripcion varchar(50),
	precio money not null,
	stock int,
	constraint codigo_pk primary key(codigo)
)

insert into productos(codigo,nombre,descripcion,precio,stock)
values (233,'Pelota','Redonda',12.5,10)

insert into productos(codigo,nombre,descripcion,precio,stock)
values (244,'Zapato','Azul',68.4,6)

insert into productos(codigo,nombre,descripcion,precio,stock)
values (255,'Camiseta','',15.70,20)

insert into productos(codigo,nombre,descripcion,precio,stock)
values (266,'Limon','Verde',0.50,110)

insert into productos(codigo,nombre,descripcion,precio,stock)
values (277,'Pantalon','',8.63,17)

select * from productos
