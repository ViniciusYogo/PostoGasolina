create database postosucelso ;
USE POSTOSUCELSO;

create table combustivel(
id_combustivel int primary key auto_increment,
TIPOCOMBUSTIVEL VARCHAR (20),
VALOR_LITRO_GASOLINA float
);


CREATE table VEICULO (
ID_VEICULO INT primary key auto_increment ,
PLACA VARCHAR (7),
MODELO VARCHAR (30),
LITROSABASTECIDOS float, 
TOTAL_VENDA float default  0,
id_combustivel_Fk int ,
foreign key (id_combustivel_Fk) references combustivel(id_combustivel)
);

CREATE TABLE produto (
ID_PRODUTO int primary key auto_increment,
NOME_PRODUTO VARCHAR (100),
PRECO_PRODUTO DOUBLE ,
QUANTIDADE_EM_ESTOQUE INT 
);

create table if not exists funcionario(
id_func int primary key auto_increment,
NOME_FUNC varchar(80),
CARGO_FUNC varchar(20),
USUARIO varchar(15),
SENHA varchar (10)
);


INSERT INTO combustivel (TIPOCOMBUSTIVEL, VALOR_LITRO_GASOLINA) 
VALUES 	('Gasolina', 5.25),
		('Álcool', 4.80),
        ('Diesel', 3.85);

INSERT INTO VEICULO (PLACA, MODELO, LITROSABASTECIDOS, TOTAL_VENDA, id_combustivel_Fk) 
VALUES 	('ABC1234', 'Gol', 40.5, 0, 1),
		('XYZ5678', 'Uno', 35.2, 169.56, 2),
        ('DEF9876', 'Civic', 55.8, 215.13, 3);


 


INSERT INTO produto (ID_PRODUTO, NOME_PRODUTO, PRECO_PRODUTO, QUANTIDADE_EM_ESTOQUE) 
VALUES (1 ,'Óleo de Motor', 35.99, 50),
(2 ,'Bateria', 199.99, 20),
(3 ,'Pneu', 299.99, 30);


INSERT INTO funcionario (NOME_FUNC, CARGO_FUNC, USUARIO, SENHA) 
VALUES 
('João Silva', 'Gerente', 'joao_silva', '123456'),
('Maria Souza', 'Gerente', 'maria_souza', '789012'),
('Pedro Santos', 'Atendente', 'pedro_santos', '345678'),
('Ana Oliveira', 'Atendente', 'ana_oliveira', '901234'),
('japa', 'Gerente', 'japa', '102030'),
("Dija" , "Atendente" , "Dijas", "1212");


select * from produto;

 select * from veiculo;

 select * from funcionario;


select usuario, senha from funcionario;

