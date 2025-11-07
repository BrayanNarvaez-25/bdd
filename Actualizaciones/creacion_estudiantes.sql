create table estudiantes(
	cedula char(10) not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	email varchar(50) not null,
	fecha_nacimiento date not null,
	constraint cedula_pk primary key(cedula)
)

insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('1727392035','Brayan','Narvaez','prueba@gmail.com','25/11/2007')

insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('9182892191','Juan','Ramirez','prueba@gmail.com','23/11/2007')

insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('1984280122','Pepe','Mnedoza','prueba@gmail.com','21/11/2007')

insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('3747192733','Gabriela','Diaz','prueba@gmail.com','20/11/2007')

insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('1288498284','Almendra','Zambrano','prueba@gmail.com','19/11/2007')

insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('2095738823','Jose','Nevez','prueba@gmail.com','18/11/2007')

insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('2827475830','Keylor','Navas','prueba@gmail.com','17/11/2007')

insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('2847575802','David','Rosero','prueba@gmail.com','16/11/2007')

insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento)
values('2847575805','David','Rosero','prueba@gmail.com','16/11/2007')

select * from estudiantes

update estudiantes set apellido = 'Hernández'
where cedula like '17%'