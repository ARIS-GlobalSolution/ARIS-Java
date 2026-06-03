package br.com.aris.aris_api.controller;

import br.com.aris.aris_api.entity.Estufa;
import br.com.aris.aris_api.service.EstufaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estufas")
@RequiredArgsConstructor
public class EstufaController {

    private final EstufaService service;

    @GetMapping
    public List<Estufa> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Estufa buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Estufa salvar(@RequestBody Estufa estufa) {
        return service.salvar(estufa);
    }

    @PutMapping("/{id}")
    public Estufa atualizar(
            @PathVariable Long id,
            @RequestBody Estufa estufa) {

        return service.atualizar(id, estufa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}