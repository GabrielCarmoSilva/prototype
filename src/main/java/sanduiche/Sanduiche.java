package sanduiche;

public class Sanduiche implements Cloneable {
    private String pao;
    private String carnes;
    private String queijo;
    private boolean bacon;
    private boolean salada;

    public Sanduiche(String pao, String carnes, String queijo, boolean bacon, boolean salada) {
        this.pao = pao;
        this.carnes = carnes;
        this.queijo = queijo;
        this.bacon = bacon;
        this.salada = salada;
    }

    public String getPao() {
        return pao;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

    public String getCarnes() {
        return carnes;
    }

    public void setCarnes(String carnes) {
        this.carnes = carnes;
    }

    public String getQueijo() {
        return queijo;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean isSalada() {
        return salada;
    }

    public void setSalada(boolean salada) {
        this.salada = salada;
    }

    @Override
    public Sanduiche clone() throws CloneNotSupportedException {
        Sanduiche sanduicheClone = (Sanduiche) super.clone();
        return sanduicheClone;
    }

    @Override
    public String toString() {
        return "Sanduiche{" +
                "pao='" + pao + '\'' +
                ", carnes='" + carnes + '\'' +
                ", queijo='" + queijo + '\'' +
                ", bacon=" + bacon +
                ", salada=" + salada +
                '}';
    }
}
