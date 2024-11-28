package yuriRoliz.receptorMicroservico.Entities;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "carros")
public class Carro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "posicaoID", nullable = false)
    private Long posicaoID;

    @Column(name="categoria")
    private String categoria;
    @Column(name="marca")
    private String marca;
    @Column(name="modelo")
    private String modelo;

    public Long getPosicaoID() {
        return posicaoID;
    }

    public void setPosicaoID(Long posicaoID) {
        this.posicaoID = posicaoID;
    }

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
}
