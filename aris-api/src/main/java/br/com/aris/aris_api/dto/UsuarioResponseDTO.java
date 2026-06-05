package br.com.aris.aris_api.dto;

import java.time.LocalDate;

public record UsuarioResponseDTO(
        Long idUsuario,
        String nome,
        String email,
        LocalDate dataCadastro
) {
}
