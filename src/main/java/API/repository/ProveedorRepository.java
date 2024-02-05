package API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import API.model.proveedor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<proveedor,Integer> {

}
