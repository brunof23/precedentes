Create table IF NOT EXISTS assuntos (
    id serial PRIMARY KEY,
    assunto VARCHAR (150),
    tema VARCHAR (50),
    situacaoTema VARCHAR (150)
);