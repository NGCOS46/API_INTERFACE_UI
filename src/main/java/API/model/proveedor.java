package API.model;

import jakarta.persistence.*;
import API.dto.proveedorDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(name="proveedor")
public class proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "idproveedor")
    private int idproveedor;

    @Column(name="nombreproveedor")
    private String nombreproveedor;

    @Column(name="razonsocial")
    private String razonsocial;

    @Column(name="provincia")
    private String provincia;

    @Column(name="telefono")
    private Integer telefono;

    @Column(name="correo")
    private String correo;

    @Column(name="personacontacto")
    private String personacontacto;


    public proveedor(int idproveedor, String nombreproveedor, String razonsocial, String provincia,int telefono, String correo, String personacontacto){
        this.idproveedor=idproveedor;
        this.nombreproveedor=nombreproveedor;
        this.razonsocial=razonsocial;
        this.provincia=provincia;
        this.telefono=telefono;
        this.correo=correo;
    }

    public proveedor( proveedorDTO proveedorDTO){
            this.idproveedor= proveedorDTO.getIdproveedor();
            this.nombreproveedor=proveedorDTO.getNombreproveedor();
            this.provincia= proveedorDTO.getProvincia();
            this.telefono= proveedorDTO.getTelefono();
            this.correo=proveedorDTO.getCorreo();
            this.personacontacto=getPersonacontacto();
    }

}
