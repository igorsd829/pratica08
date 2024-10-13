public class main {
    public static void main(String[] args) {
   

        gerenciadorDePessoa gerenciador = new gerenciadorDePessoa();
      
        pessoa pessoa1 = new pessoa("Igor", "123.456.789-00", 30);
        
        gerenciador.cadastrarPessoa1(pessoa1);

        // Cadastrando pessoa2
        pessoa pessoa2 = new pessoa("Alex", "111.222.333-44", 25);
        gerenciador.cadastrarPessoa2(pessoa2);

        // Exibe as informações
        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();

        // Atualizando a pessoa1
        pessoa novaPessoa1 = new pessoa("Igor Alexandre", "111.111.111-00", 31);
        gerenciador.atualizarPessoa1(novaPessoa1);

        //informações atualizadas
        System.out.println("\nApós a atualização:");
        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();


    }

}
