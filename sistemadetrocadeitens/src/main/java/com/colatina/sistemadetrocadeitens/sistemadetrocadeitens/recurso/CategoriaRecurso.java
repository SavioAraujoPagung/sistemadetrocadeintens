package com.colatina.sistemadetrocadeitens.sistemadetrocadeitens.recurso;

import com.colatina.sistemadetrocadeitens.sistemadetrocadeitens.servico.CategoriaServico;
import com.colatina.sistemadetrocadeitens.sistemadetrocadeitens.servico.dto.CategoriaDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
@RequiredArgsConstructor
public class CategoriaRecurso {
    private final CategoriaServico categoriaServico;

    @GetMapping
    public ResponseEntity<List<CategoriaDto>> listar(){
        List<CategoriaDto> categorias = categoriaServico.listar();
        return new ResponseEntity<>(categorias, HttpStatus.OK);
    }
}
