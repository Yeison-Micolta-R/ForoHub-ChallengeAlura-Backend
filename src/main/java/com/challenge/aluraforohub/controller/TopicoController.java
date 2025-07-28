package com.challenge.aluraforohub.controller;


import com.challenge.aluraforohub.domain.topico.DatosListaTopico;
import com.challenge.aluraforohub.domain.topico.DatosRegistroTopico;
import com.challenge.aluraforohub.domain.topico.Topico;
import com.challenge.aluraforohub.domain.topico.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    @Transactional
    @PostMapping
    public void registrar (@RequestBody @Valid DatosRegistroTopico datos){
        repository.save(new Topico(datos));
    }

    @GetMapping
    public Page<DatosListaTopico>listar(@PageableDefault(size=10) Pageable paginacion){
        return repository.findAll(paginacion).map(DatosListaTopico::new);
    }

}
