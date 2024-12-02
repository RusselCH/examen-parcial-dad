package rrcc.com.ms_categoria_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rrcc.com.ms_categoria_server.entity.Categoria;

public interface CategoriaRepository  extends JpaRepository<Categoria, Integer> {
}
