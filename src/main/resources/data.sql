insert into university (code, name, uuid, id)
values ('UMSS', 'Universidad Mayor De San Simón','dd1917ce-9e04-47dd-a3eb-96b770c4b226', 1000);
insert into university (code, name, uuid, id)
values ('UCB','Universidad Católica De Bolivia','dd1917ce-9e04-47dd-a3eb-96b770c4b227', 1001);
insert into university (code, name, uuid, id)
values ('UNIVALLE', 'Universidad Privada Del Valle','dd1917ce-9e04-47dd-a3eb-96b770c4b228', 1002);


insert into faculty (code, name, university_id, uuid, id)
values ('FCYT', 'Facultad de Ciencias y Tecnología', 1000, 'dd1917ce-9e04-47dd-a3eb-96b770c4b240', 2000),
       ('FCE', 'Facultad de Ciencias Económicas', 1000, 'dd1917ce-9e04-47dd-a3eb-96b770c4b241', 2001),
       ('FM', 'Facultad de Medicina', 1001, 'dd1917ce-9e04-47dd-a3eb-96b770c4b242', 2002);
