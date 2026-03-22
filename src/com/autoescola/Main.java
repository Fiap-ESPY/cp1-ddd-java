package com.autoescola;

import com.autoescola.domain.Aluno;
import com.autoescola.domain.AutoEscola;
import com.autoescola.domain.Instrutor;
import com.autoescola.domain.Veiculo;

public class Main {

    public static void main(String[] args) {
        //region Veículo

        Veiculo veiculo1 = new Veiculo();
        veiculo1.setTipo("Carro");
        veiculo1.setPlaca("ABC-1234");
        veiculo1.setModelo("Sedan");

        // Só é possível definir o tipo do veículo como "Carro" ou "Moto".
        // Ao tentar definir como outro, uma mensagem é exibida e o tipo não é alterado.
        veiculo1.setTipo("Jet-ski");
        System.out.println(veiculo1.getTipo());

        //endregion

        System.out.println();

        //region Instrutor

        Instrutor instrutor1 = new Instrutor();
        instrutor1.setNome("Damiana Costa");
        instrutor1.setCategoria("Carro");
        instrutor1.setExperiencia(15);

        // Só é possível definir o tipo do veículo como "Carro" ou "Moto".
        // Ao tentar definir como outro, uma mensagem é exibida e o tipo não é alterado.
        veiculo1.setTipo("Jet-ski");
        System.out.println(instrutor1.getCategoria());

        System.out.println();

        // Só é possível definir a experiência do instrutor como um número entre 0 e 100.
        // Ao tentar definir um valor fora desse intervalo, uma mensagem é exibida e a experiência não é alterada.
        instrutor1.setExperiencia(150);
        instrutor1.setExperiencia(-10);
        System.out.println(instrutor1.getExperiencia());

        //endregion

        System.out.println();

        //region Aluno

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Harry Potter");
        aluno1.setIdade(17);
        aluno1.setTipoVeiculo("Carro");

        // Só é possível definir o tipo do veículo como "Carro" ou "Moto".
        // Ao tentar definir como outro, uma mensagem é exibida e o tipo não é alterado.
        aluno1.setTipoVeiculo("Jet-ski");
        System.out.println(aluno1.getTipoVeiculo());

        System.out.println();

        // Os atributos de número de aulas só podem ser alterados com os métodos agendaAula e cancelarAula
        aluno1.agendarAulaPratica();
        System.out.println("Total de aulas práticas: " + aluno1.getAulasPraticas());

        aluno1.cancelarAulaPratica();
        System.out.println("Total de aulas práticas: " + aluno1.getAulasPraticas());

        // Ao tentar cancelar uma aula quando o valor é 0, uma mensagem é exibida e o valor não é alterado
        aluno1.cancelarAulaPratica();

        System.out.println();
        // Ao tentar realizar o exame sem ter cumprido o número mínimo de aulas, uma mensagem
        // é exibida indicando que o exame não pode ser realizado

        aluno1.realizarExame();

        aluno1.agendarAulaPratica();
        aluno1.agendarAulaPratica();
        aluno1.agendarAulaPratica();
        aluno1.agendarAulaPratica();
        aluno1.agendarAulaPratica();

        aluno1.agendarAulaTeorica();
        aluno1.agendarAulaTeorica();
        aluno1.agendarAulaTeorica();
        aluno1.agendarAulaTeorica();
        aluno1.agendarAulaTeorica();

        System.out.println();

        // Com o número mínimo de aulas cumprido,
        // o aluno pode realizar o exame e obter um resultado de aprovação ou reprovação
        aluno1.realizarExame();

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Hermione Granger");
        aluno2.setIdade(18);
        aluno2.setTipoVeiculo("Moto");

        aluno2.agendarAulaPratica();
        aluno2.agendarAulaPratica();
        aluno2.agendarAulaPratica();
        aluno2.agendarAulaPratica();

        aluno2.agendarAulaTeorica();
        aluno2.agendarAulaTeorica();
        aluno2.agendarAulaTeorica();

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Ron Weasley");
        aluno3.setIdade(19);
        aluno3.setTipoVeiculo("Carro");

        aluno3.agendarAulaPratica();
        aluno3.agendarAulaPratica();

        aluno3.agendarAulaTeorica();
        aluno3.agendarAulaTeorica();

        Aluno aluno4 = new Aluno();
        aluno4.setNome("Tom Riddle");
        aluno4.setIdade(71);
        aluno4.setTipoVeiculo("Carro");

        aluno4.agendarAulaPratica();

        //endregion

        System.out.println();

        //region AutoEscola

        AutoEscola autoEscola = new AutoEscola();
        autoEscola.setAluno1(aluno1);
        autoEscola.setAluno2(aluno2);
        autoEscola.setAluno3(aluno3);
        autoEscola.setAluno4(aluno4);

        autoEscola.exibirResumo();

        // Caso um aluno não esteja cadastrado, é exibido uma mensagem
        autoEscola.setAluno1(null);
        autoEscola.exibirResumo();

        //endregion
    }

}
