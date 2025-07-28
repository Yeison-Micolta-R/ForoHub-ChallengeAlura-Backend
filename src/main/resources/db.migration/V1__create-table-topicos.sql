CREATE TABLE IF NOT EXISTS topicos (
    id BIGINT AUTO_INCREMENT,
    titulo VARCHAR(255) NOT NULL,
    mensaje TEXT NOT NULL,
    fecha_creacion TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(50) NOT NULL,
    autor VARCHAR(255) NOT NULL,
    curso VARCHAR(255) NOT NULL,
    UNIQUE KEY uniq_titulo_mensaje (titulo, mensaje)

    PRIMARY KEY (id)
);