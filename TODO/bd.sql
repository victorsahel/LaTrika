insert into `tutorial2`.`carrera`(`id_carrera`,`coordinador`,`nombre`)
values 	(1,'Luis Callo','Ingenieria de Software' )


insert into `tutorial2`.`alumno`(`id_alumno`,`apellido`,`correo`,`direccion`,`dni`,`nombre`,`id_carrera`)
values (1,'Angel','Angel_De_Dios@hotmail.com','Av.El cielo Calle 666','74582365','Angelito',1)


insert into `tutorial2`.`curso`(`id_curso`,`nombre`,`creditos`,`descripcion`,`id_carrera`)
values (1,'Complejidad Algoritmicas',4,'Curso de Ingenieria de Software',1),
		(2,'Open Source',4,'Curso de Ingenieria de Software',1),
        (3,'Fisica 1',5,'Curso de Ingenieria de Software',1),
        (4,'Fisica 2',5,'Curso de Ingenieria de Software',1),
        (5,'Fisica 3',6,'Curso de Ingenieria de Software',1),
        (6,'Calculo 1',5,'Curso de Ingenieria de Software',1),
        (7,'Calculo 2',6,'Curso de Ingenieria de Software',1),
        (8,'IHC',3,'Curso de Ingenieria de Software',1),
        (9,'Programacion 1',6,'Curso de Ingenieria de Software',1),
        (10,'Programacion 2',5,'Curso de Ingenieria de Software',1)



insert into`tutorial2`.`video`(`id_video`,`descripcion`,`link`,`miniatura`,`titulo`,`id_curso`)
values  (1,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Campo Vectorial',7),
		(2,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Centro de Masa',7),
        (3,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Plano Tangente',7),
        
        (4,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Derivadas dobles',6),
        (5,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Integrales',6),
        (6,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Limites',6),
        
        (7,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Magnetismo 1',5),
        (8,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Magnetismo 2',5),
        (9,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Magnetismo 3',5),
        
        (10,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Caudal',4),
        (11,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Campo electrico',4),
        (12,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Trabajo',4),
        
		(13,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','MRU',3),
        (14,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','MRUV',3),
        (15,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Torque',3),
        
		(16,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Java 1',2),
        (17,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Java 2',2),
        (18,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Java 3',2),
        
		(19,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Guardado Texto',1),
        (20,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Template',1),
        (21,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Ordenar Listas',1),
        
		(22,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','UX 1',8),
        (23,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','UX 2',8),
        (24,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','UX 3',8),
        
		(25,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Hola Mundo',9),
        (26,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Arreglos',9),
        (27,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Adios Vida',9),
        
		(28,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Vector',10),
        (29,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Clases Padre',10),
        (30,'Video muy bueno','www.tuvideitoeasy.com','miniaturitaxdtuvi.jpg','Colision',10)
