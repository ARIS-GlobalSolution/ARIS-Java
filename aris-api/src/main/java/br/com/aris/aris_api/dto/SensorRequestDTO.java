package br.com.aris.aris_api.dto;

import jakarta.validation.constraints.NotNull;

public record SensorRequestDTO(

        @NotNull
        Long idTipo,

        @NotNull
        Long idEstufa

) {
}
