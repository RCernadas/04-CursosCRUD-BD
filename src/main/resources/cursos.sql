DROP DATABASE IF EXISTS cursos;
CREATE DATABASE cursos;
USE cursos;


CREATE TABLE curso(
cod_curso INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(20),
duracion VARCHAR (25),
precio DOUBLE
);

-- Insertar datos en la tabla curso
INSERT INTO curso (nombre, duracion, precio) VALUES
('Fotografía', 106, 100.5),
('Pintura', 90, 200.0),
('Cocina',15, 50.0),
('Carpintería', 120, 400.0),
('Programación', 108, 100.0),
('Guitarra', 50, 30),
('Yoga', 25, 150);