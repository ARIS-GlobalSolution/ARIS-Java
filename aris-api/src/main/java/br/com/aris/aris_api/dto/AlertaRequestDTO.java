package br.com.aris.aris_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AlertaRequestDTO(

        @NotBlank
        String mensagem,

        @NotBlank
        String nivelRisco,

        @NotNull
        Long idEstufa

) {
}
