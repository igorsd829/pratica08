public class gerenciadorDePessoa {
    private pessoa pessoa1;
    private pessoa pessoa2;


    public pessoa getPessoa1() {
        return pessoa1;
    }
    public pessoa getPessoa2() {
        return pessoa2;
    }


    public void cadastrarPessoa1( pessoa pessoa){
        if(this.pessoa1 == null){
            this.pessoa1 = pessoa;
            System.out.println("Pessoa 1 cadastrada com sucesso.");
        }else{
            System.out.println("Pessoa 1 já foi cadastrada.");
        }

    }

    public void cadastrarPessoa2( pessoa pessoa){
        if(this.pessoa2 == null){
            this.pessoa2 = pessoa;
            System.out.println("Pessoa 2 cadastrada com sucesso.");
        }else{
            System.out.println("Pessoa 2 já foi cadastrada.");
        }

    }


    public void atualizarPessoa1(pessoa pessoa ){
    if(this.pessoa1 != null){
        this.pessoa1=pessoa;
        System.out.println("Dados da Pessoa 1 atualizados com sucesso.");
        }else{
            System.out.println("Pessoa 1 ainda não foi cadastrada."); 
        }
    }

    public void atualizarPessoa2(pessoa pessoa ){
        if(this.pessoa2 != null){
            this.pessoa2=pessoa;
            System.out.println("Dados da Pessoa 1 atualizados com sucesso.");
            }else{
                System.out.println("Pessoa 1 ainda não foi cadastrada."); 
            }
        }



        public void exibirPessoa1(){
            if(this.pessoa1 != null){
                System.out.println("Dados da Pessoa 1:"); 
                System.out.println(pessoa1.getNome()); 
                System.out.println(pessoa1.getCpf()); 
                System.out.println(pessoa1.getIdade()); 

            }


        }


         public void exibirPessoa2(){
            if(this.pessoa2 != null){
                System.out.println("Dados da Pessoa 2:"); 
                System.out.println(pessoa2.getNome()); 
                System.out.println(pessoa2.getCpf()); 
                System.out.println(pessoa2.getIdade()); 

            }


        }


    
}
