package gwcl.com.ms_producto.repository;

import gwcl.com.ms_producto.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository <Producto, Integer> {
}
