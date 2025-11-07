create table cuentas(
	numero_cuenta char(5) not null,
	cedula_propietario char(5) not null,
	fecha_creacion date not null,
	saldo money not null,
	constraint numero_cuenta_pk primary key(numero_cuenta)
	
)

insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(54321,21821,'24/04/2025',400.63)

insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(12313,12345,'24/04/2025',500.70)

insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(60193,21821,'24/04/2025',400.63)

insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(02543,21821,'24/04/2025',400.63)

insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(78243,21821,'24/04/2025',400.63)

insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(06712,21821,'24/04/2025',400.63)

insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(79012,21821,'24/04/2025',400.63)

insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(80192,21821,'24/04/2025',400.63)

insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(78902,21821,'24/04/2025',400.63)

insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(01938,21821,'24/04/2025',400.63)

insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values(83292,17821,'24/04/2025',400.63)

select * from cuentas

update cuentas set saldo = 10 
where cedula_propietario like '17%'