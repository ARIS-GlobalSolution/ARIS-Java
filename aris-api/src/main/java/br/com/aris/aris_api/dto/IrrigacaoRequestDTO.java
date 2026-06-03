package br.com.aris.aris_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record IrrigacaoRequestDTO(

        @NotBlank
        String status,

        @NotNull
        Long idEstufa

) {
}
