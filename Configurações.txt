JDK 8

Maven

propriedades do banco.
C:\Users\Roderick\Desktop\unip_APS8\src\main\resources\META-INF\spring

Banco de dados Mysql


Url: http://localhost:8080/meioambiente/



Banco dados:
é esperado Banco da dados com nome teste com as tabelas:

CREATE TABLE `pessoas` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cidade` varchar(200) NOT NULL,
  `cpf` varchar(25) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `rg` varchar(20) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8


e 


CREATE TABLE `meioambiente` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_hr` datetime NOT NULL,
  `descricao` varchar(200) NOT NULL,
  `local_cidade` varchar(100) NOT NULL,
  `local_complemento` varchar(50) DEFAULT NULL,
  `local_estado` varchar(100) NOT NULL,
  `local_numero` varchar(15) NOT NULL,
  `local_rua` varchar(200) NOT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8