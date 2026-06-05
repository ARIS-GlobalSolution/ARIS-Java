package br.com.aris.aris_api.controller;

import br.com.aris.aris_api.dto.UsuarioRequestDTO;
import br.com.aris.aris_api.dto.UsuarioResponseDTO;
import br.com.aris.aris_api.entity.Usuario;
import br.com.aris.aris_api.service.UsuarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    @GetMapping
    public List<Usuario> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public UsuarioResponseDTO salvar(
            @Valid @RequestBody UsuarioRequestDTO dto) {

        return service.salvar(dto);
    }

    @PutMapping("/{id}")
    public Usuario atualizar(
            @PathVariable Long id,
            @Valid @RequestBody Usuario usuario) {

        return service.atualizar(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}