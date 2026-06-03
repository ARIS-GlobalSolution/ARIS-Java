package br.com.aris.aris_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ESTUFAS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Estufa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estufa")
    private Long idEstufa;

    private String nome;

    private String localizacao;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
}
