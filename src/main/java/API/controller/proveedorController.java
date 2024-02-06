package API.controller;
import API.dto.proveedorDTO;
import API.service.proveedorService;
import API.model.proveedor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
@RestController
@RequestMapping("api/ui/productos")
public class proveedorController {

    @Autowired
    private proveedorService proveedorService;

    @PostMapping
    public ResponseEntity<proveedorDTO> save(@RequestBody proveedorDTO proveedorDTO) {
        proveedorDTO savedProveedorDTO = proveedorService.save(proveedorDTO);
        return new ResponseEntity<>(savedProveedorDTO, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<proveedorDTO>> findAll() {
        List<proveedorDTO> proveedoresDTO = proveedorService.findAll();
        return new ResponseEntity<>(proveedoresDTO, HttpStatus.OK);
    }

    @GetMapping("/{idProveedor}")
    public ResponseEntity<proveedorDTO> findById(@PathVariable int idProveedor) {
        proveedorDTO proveedorDTO = proveedorService.findById(idProveedor);
        if (proveedorDTO != null) {
            return new ResponseEntity<>(proveedorDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{idProveedor}")
    public ResponseEntity<Void> deleteById(@PathVariable int idProveedor) {
        try {
            proveedorService.deleteById(idProveedor);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}