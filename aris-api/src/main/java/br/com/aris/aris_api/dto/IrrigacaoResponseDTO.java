package br.com.aris.aris_api.dto;

public record IrrigacaoResponseDTO(

        Long idIrrigacao,
        String status,
        Long idEstufa

) {
}
