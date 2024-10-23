 create schema prueba;

set  schema 'prueba';


CREATE TABLE usuario (
    id SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

create table fuente (
	id SERIAL primary key,
	name VARCHAR(255) not null,
	page VARCHAR(255) not null,
	created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


create table categoria (
	id SERIAL primary key,
	name VARCHAR(255) not null
);


CREATE TABLE noticia (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    image_url VARCHAR(255),
    author VARCHAR(100) NOT NULL,
    fuente_id INT,
    categoria_id INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (fuente_id) REFERENCES fuente(id),
    FOREIGN KEY (categoria_id) REFERENCES categoria(id)
);


create table user_noticia (
	id SERIAL primary key,
	user_id INT,
	noticia_id INT,
	FOREIGN KEY (user_id) REFERENCES usuario(id),
    FOREIGN KEY (noticia_id) REFERENCES noticia(id)
);
