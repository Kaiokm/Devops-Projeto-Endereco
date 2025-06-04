package com.kaiokm.kaiokmdevops.infrastructure.entity;

import jdk.jfr.StackTrace;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "usuario_entity")
public class UsuarioEntity {
    @Id
    private String id;
    private String nome;
    private String email;
    private String documento;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataAtualizacao;
}
