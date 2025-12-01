create table estudiantes(
	cedula char(10) not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	email varchar(50) not null,
	fecha_nacimiento date not null,
	constraint cedula_pk primary key(cedula)
);

insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (1235476801,'Raul','Martínez','raumart01@gmail.com','04/02/2003',1);
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (1292192919,'Raul','Martínez','raumart01@gmail.com','04/02/2003',2);
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (3838238882,'Raul','Martínez','raumart01@gmail.com','04/02/2003',3);
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (9492839293,'Raul','Martínez','raumart01@gmail.com','04/02/2003',4);
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (0499939393,'Raul','Martínez','raumart01@gmail.com','04/02/2003',5);
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (5837489458,'Raul','Martínez','raumart01@gmail.com','04/02/2003',6);
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (3245232423,'Raul','Martínez','raumart01@gmail.com','04/02/2003',7);
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (4546343523,'Raul','Martínez','raumart01@gmail.com','04/02/2003',8);
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (5436554533,'Raul','Martínez','raumart01@gmail.com','04/02/2003',9);
insert into estudiantes (cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)
values (6576534543,'Raul','Martínez','raumart01@gmail.com','04/02/2003',10);


select * from estudiantes

select nombre,apellido from estudiantes
where nombre like 'M%'  or apellido like '%z'

select nombre from estudiantes
where cedula like '18%' and cedula like '%32%'

select nombre,apellido from estudiantes 
where cedula like '%06' or cedula like '17%'

create table profesores(
	codigo int,
	nombre varchar(50) not null,
	constraint codigo_pk primary key(codigo)
)

alter table estudiantes
add column codigo_profesor int

alter table estudiantes 
add constraint profesores_estudiantes_fk
foreign key (codigo_profesor)
references profesores(codigo)

insert into profesores(codigo,nombre)
values(1,'Francisco');

insert into profesores(codigo,nombre)
values(2,'Pepe');

insert into profesores(codigo,nombre)
values(3,'Juan');

insert into profesores(codigo,nombre)
values(4,'Leo');

insert into profesores(codigo,nombre)
values(5,'Diego');

insert into profesores(codigo,nombre)
values(6,'Pedro');

insert into profesores(codigo,nombre)
values(7,'Manuela');

insert into profesores(codigo,nombre)
values(8,'Maria');

insert into profesores(codigo,nombre)
values(9,'Ana');

insert into profesores(codigo,nombre)
values(10,'Martha');

select pr.codigo, es.nombre, es.apellido from
profesores pr, estudiantes es
where
es.apellido like '%n%'

select * from
profesores pr, estudiantes es
where 
pr.nombre = 'Francisco'

select pr.codigo, count(es.cedula) 
from profesores pr, estudiantes es
group by pr.codigo

select round(avg(EXTRACT(YEAR FROM CURRENT_DATE)-EXTRACT(YEAR FROM fecha_nacimiento)))
as edad_promedio from estudiantes