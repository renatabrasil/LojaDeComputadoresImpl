CREATE TABLE `vendedor` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`tipo` VARCHAR(40) NOT NULL DEFAULT '0',
	`nome` VARCHAR(120) NOT NULL DEFAULT '0',
	`endereco` VARCHAR(200) NOT NULL DEFAULT '0',
	`email` VARCHAR(100) NOT NULL DEFAULT '0',
	`telefone` VARCHAR(80) NOT NULL DEFAULT '0',
	PRIMARY KEY (`id`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;


CREATE TABLE `usuario` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`login` VARCHAR(50) NOT NULL DEFAULT '0',
	`senha` VARCHAR(50) NOT NULL DEFAULT '0',
	`vendedor_id` BIGINT(20) NULL DEFAULT '0',
	PRIMARY KEY (`id`),
	INDEX `vendedor_id_fk` (`vendedor_id`),
	CONSTRAINT `vendedor_id_fk` FOREIGN KEY (`vendedor_id`) REFERENCES `vendedor` (`id`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;

