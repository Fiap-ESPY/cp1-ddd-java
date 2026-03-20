package com.autoescola.domain;

import java.util.Random;

public class Aluno {

    static final int MIN_AULAS_TEORICAS = 5;
    static final int MIN_AULAS_PRATICAS = 5;

    public Long id;

    public String nome;

    public int idade;

    public String tipoVeiculo;

    public int aulasTeoricas = 0;

    public int aulasPraticas = 0;

    public boolean aprovado = false;

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
                id,
                nome,
                idade,
                tipoVeiculo,
                aulasTeoricas,
                aulasPraticas,
                aprovado ? "APROVADO" : "NAO_APROVADO"
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
