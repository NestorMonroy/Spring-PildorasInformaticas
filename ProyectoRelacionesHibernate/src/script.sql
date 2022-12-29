use use relacioneshibernate;

DROP TABLE IF EXISTS detalles_cliente;
create table detalles_cliente(
id INT(11) not null auto_increment,
web varchar(128) default null,
tfno varchar(128) default null,
comentarios varchar(128) default null,
primary key (id)) engine = innodb;

DROP TABLE IF EXISTS cliente;
create table cliente(
id INT(11) not null auto_increment,
nombre varchar(128) default null,
apellido varchar(128) default null,
direccion varchar(128) default null,
primary key (id)) engine = innodb


ALTER TABLE cliente ADD CONSTRAINT FK_DETALLES 
FOREIGN KEY (id) REFERENCES detalles_cliente(id) 
on delete no action on update no action;

DROP TABLE IF EXISTS pedido;
CREATE TABLE pedido (
id int(3) NOT NULL auto_increment, 
fecha date default null, 
forma_pago varchar(15), 
cliente_id int(3) default null,
primary key(id), 
key FK_CLIENTE_ID(cliente_id),
constraint cliente_id
foreign key (cliente_id)
references cliente(id))
