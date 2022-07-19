package one.innovation.com;

/**Crie as classes "Funcionarios", "Gerente", "Vendedor" e "Faxineiro". Realize uscasts e downcasts.*/



public class RodarAplicacao {
    public static void main (String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente= new Funcionario;

        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
}
