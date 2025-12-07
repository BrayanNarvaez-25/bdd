
create table clientes(
	cedula char(10) not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	constraint clientes_pk primary key(cedula)
);

insert into clientes(cedula,nombre,apellido)
values('1281728318','Brayan','Narvaez');

insert into clientes(cedula,nombre,apellido)
values('2939272949','Brayan','Narvaez');

insert into clientes(cedula,nombre,apellido)
values('4828783828','Brayan','Narvaez');

insert into clientes(cedula,nombre,apellido)
values('9583937583','Brayan','Narvaez');

insert into clientes(cedula,nombre,apellido)
values('9583978309','Brayan','Narvaez');

insert into clientes(cedula,nombre,apellido)
values('0497930935','Brayan','Narvaez');

insert into clientes(cedula,nombre,apellido)
values('2847283482','Brayan','Narvaez');

insert into clientes(cedula,nombre,apellido)
values('5938785938','Brayan','Narvaez');

insert into clientes(cedula,nombre,apellido)
values('0583847539','Brayan','Narvaez');

insert into clientes(cedula,nombre,apellido)
values('2143472234','Monica','Ramos');

select * from clientes

create table compras(
	id_compra int not null,
	cedula char(10) not null,
	fecha_compra DATE not null,
	monto money,
	constraint id_compra_pk primary key(id_compra)
);

alter table compras
add constraint clientes_compras_fk
foreign key (cedula)
references clientes(cedula)

insert into compras(id_compra,cedula,fecha_compra,monto)
values(1,'1281728318','04/12/2025',6);

insert into compras(id_compra,cedula,fecha_compra,monto)
values(2,'2939272949','04/12/2025',6);

insert into compras(id_compra,cedula,fecha_compra,monto)
values(3,'4828783828','04/12/2025',6);

insert into compras(id_compra,cedula,fecha_compra,monto)
values(4,'9583937583','04/12/2025',6);

insert into compras(id_compra,cedula,fecha_compra,monto)
values(5,'9583978309','04/12/2025',6);

insert into compras(id_compra,cedula,fecha_compra,monto)
values(6,'0497930935','04/12/2025',6);

insert into compras(id_compra,cedula,fecha_compra,monto)
values(7,'2847283482','04/12/2025',6);

insert into compras(id_compra,cedula,fecha_compra,monto)
values(8,'5938785938','04/12/2025',6);

insert into compras(id_compra,cedula,fecha_compra,monto)
values(9,'0583847539','04/12/2025',6);

insert into compras(id_compra,cedula,fecha_compra,monto)
values(10,'2143472234','04/12/2025',6);

select * from compras

select cl.nombre,cl.apellido from
clientes cl, compras co
where
cl.cedula like '%7%'

select * from
clientes cl, compras co
where 
cl.nombre = 'Monica' and 
co.cedula = cl.cedula

select cl.cedula,sum(co.monto) 
from compras co, clientes cl
group by (cl.cedula)

select co.fecha_compra, count(co.fecha_compra) 
from compras co, clientes cl
where co.fecha_compra = '04/12/2025'
group by(co.fecha_compra)

select * from
clientes 

delete from clientes where cedula = '2939272949'