package br.com.aris.aris_api.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Localizacao {

    private String cidade;
    private String estado;
    private String pais;
}
