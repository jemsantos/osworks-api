/* ATENÇÃO: este script não pode ser alterado depois de executado.... uma nova versão deve ser criada */
create table cliente (
    id bigint not null auto_increment,
    nome varchar(60) not null,
    email varchar(255) not null,
    fone varchar(20) not null,
    
    primary key (id)
);