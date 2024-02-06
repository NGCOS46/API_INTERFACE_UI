package API.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import API.dto.productosDTO;
import API.model.productos;
import API.service.productoService;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("api/ui/productos")
public class productosController {
    @Autowired
    private productoService productoService;

    @PostMapping
    public ResponseEntity<productosDTO> save(@RequestBody productosDTO productosDTO){
        return new ResponseEntity<>(productoService.save(productosDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<productosDTO>> findAll(){
        return new ResponseEntity<>(productoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{idproducto}")
    public ResponseEntity<productosDTO> findById(@PathVariable int idproducto){
        return new ResponseEntity<>(productoService.findById(idproducto), HttpStatus.OK);

    }
}
