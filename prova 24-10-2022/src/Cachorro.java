public class Cachorro extends Pet{
    private String porte;
    private String corPelo;
    
    public Cachorro() {
    }

    public Cachorro(String nome, String tutor, String porte, String corPelo) {
        super(nome, tutor);
        this.porte = porte;
        this.corPelo = corPelo;
    }

    public Cachorro(String nome, String raca, int idade, String tutor, String porte, String corPelo) {
        super(nome, raca, idade, tutor);
        this.porte = porte;
        this.corPelo = corPelo;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
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
        "Porte: " + this.porte + "\n" + 
        "Cor Pelo: " + this.corPelo;

        return detalhes;
    }

    
}
