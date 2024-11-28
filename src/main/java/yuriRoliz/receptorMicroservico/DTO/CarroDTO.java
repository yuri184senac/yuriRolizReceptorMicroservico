package yuriRoliz.receptorMicroservico.DTO;

import java.io.Serializable;
import java.time.LocalDateTime;

public class CarroDTO implements Serializable {

    private  Long id;
    private String categoria;
    private String marca;
    private String modelo;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CarroDTO() {

    }

    public CarroDTO(String categoria, String marca, String modelo) {
        this.categoria = categoria;
        this.marca = marca;
        this.modelo = modelo;
    }


}

