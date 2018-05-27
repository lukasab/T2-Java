
abstract class Vegetal {
    
    private String codigo;
    private int diasExpirar;
    private boolean organico;
    private float pesoMedio;
    private boolean possuiEmbalagem;

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @param diasExpirar the diasExpirar to set
     */
    public void setDiasExpirar(int diasExpirar) {
        this.diasExpirar = diasExpirar;
    }

    /**
     * @param organico the organico to set
     */
    public void setOrganico(boolean organico) {
        this.organico = organico;
    }

    /**
     * @param pesoMedio the pesoMedio to set
     */
    public void setPesoMedio(float pesoMedio) {
        this.pesoMedio = pesoMedio;
    }

    /**
     * @param possuiEmbalagem the possuiEmbalagem to set
     */
    public void setPossuiEmbalagem(boolean possuiEmbalagem) {
        this.possuiEmbalagem = possuiEmbalagem;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return the diasExpirar
     */
    public int getDiasExpirar() {
        return diasExpirar;
    }

    /**
     * @return the organico
     */
    public boolean isOrganico() {
        return organico;
    }

    /**
     * @return the pesoMedio
     */
    public float getPesoMedio() {
        return pesoMedio;
    }

    /**
     * @return the possuiEmbalagem
     */
    public boolean isPossuiEmbalagem() {
        return possuiEmbalagem;
    }

}

/**
 * T2
 */
public class T2 {

    public static void main(String[] args) {
        System.out.println("Aqui que o programa começa");

    }
}