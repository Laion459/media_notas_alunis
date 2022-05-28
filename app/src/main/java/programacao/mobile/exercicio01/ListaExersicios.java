package programacao.mobile.exercicio01;

import java.util.Objects;

public class ListaExersicios {
    private String nameList;

    public ListaExersicios(String nameList) {
        this.nameList = nameList;
    }

    public String getNameList() {
        return nameList;
    }

    public void setNameList(String nameList) {
        this.nameList = nameList;
    }

    @Override
    public String toString() {
        return "ListaExersicios{" +
                "nameList='" + nameList + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListaExersicios that = (ListaExersicios) o;
        return Objects.equals(nameList, that.nameList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameList);
    }

    // Métodos Públlicos

    // Exercicio 01
    // Lee quantidade aulas e faltas e calcula o porcetntual de faltas
    public int porcentagemFaltas(int aulas, int faltas){
        int porcentagem = (faltas*100)/aulas;
        System.out.println("Total porcentagem de faltas: " + porcentagem);
        if (porcentagem < 70){
            System.out.println("Aluno Reprovado!");
        }
        return porcentagem;
    }

}
