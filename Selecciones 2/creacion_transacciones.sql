create table transacciones(
	codigo int not null,
	numero_cuenta char(5) not null,
	monto money not null,
	tipo char(1) not null,
	fecha date ,
	hora time not null,
	constraint codigo_pk primary key(codigo)
);

insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(1, '22004', 200, 'C', '20/09/2023', '23:30');

insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(2, '22004', 500.65, 'D', '15/06/2022', '17:55');

insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(3, '22004', 1600, 'C', '17/05/2021', '16:37');

insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(4, '22004', 1050, 'D', '25/04/2020', '15:48');

insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(5, '22004', 300, 'D', '20/03/2019', '22:19');

insert into transacciones(codigo, numero_cuenta, monto, tipo, hora)
values(6, '22004', 400, 'C', '13:55');

insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(7, '22004', 600, 'D', '07/12/2015', '20:14');

insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(8, '22004', 800, 'D', '06/11/2012', '11:00');

insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(9, '22004', 900, 'D', '23/10/2002', '9:00');

insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)
values(10, '22004', 2000, 'C', '11/09/1999', '7:30');

select * from transacciones

select * from transacciones 
where tipo = 'C' and numero_cuenta
between '22004' and '222001'

select * from transacciones 
where tipo = 'D'
and fecha = '25/05/2025'
and numero_cuenta between '22007' and '22010'

select * from transacciones 
where codigo between 1 and 5
and numero_cuenta between '22002' and '22004'
and fecha = '26/05/2025' and fecha = '29/05/2025'

create table banco(
	codigo_banco int,
	codigo_transaccion int,
	detalle varchar(100),
	constraint codigo_banco_pk primary key (codigo_banco)
)

alter table banco
add constraint transacciones_banco_pk
foreign key (codigo_banco)
references transacciones(codigo)

insert into banco(codigo_banco,codigo_transaccion,detalle)
values(1,1,'');

insert into banco(codigo_banco,codigo_transaccion,detalle)
values(2,2,'');

insert into banco(codigo_banco,codigo_transaccion,detalle)
values(3,3,'');

insert into banco(codigo_banco,codigo_transaccion,detalle)
values(4,4,'');

insert into banco(codigo_banco,codigo_transaccion,detalle)
values(5,5,'');

insert into banco(codigo_banco,codigo_transaccion,detalle)
values(6,6,'');

insert into banco(codigo_banco,codigo_transaccion,detalle)
values(7,7,'');

insert into banco(codigo_banco,codigo_transaccion,detalle)
values(8,8,'');

insert into banco(codigo_banco,codigo_transaccion,detalle)
values(9,9,'');

insert into banco(codigo_banco,codigo_transaccion,detalle)
values(10,10,'');
