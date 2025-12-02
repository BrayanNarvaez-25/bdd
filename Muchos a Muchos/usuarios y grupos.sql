create table usuarios(
	id_usuario int not null,
	nombre varchar(25) not null,
	apellido varchar(25)not null,
	fecha_nacimiento date,
	constraint usuarios_pk primary key(id_usuario)
);

create table grupo(
	id_grupo int not null,
	nombre varchar(25) not null,
	descripcion varchar(75),
	fecha_creacion date,
	constraint grupo_pk primary key(id_grupo)
);

create table union_usuario(
	us_id int not null,
	gr_id int not null,
	constraint us_id_fk foreign key(us_id)
	references usuarios(id_usuario),
	constraint gr_id_fk foreign key(gr_id)
	references grupo(id_grupo)
);

insert into usuarios values (1,'Marilyn','Sagñay','05/11/2023'),
							(2,'Romel','Chamba','06/11/2023'),
							(3,'Mario','Guzñay','05/11/2023'),
							(4,'Johann','Domo','07/11/2023'),
							(5,'Monserrate','Vera','05/11/2023'),
							(6,'Lucio','Vargas','05/11/2023'),
							(7,'Martín','Arizaga','05/11/2023'),
							(8,'Fricson','Erazo','05/11/2023'),
							(9,'Jairo','Obando','05/11/2023'),
							(10,'Berni','Tomalá','05/11/2023');
							
							
insert into grupo values (1,'Maternal 1','Grupo de maternal matutino','08/03/2020'),
						 (2,'Maternal 2','Grupo de maternal vepertino','08/03/2020'),
						 (3,'Maternal 3','Grupo de maternal nocturno','08/03/2020'),
						 (4,'Incial 1 ','Grupo de inicial matutino','15/03/2021'),
						 (5,'Incial 2','Grupo de  inicial vespertino','15/03/2021'),
						 (6,'Incial 3','Grupo de  inicial  nocturno','15/03/2021'),
						 (7,'Incial intensivo','Grupo de inicial días sabados','15/03/2021'),
						 (8,'Maternal intensivo 1','Grupo de maternal matutino días sabados','15/03/2022'),
						 (9,'Maternal intensivo 2','Grupo de maternal vespertino días sabados','15/03/2022'),
						 (10,'Maternal intensivo 3','Grupo de maternal nocturno días sabados','15/03/2022');


insert into union_usuario values (1,8),
								 (2,3),
								 (3,8),
								 (4,9),
								 (5,1),
								 (6,2),
								 (7,8),
								 (8,8),
								 (9,10),
								 (10,1);

select * from usuarios, grupo, union_usuario

select us.nombre, gr.nombre
from usuarios us, grupo gr

select * from usuarios us, grupo gr, union_usuario uu
where us.id_usuario = uu.us_id

select * from usuarios us, grupo gr, union_usuario uu
where gr.id_grupo = uu.gr_id

select us.nombre from usuarios us

select * from usuarios us

select uu.us_id,uu.gr_id from union_usuario uu
where uu.gr_id = 1

select nombre from usuarios us, union_usuario uu
where us.id_usuario IN (select us_id from union_usuario
where gr_id = 1);

select gr.nombre, count(uu.us_id)
from grupo gr, union_usuario uu
where gr.id_grupo = uu.gr_id
group by gr.nombre

select us.nombre, gr.nombre 
from usuarios us, grupo gr, union_usuario uu
where us.id_usuario = uu.us_id and
gr.id_grupo = uu.gr_id and
gr.nombre like '%intensivo%'


select nombre from usuarios us, union_usuario uu
where us.id_usuario IN (select us_id from union_usuario
where gr_id = 2);

select gr.nombre, max(uu.us_id)
from grupo gr, union_usuario uu
where gr.id_grupo = uu.gr_id
group by gr.nombre

select us.nombre, gr.nombre 
from usuarios us, grupo gr, union_usuario uu
where us.id_usuario = uu.us_id and
gr.id_grupo = uu.gr_id and
gr.fecha_creacion between '08/03/2020' and '08/03/2022'

select nombre from usuarios us, union_usuario uu
where us.id_usuario IN (select us_id from union_usuario
where gr_id = 3);

select gr.nombre, count(uu.us_id)
from grupo gr, union_usuario uu
where gr.id_grupo = uu.gr_id and
gr.descripcion like '%matutino%'
group by gr.nombre