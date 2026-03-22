package com.autoescola.domain;

public class AutoEscola {

    private Aluno aluno1;

    private Aluno aluno2;

    private Aluno aluno3;

    private Aluno aluno4;

    public Aluno getAluno1() {
        return aluno1;
    }

    public void setAluno1(Aluno aluno1) {
        this.aluno1 = aluno1;
    }

    public Aluno getAluno2() {
        return aluno2;
    }

    public void setAluno2(Aluno aluno2) {
        this.aluno2 = aluno2;
    }

    public Aluno getAluno3() {
        return aluno3;
    }

    public void setAluno3(Aluno aluno3) {
        this.aluno3 = aluno3;
    }

    public Aluno getAluno4() {
        return aluno4;
    }

    public void setAluno4(Aluno aluno4) {
        this.aluno4 = aluno4;
    }

    public void exibirResumo() {
        String resumo = """
                ================================
                       RESUMO DA AUTOESCOLA
                ================================
                
                %s
                %s
                %s
                %s
                
                ================================
                """.formatted(
                exibirAlunoResumo(aluno1, 1),
                exibirAlunoResumo(aluno2, 2),
                exibirAlunoResumo(aluno3, 3),
                exibirAlunoResumo(aluno4, 4)
        );

        System.out.println(resumo);
    }

    public String exibirAlunoResumo(Aluno aluno, int numeroAluno) {
        if (aluno == null) {
            return """
                    Aluno %s não cadastrado.
                   
                    --------------------------------
                    """.formatted(numeroAluno);
        }

        int totalAulas = aluno.getAulasTeoricas() + aluno.getAulasPraticas();

        return """
                Aluno: %s
                Nome: %s
                Total de aulas: %d
                Situação: %s
                
                --------------------------------
                """.formatted(
                numeroAluno,
                aluno.getNome(),
                totalAulas,
                aluno.isAprovado() ? "APROVADO" : "NÃO APROVADO"
        );
    }
}
