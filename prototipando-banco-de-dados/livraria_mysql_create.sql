CREATE TABLE `tb_usuario` (
	`id_usuario` bigint(10) NOT NULL AUTO_INCREMENT,
	`login` varchar(255) NOT NULL,
	`email` varchar(255) NOT NULL,
	`senha` varchar(255) NOT NULL,
	`cpf` varchar(255) NOT NULL,
	`nascimento` DATE(255) NOT NULL,
	`genero` varchar(255) NOT NULL,
	`privilegio` int(255) NOT NULL,
	`data_cadastro` DATE(255) NOT NULL,
	PRIMARY KEY (`id_usuario`)
);

CREATE TABLE `tb_livro` (
	`id_livro` bigint(255) NOT NULL AUTO_INCREMENT,
	`id_autor` bigint(10) NOT NULL,
	`titulo` varchar(255) NOT NULL,
	`autor` varchar(255) NOT NULL,
	`sinopse` varchar(20000) NOT NULL,
	`editora` varchar(255) NOT NULL,
	`file_diretory` varchar(255) NOT NULL,
	`preco` DECIMAL NOT NULL,
	`categoria` varchar(255) NOT NULL,
	`foto` varchar(255) NOT NULL,
	PRIMARY KEY (`id_livro`)
);

CREATE TABLE `tb_categoria` (
	`id_categoria` bigint NOT NULL AUTO_INCREMENT,
	`categoria` varchar(255) NOT NULL AUTO_INCREMENT,
	`promo` BOOLEAN NOT NULL,
	`fisico` BOOLEAN NOT NULL,
	PRIMARY KEY (`id_categoria`)
);

ALTER TABLE `tb_usuario` ADD CONSTRAINT `tb_usuario_fk0` FOREIGN KEY (`id_usuario`) REFERENCES `tb_livro`(`id_autor`);

ALTER TABLE `tb_livro` ADD CONSTRAINT `tb_livro_fk0` FOREIGN KEY (`id_livro`) REFERENCES `db_livro_produto`(`id_livro`);

ALTER TABLE `tb_livro` ADD CONSTRAINT `tb_livro_fk1` FOREIGN KEY (`categoria`) REFERENCES `tb_categoria`(`categoria`);




