package API.service;
import API.model.*;
import API.dto.*;
import java.util.ArrayList;
import java.util.List;
import API.service.Fabricaproveedor;
import API.repository.ProveedorRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.stream.Collectors;
@Service
public class proveedorService {
    @Autowired
    private Fabricaproveedor fabricaProveedorService;

    @Autowired
    private ProveedorRepository proveedorRepository;

    public proveedorDTO save(proveedorDTO proveedorDTO) {
        proveedor proveedor = fabricaProveedorService.crearProveedor(proveedorDTO);
        proveedor = proveedorRepository.save(proveedor);
        return fabricaProveedorService.crearProveedorDTO(proveedor);
    }

    public List<proveedorDTO> findAll() {
        List<proveedor> proveedores = proveedorRepository.findAll();
        return proveedores.stream()
                .map(fabricaProveedorService::crearProveedorDTO)
                .collect(Collectors.toList());
    }

    public proveedorDTO findById(int id) {
        return proveedorRepository.findById(id)
                .map(fabricaProveedorService::crearProveedorDTO)
                .orElse(null);
    }

    public void deleteById(int id) {
        proveedorRepository.deleteById(id);
    }
}
