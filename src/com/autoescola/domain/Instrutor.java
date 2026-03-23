package com.autoescola.domain;

import java.util.List;
import java.util.Random;

public class Instrutor {

    private final Long id = Math.abs(new Random().nextLong());

    private String nome;

    private int experiencia;

    private String categoria;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        if (experiencia < 0 || experiencia > 100) {
            System.out.println("Experiência inválida. A experiência deve ser um número entre 0 e 100.");
            return;
        }

        this.experiencia = experiencia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        List<String> categoriasValidas = List.of("Carro", "Moto");

        if (!categoriasValidas.contains(categoria)) {
            System.out.println("Categoria inválida. As categorias válidas são: " + categoriasValidas);
            return;
        }

        this.categoria = categoria;
    }

}
