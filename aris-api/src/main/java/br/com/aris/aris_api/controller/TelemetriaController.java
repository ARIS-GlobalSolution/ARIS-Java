package br.com.aris.aris_api.controller;

import br.com.aris.aris_api.entity.Telemetria;
import br.com.aris.aris_api.service.TelemetriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/telemetrias")
@RequiredArgsConstructor
public class TelemetriaController {

    private final TelemetriaService service;

    @GetMapping
    public List<Telemetria> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Telemetria buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Telemetria salvar(@RequestBody Telemetria telemetria) {
        return service.salvar(telemetria);
    }

    @PutMapping("/{id}")
    public Telemetria atualizar(
            @PathVariable Long id,
            @RequestBody Telemetria telemetria) {

        return service.atualizar(id, telemetria);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
