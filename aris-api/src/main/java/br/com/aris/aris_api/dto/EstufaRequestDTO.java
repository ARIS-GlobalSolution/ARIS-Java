package br.com.aris.aris_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EstufaRequestDTO(

        @NotBlank
        String nome,

        String localizacao,

        @NotNull
        Long idUsuario

) {
}
