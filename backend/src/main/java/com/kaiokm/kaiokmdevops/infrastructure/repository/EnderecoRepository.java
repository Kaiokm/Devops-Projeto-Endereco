package com.kaiokm.kaiokmdevops.infrastructure.repository;

import com.kaiokm.kaiokmdevops.infrastructure.entity.EnderecoEntity;
import com.kaiokm.kaiokmdevops.infrastructure.entity.UsuarioEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

public interface EnderecoRepository extends MongoRepository<EnderecoEntity, String> {

    EnderecoEntity findByUsuarioId(String usuarioId);

    @Transactional
    void deleteByUsuarioId(String usuarioId);
}
