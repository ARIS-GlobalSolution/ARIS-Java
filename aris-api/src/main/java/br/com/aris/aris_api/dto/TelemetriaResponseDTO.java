package br.com.aris.aris_api.dto;

import java.time.LocalDateTime;

public record TelemetriaResponseDTO(

        Long idTelemetria,
        Double valor,
        LocalDateTime dataHora,
        Long idSensor

) {
}
