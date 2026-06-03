package br.com.aris.aris_api.dto;

public record AlertaResponseDTO(

        Long idAlerta,
        String mensagem,
        String nivelRisco,
        Long idEstufa

) {
}
