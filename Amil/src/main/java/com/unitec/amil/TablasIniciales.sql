/*CREATE TABLE Usuario (
    ID_USUARIO INTEGER PRIMARY KEY AUTO_INCREMENT,
    NOMBRE VARCHAR(120),
    EMAIL VARCHAR(120),
    LOGIN VARCHAR(90),
    PASSWORD VARCHAR(90)
    );*/

SELECT * FROM Administracion;
SELECT * FROM Usuario;

/*CREATE TABLE Administracion (
    ID_SESSION INTEGER PRIMARY KEY AUTO_INCREMENT,
    ID_USUARIO INTEGER,
    FECHA DATE,
    IP VARCHAR(120),
    FOREIGN KEY (ID_USUARIO) REFERENCES Usuario (ID_USUARIO)
    );*/