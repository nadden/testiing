CREATE TABLE KundeFilm
(
    id INTEGER AUTO_INCREMENT NOT NULL,
    antall INTEGER NOT NULL,
    filmValg VARCHAR(255) NOT NULL,
    fornavn VARCHAR (255) NOT NULL,
    etternavn VARCHAR (255) NOT NULL,
    telefonnr VARCHAR (255) NOT NULL,
    epost VARCHAR (255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE Film
(
    id INTEGER AUTO_INCREMENT NOT NULL,
    filmValg VARCHAR (255) NOT NULL,
    PRIMARY KEY (id)
);