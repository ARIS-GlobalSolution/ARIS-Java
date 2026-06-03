package br.com.aris.aris_api.dto;

import jakarta.validation.constraints.NotNull;

public record ParametroCulturaRequestDTO(

        @NotNull
        Long idCultura,

        Double tempMin,
        Double tempMax,
        Double umidadeMin,
        Double umidadeMax

) {
}
