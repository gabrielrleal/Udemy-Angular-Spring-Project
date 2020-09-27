package io.github.gabrielrleal.clientes.model.repository;

import io.github.gabrielrleal.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

}
