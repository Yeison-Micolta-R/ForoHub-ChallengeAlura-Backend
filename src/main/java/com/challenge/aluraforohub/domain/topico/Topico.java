package com.challenge.aluraforohub.domain.topico;


import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Optional;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    private Status status;
    private String autor;
    private String curso;

    public Topico(DatosRegistroTopico datos) {
        this.id = null;
        this.titulo = datos.titulo();
        this.mensaje = datos.mensaje();
        this.status = datos.status();
        this.autor = datos.autor();
        this.curso = datos.curso();
    }
    public void actualizarTopico(@Valid DatosActualizacionTopico datos){
        if (datos.titulo()!= null) {
            this.titulo = datos.titulo();
        }
        if (datos.mensaje()!= null) {
            this.mensaje = datos.mensaje();
        }
        if (datos.status()!= null) {
            this.status = datos.status();
        }
        if (datos.autor()!= null) {
            this.autor = datos.autor();
        }
        if (datos.curso()!= null) {
            this.curso = datos.curso();
        }

    }

}
