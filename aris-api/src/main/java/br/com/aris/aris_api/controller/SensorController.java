package br.com.aris.aris_api.controller;

import br.com.aris.aris_api.entity.Sensores;
import br.com.aris.aris_api.entity.Sensores;
import br.com.aris.aris_api.service.SensorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sensores")
@RequiredArgsConstructor
public class SensorController {

    private final SensorService service;

    @GetMapping
    public List<Sensores> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Sensores buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Sensores salvar(@RequestBody Sensores sensor) {
        return service.salvar(sensor);
    }

    @PutMapping("/{id}")
    public Sensores atualizar(
            @PathVariable Long id,
            @RequestBody Sensores sensor) {

        return service.atualizar(id, sensor);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
