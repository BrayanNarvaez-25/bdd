create table personas(
	cedula char(10) not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	estatura decimal,
	fecha_nacimiento date,
	hora_nacimiento time,
	cantidad_ahorrada money,
	numero_hijos int,
	constraint cedula_pk primary key(cedula)
)
insert into personas(cedula,nombre,apellido)
values ('1727392035','Brayan','Narvaez')

insert into personas(cedula,nombre,apellido, estatura)
values ('1234567890','Nelson','Angulo',1.85)

insert into personas(cedula,nombre,apellido,numero_hijos)
values ('1212121212','Diego','Maradona',3)

insert into personas(cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos)
values ('1334243243','Pepe','Menedoza',1.60,'04/10/2025','12:35',500.54,3)

select cedula,nombre,numero_hijos,estatura from personas

select * from personas