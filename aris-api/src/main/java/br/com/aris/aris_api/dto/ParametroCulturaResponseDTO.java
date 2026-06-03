package br.com.aris.aris_api.dto;

public record ParametroCulturaResponseDTO(

        Long idParametro,
        Long idCultura,
        Double tempMin,
        Double tempMax,
        Double umidadeMin,
        Double umidadeMax

) {
}
