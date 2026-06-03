package br.com.aris.aris_api.dto;

public record EstufaResponseDTO(

        Long idEstufa,
        String nome,
        String localizacao,
        Long idUsuario

) {
}
