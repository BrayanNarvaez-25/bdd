create table registros_entrada(
	codigo_registro int not null,
	cedula_empleado char(10) not null,
	fecha date not null,
	hora time not null,
	codigo_empleado int not null,
	constraint codigo_registro_pk primary key(codigo_registro)
);

insert into registros_entrada(codigo_registro, cedula_empleado, fecha, hora,codigo_empleado)
values(12345, '1754416489', '18/09/2023', '8:00',2201);

insert into registros_entrada(codigo_registro, cedula_empleado, fecha, hora,codigo_empleado)
values(12355, '1758254591', '03/08/2023', '13:00',3242);

insert into registros_entrada(codigo_registro, cedula_empleado, fecha, hora,codigo_empleado)
values(12346, '1715974492', '25/08/2023', '13:00',5433);

insert into registros_entrada(codigo_registro, cedula_empleado, fecha, hora,codigo_empleado)
values(12347, '1735642583', '28/08/2013', '13:00',5412);

insert into registros_entrada(codigo_registro, cedula_empleado, fecha, hora,codigo_empleado)
values(12389, '1707416984', '16/08/2023', '8:00',4324);

insert into registros_entrada(codigo_registro, cedula_empleado, fecha, hora,codigo_empleado)
values(12349, '1778541235', '17/08/2023', '11:00',5423);

insert into registros_entrada(codigo_registro, cedula_empleado, fecha, hora,codigo_empleado)
values(12310, '1742158637', '14/12/2023', '11:00',4328);

insert into registros_entrada(codigo_registro, cedula_empleado, fecha, hora,codigo_empleado)
values(12311, '1756321784', '15/08/2023', '10:00',7554);

insert into registros_entrada(codigo_registro, cedula_empleado, fecha, hora,codigo_empleado)
values(12358, '1712546328', '07/08/2023', '9:00',7544);

insert into registros_entrada(codigo_registro, cedula_empleado, fecha, hora,codigo_empleado)
values(12378, '1725785413', '02/09/2023', '10:00',6546);


select * from registros_entrada

select * from registros_entrada
where EXTRACT(MONTH FROM fecha) = 9
or cedula_empleado like '17%'

select * from registros_entrada
where EXTRACT(MONTH FROM fecha) = 8
and cedula_empleado like '17%'
and hora between '08:00'and '12:00'

select * from registros_entrada
where (EXTRACT(MONTH FROM fecha) = 8
and cedula_empleado like '17%'
and hora between '08:00'and '12:00')
or (EXTRACT(MONTH FROM fecha) = 9
and cedula_empleado like '08%'
and hora between '09:00'and '13:00') 

create table empleado(
	codigo_empleado int not null,
	nombre varchar(25),
	fecha date not null,
	hora time not null
)

ALTER TABLE empleado
ADD PRIMARY KEY (codigo_empleado);

alter table registros_entrada
add constraint registro_entrada_empleado_fk
foreign key (codigo_empleado)
references empleado(codigo_empleado)

insert into empleado(codigo_empleado,nombre,fecha,hora)
values(2201,'Pepe','04/02/2025','9:00');

insert into empleado(codigo_empleado,nombre,fecha,hora)
values(3242,'Pepe','04/02/2025','9:00');

insert into empleado(codigo_empleado,nombre,fecha,hora)
values(5433,'Pepe','04/02/2025','9:00');

insert into empleado(codigo_empleado,nombre,fecha,hora)
values(5412,'Pepe','04/02/2025','9:00');

insert into empleado(codigo_empleado,nombre,fecha,hora)
values(4324,'Pepe','04/02/2025','9:00');

insert into empleado(codigo_empleado,nombre,fecha,hora)
values(5423,'Pepe','04/02/2025','9:00');

insert into empleado(codigo_empleado,nombre,fecha,hora)
values(4328,'Pepe','04/02/2025','9:00');

insert into empleado(codigo_empleado,nombre,fecha,hora)
values(6546,'Pepe','04/02/2025','9:00');

insert into empleado(codigo_empleado,nombre,fecha,hora)
values(7554,'Pepe','04/02/2025','9:00');

insert into empleado(codigo_empleado,nombre,fecha,hora)
values(7544,'Pepe','04/02/2025','9:00');

select re.cedula_empleado, em.fecha, em.nombre from
empleado em, registros_entrada re
where
(re.fecha between '01/08/2023' and '31/08/2023') or
(re.cedula_empleado like '17%' and 
em.hora between '8:00' and '12:00') or 
(em.fecha between '06/10/2023' and '20/10/2023') or
(re.cedula_empleado like '08%' and
re.hora between '9:00' and '13:00')

select * from empleado em
join registros_entrada re on em.codigo_empleado = re.codigo_empleado
where
re.cedula_empleado = '2201';

select cedula, count(codigo_registro) 
from registros_entrada
group by registros_entrada