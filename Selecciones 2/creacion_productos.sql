create table productos(
	codigo int not null,
	nombre varchar(50) not null,
	descripcion varchar(50),
	precio money not null,
	stock int,
	constraint codigo_pk primary key(codigo)
);

insert into productos(codigo,nombre,descripcion,precio,stock) 
values (1,'Jabón','Lava todo',3.50,10);
insert into productos(codigo,nombre,descripcion,precio,stock) 
values (2,'Shampoo','Savital',2.50,20);
insert into productos(codigo,nombre,descripcion,precio,stock) 
values (3,'Deja','Deja',1.50,30);
insert into productos(codigo,nombre,descripcion,precio,stock) 
values (4,'Pasta dental','Fortident',3.0,40);
insert into productos(codigo,nombre,descripcion,precio,stock) 
values (5,'Cera','Cera de piso',2.50,50);
insert into productos(codigo,nombre,precio,stock) 
values (6,'Pan',1.50,50);
insert into productos(codigo,nombre,precio,stock) 
values (7,'Manteca',5.50,60);
insert into productos(codigo,nombre,precio,stock)
values (8,'Leche',2.50,70);
insert into productos(codigo,nombre,precio,stock)
values (9,'Jamon',1.00,120);
insert into productos(codigo,nombre,precio,stock)
values (10,'Coca Cola',3.50,300);

select * from productos

Select * from productos 
where stock = 10 and precio < money(10)

select nombre,stock from productos
where nombre like '%m%' or descripcion = ''

select nombre from productos
where descripcion is null or stock = 0

create table ventas(
	id_venta int,
	codigo_producto int,
	fecha_venta DATE not null,
	cantidad int,
	constraint id_venta_pk primary key(id_venta)
);

alter table ventas 
add constraint productos_ventas_fk
foreign key (codigo_producto)
references productos(codigo)

insert into ventas(id_venta,codigo_producto,fecha_venta,cantidad)
values(11,1,'25/11/2025',5);

insert into ventas(id_venta,codigo_producto,fecha_venta,cantidad)
values(12,2,'25/11/2025',6);

insert into ventas(id_venta,codigo_producto,fecha_venta,cantidad)
values(13,3,'25/11/2025',6);

insert into ventas(id_venta,codigo_producto,fecha_venta,cantidad)
values(14,4,'25/11/2025',6);

insert into ventas(id_venta,codigo_producto,fecha_venta,cantidad)
values(15,5,'25/11/2025',6);

insert into ventas(id_venta,codigo_producto,fecha_venta,cantidad)
values(16,6,'25/11/2025',6);

insert into ventas(id_venta,codigo_producto,fecha_venta,cantidad)
values(17,7,'25/11/2025',6);

insert into ventas(id_venta,codigo_producto,fecha_venta,cantidad)
values(18,8,'25/11/2025',6);

insert into ventas(id_venta,codigo_producto,fecha_venta,cantidad)
values(19,9,'25/11/2025',6);

insert into ventas(id_venta,codigo_producto,fecha_venta,cantidad)
values(20,10,'25/11/2025',6);

select * from ventas

delete from productos
delete from ventas