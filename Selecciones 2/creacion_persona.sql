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
);

alter table prestamo
add constraint personas_prestamo_fk
foreign key(cedula)
references personas(cedula)

insert into personas(cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos)
values('1922939482','Sean','Suárez',1.70,'09/12/2025','5:30',500,0);

insert into personas(cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos)
values('9942949329','Sean','Suárez',1.70,'09/12/2025','5:30',500,0);

insert into personas(cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos)
values('3049230492','Sean','Suárez',1.70,'09/12/2025','5:30',500,0);

insert into personas(cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos)
values('4828489294','Sean','Suárez',1.70,'09/12/2025','5:30',500,0);

insert into personas(cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos)
values('5838483284','Sean','Suárez',1.70,'09/12/2025','5:30',500,0);

insert into personas(cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos)
values('0294929393','Sean','Suárez',1.70,'09/12/2025','5:30',500,0);

insert into personas(cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos)
values('4324542342','Sean','Suárez',1.70,'09/12/2025','5:30',500,0);

insert into personas(cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos)
values('6546435664','Sean','Suárez',1.70,'09/12/2025','5:30',500,0);

insert into personas(cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos)
values('6543454356','Sean','Suárez',1.70,'09/12/2025','5:30',500,0);

insert into personas(cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos)
values('8763457886','Sean','Suárez',1.70,'09/12/2025','5:30',500,0);

create table prestamo(
	cedula char(10),
	monto money,
	fecha_prestamo date,
	hora_prestamo time,
	garante varchar(40),
	constraint cedula2_pk primary key(cedula)
)

insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('1922939482',500,'09/12/2025','5:30','Amigo');

insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('9942949329',500,'09/12/2025','5:30','Amigo');

insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('3049230492',500,'09/12/2025','5:30','Amigo');

insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('4828489294',500,'09/12/2025','5:30','Amigo');

insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('5838483284',500,'09/12/2025','5:30','Amigo');

insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('0294929393',500,'09/12/2025','5:30','Amigo');

insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('4324542342',500,'09/12/2025','5:30','Amigo');

insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('6546435664',500,'09/12/2025','5:30','Amigo');

insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('6543454356',500,'09/12/2025','5:30','Amigo');

insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)
values('8763457886',500,'09/12/2025','5:30','Amigo');


select pe.cedula,pe.nombre,apellido,pr.cedula from
personas pe, prestamo pr
where 
pe.cedula = pr.cedula
and nombre like 'S%'

select pe.cantidad_ahorrada, pr.monto,pr.garante from
personas pe, prestamo pr
where
pr.monto >= money(100) and pr.monto <= money(1000)

select * from
personas pe, prestamo pr
where 
pe.cedula = pr.cedula and
pe.nombre = 'Sean'