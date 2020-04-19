CREATE TABLE `clinica`.`pacientes` (
  `cod_pac` INT NOT NULL,
  `nome` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `telefone` VARCHAR(45) NULL,
  `endereco` VARCHAR(45) NULL,
  `cidade` VARCHAR(45) NULL,
  `bairro` VARCHAR(45) NULL,
  PRIMARY KEY (`cod_pac`));
  
CREATE TABLE `clinica`.`permissao` (
`id_permissao` INT NOT NULL,
`descricao` VARCHAR(45) NULL,
PRIMARY KEY (`id_permissao`));
  
CREATE TABLE `clinica`.`usuario_permissao` (
`idusuario` VARCHAR(45) NULL,
`permissao` VARCHAR(45) NULL);
  
CREATE TABLE `clinica`.`usuarios` (
  `nome` VARCHAR(100) NULL,
  `login` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NULL,
  PRIMARY KEY (`login`));

  


