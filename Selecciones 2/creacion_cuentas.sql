create table cuentas(
	numero_cuenta char(5) not null,
	cedula_propietario char(5) not null,
	fecha_creacion date not null,
	saldo money not null,
	constraint numero_cuenta_pk primary key(numero_cuenta)
	
);

insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25569,17504,'15/01/2023',500);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25570,17500,'01/11/2022',600);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25571,17501,'22/01/2023',700);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25572,17508,'30/05/2022',800);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25573,17506,'15/03/2023',900);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25574,17510,'15/05/2023',1000);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25575,17507,'15/09/2023',100);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25576,17515,'15/10/2023',900);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25577,17512,'15/08/2022',500);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (25578,17503,'15/06/2022',500);
insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)
values (54354,17092,'21/08/2023',100);

select * from cuentas

select numero_cuenta, saldo from cuentas
where saldo > money(100) and saldo < money(1000)

select * from cuentas
where fecha_creacion between '7/11/2024' and '7/11/2025'

select * from cuentas
where saldo = money(0) or cedula_propietario like '%2'


create table usuario(
	cedula char(5) not null,
	nombre varchar(25) not null,
	apellido varchar(25) not null,
	tipo_cuenta varchar(20),
	limite_credito decimal(10,5),
	constraint usuario_pk primary key(cedula)
);

select * from usuario

alter table cuentas
add constraint cuentas_usuario_fk
foreign key (cedula_propietario)
references usuario(cedula)

insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito)
values (17504,'Brayan','Narváez','C',5);
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito)
values (17500,'Brayan','Narváez','C',5);
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito)
values (17501,'Brayan','Narváez','C',5);
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito)
values (17508,'Brayan','Narváez','C',5);
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito)
values (17506,'Brayan','Narváez','C',5);
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito)
values (17510,'Brayan','Narváez','C',5);
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito)
values (17507,'Brayan','Narváez','C',5);
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito)
values (17515,'Brayan','Narváez','C',5);
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito)
values (17512,'Brayan','Narváez','C',5);
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito)
values (17503,'Brayan','Narváez','C',5);
insert into usuario (cedula,nombre,apellido,tipo_cuenta,limite_credito)
values (17092,'Brayan','Narváez','C',5);