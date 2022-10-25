public class Gato extends Pet{
    private String corPelo;

    public Gato() {
    }

    public Gato(String nome, String raca, int idade, String tutor, String corPelo) {
        super(nome, raca, idade, tutor);
        this.corPelo = corPelo;
    }

    public Gato(String nome, String tutor, String corPelo) {
        super(nome, tutor);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public String toString(){
        String detalhes = "Nome: " + this.getNome() + "\n" +
        "Raça: " + this.getRaca() + "\n" + 
        "Idade: " + this.getIdade() + "\n" + 
        "Tutor: " + this.getTutor() + "\n" + 
        "Cor Pelo: " + this.corPelo;
        
        return detalhes;
    }
}
