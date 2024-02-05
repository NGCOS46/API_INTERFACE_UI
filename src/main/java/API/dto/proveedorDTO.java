package API.dto;
import API.model.proveedor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class proveedorDTO {
    private int idproveedor;
    private String nombreproveedor;
    private String provincia;
    private int telefono;
    private String correo;
    private String personacontacto;

    public proveedorDTO (proveedor proveedor) {
        this.idproveedor=proveedor.getIdproveedor();
        this.nombreproveedor= proveedor.getNombreproveedor();
        this.provincia=proveedor.getProvincia();
        this.telefono= proveedor.getTelefono();
        this.correo= proveedor.getCorreo();
        this.personacontacto= proveedor.getPersonacontacto();
    }

}
