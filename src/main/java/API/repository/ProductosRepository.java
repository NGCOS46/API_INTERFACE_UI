package API.repository;
import API.model.productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository  extends JpaRepository<productos,Integer> {
}
