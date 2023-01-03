CREATE DATABASE  IF NOT EXISTS `gestionPedidosCRUD` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `gestionPedidosCRUD`;


DROP TABLE IF EXISTS `cliente`;

CREATE TABLE `cliente` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(35) DEFAULT NULL,
  `apellido` varchar(35) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;



LOCK TABLES `cliente` WRITE;


INSERT INTO `cliente` VALUES 
	(1,'David','Maldonado','david@nestor.mx'),
	(2,'Sandra','López','sandra@nestor.mx'),
	(3,'María','Gómez','maria@nestor.mx'),
	(4,'Antonio','Fernández','antonio@nestor.mx'),
	(5,'Alicia','Martín','alicia@nestor.mx');


UNLOCK TABLES;



