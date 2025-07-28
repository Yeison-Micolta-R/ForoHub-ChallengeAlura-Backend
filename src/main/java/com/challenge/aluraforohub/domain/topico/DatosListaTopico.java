package com.challenge.aluraforohub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosListaTopico(
         String titulo,
         String mensaje,
         String fecha_creacion,
         String status,
         String autor,
         String curso
) {
    public DatosListaTopico(Topico topico) {
        this(
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion().toString(),
                topico.getStatus().toString(),
                topico.getAutor(),
                topico.getCurso()
        );
    }
}
