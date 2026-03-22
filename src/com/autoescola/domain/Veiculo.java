package com.autoescola.domain;

import java.util.List;
import java.util.Random;

public class Veiculo {

    private final Long id = Math.abs(new Random().nextLong());

    private String tipo;

    private String placa;

    private String modelo;

    public Long getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        List<String> tiposValidos = List.of("Carro", "Moto");

        if (!tiposValidos.contains(tipo)) {
            System.out.println("Tipo inválido. Os tipos válidos são: " + tiposValidos);
            return;
        }

        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
