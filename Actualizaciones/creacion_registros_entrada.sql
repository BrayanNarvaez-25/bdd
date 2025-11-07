create table registros_entrada(
	codigo_registro int not null,
	cedula_empleado char(10) not null,
	fecha date not null,
	hora time not null,
	constraint codigo_registro_pk primary key(codigo_registro)
)

insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(12345,'2121234929','14/05/2025','13:56')

insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(92838,'9021218821','14/05/2025','13:56')

insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(09384,'9182949222','14/05/2025','13:56')

insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(10384,'9284929482','14/05/2025','13:56')

insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(20495,'8482749384','14/05/2025','13:56')

insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(29847,'5737272834','14/05/2025','13:56')

insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(54534,'2182832821','14/05/2025','13:56')

insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(09485,'2184928129','14/05/2025','13:56')

insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(92182,'2194839123','14/05/2025','13:56')

insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(43932,'4737173843','14/05/2025','13:56')

insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(21021,'4627374628','14/05/2025','13:56')

insert into registros_entrada(codigo_registro,cedula_empleado,fecha,hora)
values(24343,'4627374628','14/08/2025','13:56')

select * from registros_entrada

update registros_entrada set cedula_empleado = '082345679'
where fecha between '01/08/2025' and '31/08/2025'
