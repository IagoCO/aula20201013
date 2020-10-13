package Iago_Costa_Oliveira.aula20201013;

public class Email {

    String valor;

    Email(String valor) {
        if(!(valor.contains("@")) || !(valor.contains(".")) || valor.length() < 5) {
            throw new RunTimeException("E-mail inválido");

        }
        else {

            this.valor = valor;
        }
       
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }


    
}
