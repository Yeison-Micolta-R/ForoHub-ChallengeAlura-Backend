package com.challenge.aluraforohub.domain.topico;

public record DatosDetalleTopico(
        Long id,
        String titulo,
        String mensaje,
        String fecha_creacion,
        Status status,
        String autor,
        String curso
) {
    public DatosDetalleTopico(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion().toString(),
                topico.getStatus(),
                topico.getAutor(),
                topico.getCurso()
        );
    }
}
