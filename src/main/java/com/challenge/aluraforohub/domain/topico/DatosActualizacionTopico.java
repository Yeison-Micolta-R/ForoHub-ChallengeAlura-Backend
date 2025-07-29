package com.challenge.aluraforohub.domain.topico;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosActualizacionTopico(
        @NotNull Long id,
        String titulo,
        String mensaje,
        LocalDateTime fecha_creacion,
        Status status,
        String autor,
        String curso
) {
}
