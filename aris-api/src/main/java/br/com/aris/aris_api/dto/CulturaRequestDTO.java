package br.com.aris.aris_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CulturaRequestDTO(

        @NotBlank
        String nome,

        @NotNull
        Long idEstufa

) {
}
