public class Pet {
    private String nome;
    private String raca;
    private int idade;
    private String tutor;
    
    public Pet() {
    }

    public Pet(String nome, String tutor) {
        this.nome = nome;
        this.tutor = tutor;
    }

    public Pet(String nome, String raca, int idade, String tutor) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.tutor = tutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String toString(){
        String detalhes = "Nome " + this.idade + "\n" +
        "Raça: " + this.raca + "\n" +
        "Idade: " + this.idade + "\n" + 
        "Tutor: " + this.tutor;
        
        return detalhes;
    }

    public void atualizarIdade(int idade){
        this.idade = idade;
    }
}
