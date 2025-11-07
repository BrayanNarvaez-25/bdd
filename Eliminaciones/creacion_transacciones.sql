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

insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(11,'21212',300.00,'D','10/09/2025','16:43')

insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)
values(12,'21212',300.00,'D','10/08/2025','16:43')

select * from transacciones

update transacciones set tipo = 'T'
where monto > money(100) and monto < money(500)
and fecha between '01/09/2025' and '30/09/2025'
and hora between '14:00' and '20:00'

delete from transacciones 
where hora between '14:00' and '18:00'
and fecha between '01/08/2025' and '31/08/2025'