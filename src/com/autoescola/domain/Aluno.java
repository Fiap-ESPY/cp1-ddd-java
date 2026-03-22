package com.autoescola.domain;

import java.util.List;
import java.util.Random;

public class Aluno {

    private static final int MIN_AULAS_TEORICAS = 5;
    private static final int MIN_AULAS_PRATICAS = 5;

    private final Long id = Math.abs(new Random().nextLong());

    private String nome;

    private int idade;

    private String tipoVeiculo;

    private int aulasTeoricas = 0;

    private int aulasPraticas = 0;

    private boolean aprovado = false;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        List<String> tiposValidos = List.of("Carro", "Moto");

        if (!tiposValidos.contains(tipoVeiculo)) {
            System.out.println("Tipo de veículo inválido. Os tipos válidos são: " + tiposValidos);
            return;
        }

        this.tipoVeiculo = tipoVeiculo;
    }

    public int getAulasTeoricas() {
        return aulasTeoricas;
    }

    public int getAulasPraticas() {
        return aulasPraticas;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    @Override
    public String toString() {
        String resumo = """
                ================================
                   FICHA DO ALUNO
                ================================
                ID:              %d
                Nome:            %s
                Idade:           %d
                Tipo Veículo:    %s
                -------------------------------
                Aulas Teóricas:  %d
                Aulas Práticas:  %d
                -------------------------------
                Situação:        %s
                ================================
                """;

        return resumo.formatted(
                this.id,
                this.nome,
                this.idade,
                this.tipoVeiculo,
                this.aulasTeoricas,
                this.aulasPraticas,
                this.aprovado ? "APROVADO" : "NAO_APROVADO"
        );
    }

    public void agendarAulaTeorica() {
        this.aulasTeoricas += 1;
    }

    public void agendarAulaPratica() {
        this.aulasPraticas += 1;
    }

    public void cancelarAulaTeorica() {
        if (this.aulasTeoricas == 0) {
            System.out.println("Não é possível cancelar a aula teórica.");
            return;
        }

        this.aulasTeoricas -= 1;
    }

    public void cancelarAulaPratica() {
        if (this.aulasPraticas == 0) {
            System.out.println("Não é possível cancelar a aula prática.");
            return;
        }

        this.aulasPraticas -= 1;
    }

    public void realizarExame() {
        boolean podeRealizarExame = this.possuiAulasTeoricasParaExame() && this.possuiAulasPraticasParaExame();

        if (!podeRealizarExame) {
            System.out.println("Não pode realizar o exame no momento, deve cumprir o número mínimo de aulas.");
            return;
        }

        System.out.println("Pode realizar o exame.");

        this.aprovado = this.gerarResultadoExame();

        if (!this.aprovado) {
            System.out.println("Você não foi aprovado.");
            return;
        }

        System.out.println("Você foi aprovado!");
    }

    private boolean possuiAulasTeoricasParaExame() {
        return this.aulasTeoricas >= MIN_AULAS_TEORICAS;
    }

    private boolean possuiAulasPraticasParaExame() {
        return this.aulasPraticas >= MIN_AULAS_PRATICAS;
    }

    private boolean gerarResultadoExame() {
        System.out.println("Gerando resultado do exame...");

        Random random = new Random();

        return random.nextBoolean();
    }

}
