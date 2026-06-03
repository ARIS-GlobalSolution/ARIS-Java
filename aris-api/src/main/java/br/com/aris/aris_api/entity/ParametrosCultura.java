package br.com.aris.aris_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PARAMETROS_CULTURA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParametrosCultura {

    @Id
    @Column(name = "id_parametro")
    private Long idParametro;

    private Double tempMin;
    private Double tempMax;
    private Double umidadeMin;
    private Double umidadeMax;

    @OneToOne
    @JoinColumn(name = "id_cultura")
    private Culturas cultura;
}
