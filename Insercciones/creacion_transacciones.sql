create table transacciones(
	codigo int not null,
	numero_cuenta char(5) not null,
	monto money not null,
	tipo char(1) not null,
	fecha date not null,
	hora time not null,
	constraint codigo_pk primary key(codigo)
)

insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(1,'21212',300.00,'C','10/05/2025','10:43')

insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(2,'21212',300.00,'D','10/05/2025','10:43')

insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(3,'21212',300.00,'C','10/05/2025','10:43')

insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(4,'21212',300.00,'D','10/05/2025','10:43')

insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(5,'21212',300.00,'C','10/05/2025','10:43')

insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(6,'21212',300.00,'D','10/05/2025','10:43')

insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(7,'21212',300.00,'C','10/05/2025','10:43')

insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(8,'21212',300.00,'D','10/05/2025','10:43')

insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(9,'21212',300.00,'C','10/05/2025','10:43')

insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(10,'21212',300.00,'D','10/05/2025','10:43')

select * from transacciones