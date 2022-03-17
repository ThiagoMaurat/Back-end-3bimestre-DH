DROP TABLE IF EXISTS filial;

CREATE TABLE IF NOT EXISTS filial (
    id int auto_increment primary key,
    nome_da_filial varchar(64) NOT NULL,
    rua varchar(128) NOT NULL,
    numero varchar(20) NOT NULL,
    cidade varchar(32) NOT NULL,
    estado varchar(32) NOT NULL,
    e5estrelas BOOLEAN NOT NULL
);
