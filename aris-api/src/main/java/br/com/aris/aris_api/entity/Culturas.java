package br.com.aris.aris_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "CULTURAS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Culturas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cultura")
    private Long idCultura;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_estufa")
    private Estufa estufa;
}
