package com.autoescola.domain;

public class AutoEscola {

    public Aluno aluno1 = new Aluno();
    public Aluno aluno2 = new Aluno();
    public Aluno aluno3 = new Aluno();
    public Aluno aluno4 = new Aluno();

    public String exibirResumo() {
        return """
                ================================
                       RESUMO DA AUTOESCOLA
                ================================

                Aluno 1:
                Nome: %s
                Total de aulas: %d
                Situação: %s
                
                --------------------------------
                
                Aluno 2:
                Nome: %s
                Total de aulas: %d
                Situação: %s
                
                --------------------------------

                Aluno 3:
                Nome: %s
                Total de aulas: %d
                Situação: %s
                
                --------------------------------

                Aluno 4:
                Nome: %s
                Total de aulas: %d
                Situação: %s
                
                ================================
                """.formatted(
                        aluno1.nome, aluno1.aulasTeoricas + aluno1.aulasPraticas, aluno1.aprovado ? "APROVADO" : "REPROVADO",
                aluno2.nome, aluno2.aulasTeoricas + aluno2.aulasPraticas, aluno2.aprovado ? "APROVADO" : "REPROVADO",
                aluno3.nome, aluno3.aulasTeoricas + aluno3.aulasPraticas, aluno3.aprovado ? "APROVADO" : "REPROVADO",
                aluno4.nome, aluno4.aulasTeoricas + aluno4.aulasPraticas, aluno4.aprovado ? "APROVADO" : "REPROVADO"
        );
    }
}
