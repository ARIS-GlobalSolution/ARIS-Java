package br.com.aris.aris_api.dto;

import jakarta.validation.constraints.NotNull;

public record TelemetriaRequestDTO(

        @NotNull
        Double valor,

        @NotNull
        Long idSensor

) {
}
