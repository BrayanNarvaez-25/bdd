create table ciudad(
	id_ciudad int not null,
	nombre varchar(45) not null,
	constraint ciudad_pk primary key(id_ciudad)
);

create table municipio(
	id_mun int not null,
	nombre varchar(45),
	ciudad_id int,
	constraint id_mun_pk primary key(id_mun),
	constraint ciudad_pk foreign key(ciudad_id)
	references ciudad(id_ciudad)
);

create table proyecto(
	id_proyecto int not null,
	proyecto varchar (50)not null,
	monto money not null,
	fecha_inicio date,
	fecha_entrega date,
	constraint proyecto_pk primary key(id_proyecto)
);

create table proyecto_municipio(
	municipio_id int not null,
	proyecto_id int not null,
	constraint proyecto_por_mun_pk 
	primary key(municipio_id,proyecto_id),
	constraint municipio_fk foreign key(municipio_id)
	references municipio(id_mun),
	constraint proyecto_fk foreign key(proyecto_id)
	references proyecto(id_proyecto)
);

insert into ciudad values   (1,'Quito'),
							(2,'Ambato'),
							(3,'Guayaquil'),
							(4,'Machala'),
							(5,'Manta'),
							(6,'Loja'),
							(7,'Otavalo'),
							(8,'Cuenca'),
							(9,'Latacunga'),
							(10,'Tena');


insert into municipio values (1,'GAD MUNICIPAL QUITO',1),
							 (2,'GAD MUNICIPAL DE CUENCA',8),
							 (3,'GAD MUNICIPALIDAD DE AMBATO',2),
							 (4,'MUNICIPALIDAD DE MACAHALA ',4),
							 (5,'MUNIUCIPIO DE GUAYAQUIL',3),
							 (6,'MUNICIPIO DE OTAVALO',7),
							 (7,'MUNICIPIO DE LOJA',6),
							 (8,'MUNICIPIO DE MANTA',5),
							 (9,'MUNICIPIO DE LATACUNGA',9),
							 (10,'MUNICIPIO DE TENA',10);


insert into proyecto values (1,'Proyectos de Gestión Ambiental',9543.327,'10/02/2022','10/02/2023'),
							(2,'Proyectos en Fomento y Desarrollo Productivo',26553.264,'25/06/2022','10/08/2022'),
							(3,'Proyectos en Cambio Climático',1292.194,'01/02/2021','10/12/2023');
							
							

insert into proyecto_municipio values (1,3),
									  (3,3),
									  (1,2),
									  (2,1),
									  (2,3),
									  (1,1),
									  (3,1),
									  (3,2)

select mu.nombre, pr.proyecto
from municipio mu, proyecto pr, proyecto_municipio pm
where mu.id_mun = pm.municipio_id and
pr.id_proyecto = pm.proyecto_id

select mu.nombre, pr.proyecto
from municipio mu, proyecto pr, proyecto_municipio pm
where mu.id_mun = pm.municipio_id and
pr.id_proyecto = pm.proyecto_id and
mu.nombre like '%GAD%'

select mu.nombre, ci.nombre 
from municipio mu, ciudad ci

select pr.proyecto 
from proyecto pr, proyecto_municipio pm
where pr.id_proyecto in(select id_proyecto 
from proyecto where municipio_id = 1 )

select pr.proyecto 
from proyecto pr, proyecto_municipio pm
where pr.id_proyecto in(select id_proyecto 
from proyecto where municipio_id = 3 )

select mu.nombre, count(pm.proyecto_id)
from municipio mu, proyecto_municipio pm
where mu.id_mun = pm.municipio_id
group by mu.nombre

select mu.nombre, min(pm.proyecto_id)
from municipio mu, proyecto_municipio pm
where mu.id_mun = pm.municipio_id
group by mu.nombre

select mu.nombre, max(pm.proyecto_id)
from municipio mu, proyecto_municipio pm
where mu.id_mun = pm.municipio_id
group by mu.nombre