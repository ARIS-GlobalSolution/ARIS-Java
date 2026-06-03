package br.com.aris.aris_api.dto;

import jakarta.validation.constraints.NotBlank;

public record TipoSensorRequestDTO(

        @NotBlank
        String nome,

        @NotBlank
        String unidade

) {
}
