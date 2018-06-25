import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;

abstract class Vegetal {

    private String codigo;
    private int duracaoDias;
    private String nome;
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
     * @param duracaoDias the duracaoDias to set
     */
    public void setDuracaoDias(int duracaoDias) {
        this.duracaoDias = duracaoDias;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
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
     * @return the duracaoDias
     */
    public int getDuracaoDias() {
        return duracaoDias;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
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

    Vegetal(String codigo, int duracaoDias, String nome, boolean organico, float pesoMedio, boolean possuiEmbalagem) {
        this.codigo = codigo;
        this.duracaoDias = duracaoDias;
        this.nome = nome;
        this.organico = organico;
        this.pesoMedio = pesoMedio;
        this.possuiEmbalagem = possuiEmbalagem;
    }

    @Override
    public String toString() {
        return "Codigo: " + this.codigo + ", Duração média em dias: " + this.duracaoDias
        + ", Nome: " + this.nome + ", Organico: " + this.organico + ", Peso médio: " + this.pesoMedio
        + ", Possui embalagem: " + this.possuiEmbalagem;
    }
}

/**
 * Fruta extends Vegetal
 */
class Fruta extends Vegetal {
    Fruta(String codigo, int duracaoDias, String nome, boolean organico, float pesoMedio, boolean possuiEmbalagem) {
        super(codigo, duracaoDias, nome, organico, pesoMedio, possuiEmbalagem);
    }
}

/**
 * Fruta extends Vegetal
 */
class Legume extends Vegetal {
    Legume(String codigo, int duracaoDias, String nome, boolean organico, float pesoMedio, boolean possuiEmbalagem) {
        super(codigo, duracaoDias, nome, organico, pesoMedio, possuiEmbalagem);
    }
}

/**
 * Fruta extends Vegetal
 */
class Verdura extends Vegetal {
    Verdura(String codigo, int duracaoDias, String nome, boolean organico, float pesoMedio, boolean possuiEmbalagem) {
        super(codigo, duracaoDias, nome, organico, pesoMedio, possuiEmbalagem);
    }
}

class Transacao{

    private ArrayList<LocalDate> dataTransacao = new ArrayList<LocalDate>();
    private String enderecoFornecedor;
    private String nomeFornecedor;
    private ArrayList<Float> pesoProduto = new ArrayList<Float>();
    private ArrayList<Float> precoProduto = new ArrayList<Float>();
    private ArrayList<Vegetal> produto = new ArrayList<Vegetal>();

    /**
     * @param dataTransacao the dataTransacao to set
     */
    public void setDataTransacao(ArrayList<LocalDate> dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    /**
     * @param enderecoFornecedor the enderecoFornecedor to set
     */
    public void setEnderecoFornecedor(String enderecoFornecedor) {
        this.enderecoFornecedor = enderecoFornecedor;
    }

    /**
     * @param nomeFornecedor the nomeFornecedor to set
     */
    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    /**
     * @param pesoProduto the pesoProduto to set
     */
    public void setPesoProduto(ArrayList<Float> pesoProduto) {
        this.pesoProduto = pesoProduto;
    }

    /**
     * @param precoProduto the precoProduto to set
     */
    public void setPrecoProduto(ArrayList<Float> precoProduto) {
        this.precoProduto = precoProduto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(ArrayList<Vegetal> produto) {
        this.produto = produto;
    }

    /**
     * @return the dataTransacao
     */
    public ArrayList<LocalDate> getDataTransacao() {
        return dataTransacao;
    }

    /**
     * @return the enderecoFornecedor
     */
    public String getEnderecoFornecedor() {
        return enderecoFornecedor;
    }

    /**
     * @return the nomeFornecedor
     */
    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    /**
     * @return the pesoProduto
     */
    public ArrayList<Float> getPesoProduto() {
        return pesoProduto;
    }

    /**
     * @return the precoProduto
     */
    public ArrayList<Float> getPrecoProduto() {
        return precoProduto;
    }

    /**
     * @return the produto
     */
    public ArrayList<Vegetal> getProduto() {
        return produto;
    }

    Transacao (LocalDate dataTransacao, String enderecoFornecedor, String nomeFornecedor, float pesoProduto, float precoProduto, Vegetal veg) {
        this.dataTransacao.add(dataTransacao);
        this.enderecoFornecedor = enderecoFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.pesoProduto.add(pesoProduto);
        this.precoProduto.add(precoProduto);
        this.produto.add(veg);
    }

    public void AdicionaProduto(Vegetal novoVegetal, float peso, float preco, LocalDate data) {
        this.produto.add(novoVegetal);
        this.pesoProduto.add(peso);
        this.precoProduto.add(preco);
        this.dataTransacao.add(data);
    }

    public void PrintInfoProdutos() {
        for(int i = 0; i < this.produto.size(); i++){
            System.out.println("Produto " + (i+1) + ":");
            System.out.println(this.produto.get(i)); //talvez mudar aqui
        }
    }

    public int DiasRestantes(int i) {
        LocalDate hoje = LocalDate.now();
        Period duracao = Period.between(dataTransacao.get(i), hoje);
        int restam = duracao.getDays();
        int estragou = produto.get(i).getDuracaoDias() - restam;
        return estragou;
    }

    public int unidadesMedias (int i) { //retorna a média de unidades do vegetal
        return Math.round(pesoProduto.get(i)/produto.get(i).getPesoMedio());
    }
    
    public String toString(){
        return this.nomeFornecedor;
    }

    public void PrintarInf() {
        System.out.println("\n##############################");
        System.out.println("Fornecedor:" + getNomeFornecedor());
        System.out.println("Local: " + getEnderecoFornecedor() + "\n");
        for(int i=0;i<produto.size();i++){
            System.out.println("Nome: " + produto.get(i).getNome());
            System.out.println("Organico: " + produto.get(i).isOrganico());
            System.out.println("Embalagem: " + produto.get(i).isPossuiEmbalagem());
            System.out.println("Preco: R$" + precoProduto.get(i));
            System.out.println("Kilos: " + pesoProduto.get(i) + "kg");
            System.out.println("Unidade Media: " + unidadesMedias(i));
            System.out.println("\n ***Dias Restantes: " + DiasRestantes(i));   
            if(DiasRestantes(i) < 0){
              System.out.println("*Trocar o produto*");       
            }
            System.out.println("------------------");       
        }
    }
}

class LeTxt {
    ArrayList<Transacao> transacoes = new ArrayList<Transacao>();

    LeTxt() throws FileNotFoundException{
        File txtFile = new File("/home/neoson/Documents/P2-Java-Prog-Aut/text.txt");
        Scanner txtInput = new Scanner(txtFile);
        txtInput.useDelimiter("\t");
        
        Transacao transacao_temp;

        boolean igual=false;
        while (txtInput.hasNext()) {
            String tipoVegetal = txtInput.next();
            String nomeVegetal = txtInput.next();
            boolean organico = Boolean.valueOf(txtInput.next());
            boolean embalagem = Boolean.valueOf(txtInput.next());
            int duracaoDias = Integer.parseInt(txtInput.next());
            String codigo = txtInput.next();
            float pesoMedio = Float.parseFloat(txtInput.next());

            String nomeFornecedor = txtInput.next();
            String enderecoFornecedor = txtInput.next();
            float precoProduto = Float.parseFloat(txtInput.next());
            LocalDate dataTransacao = LocalDate.parse(txtInput.next());
            float pesoProduto = Float.parseFloat(txtInput.next());

            if(tipoVegetal.equals("F")){
                Fruta frute_temp = new Fruta(codigo, duracaoDias, nomeVegetal, organico, pesoMedio, embalagem);
                if (transacoes.size() > 0) {
                    for (int i = 0; i < transacoes.size(); i++) {
                        if (transacoes.get(i).getNomeFornecedor().equals(nomeFornecedor)) {
                            transacoes.get(i).AdicionaProduto(frute_temp, precoProduto, pesoProduto, dataTransacao);
                            igual =true;
                            break;
                        } else {
                            igual = false;
                        } 
                    }
                    if(igual == false){
                        transacao_temp = new Transacao(dataTransacao, enderecoFornecedor, nomeFornecedor, pesoProduto, precoProduto, frute_temp);
                        transacoes.add(transacao_temp);
                    }
                } else {
                    transacao_temp = new Transacao(dataTransacao, enderecoFornecedor, nomeFornecedor, pesoProduto, precoProduto, frute_temp);
                    transacoes.add(transacao_temp);
                } 
            } else if (tipoVegetal.equals("L")) {
                Legume legume_temp = new Legume (codigo, duracaoDias, nomeVegetal, organico, pesoMedio, embalagem);
                if (transacoes.size() > 0) {
                    for (int i = 0; i < transacoes.size(); i++) {
                        if (transacoes.get(i).getNomeFornecedor().equals(nomeFornecedor)) {
                            transacoes.get(i).AdicionaProduto(legume_temp, precoProduto, pesoProduto, dataTransacao);
                            igual =true;
                            break;
                        } else {
                            igual = false;
                        } 
                    }
                    if(igual == false){
                        transacao_temp = new Transacao(dataTransacao, enderecoFornecedor, nomeFornecedor, pesoProduto, precoProduto, legume_temp);
                        transacoes.add(transacao_temp);                        
                    }
                } else {
                    transacao_temp = new Transacao(dataTransacao, enderecoFornecedor, nomeFornecedor, pesoProduto, precoProduto, legume_temp);
                    transacoes.add(transacao_temp);
                } 
            } else if (tipoVegetal.equals("V")){
                Verdura verdura_temp = new Verdura (codigo, duracaoDias, nomeVegetal, organico, pesoMedio, embalagem);
                if (transacoes.size() > 0) {
                    for (int i = 0; i < transacoes.size(); i++) {
                        if (transacoes.get(i).getNomeFornecedor().equals(nomeFornecedor)) {
                            transacoes.get(i).AdicionaProduto(verdura_temp, precoProduto, pesoProduto, dataTransacao);
                            igual =true;
                            break;
                        } else {
                            igual = false;
                        } 
                    }
                    if(igual == false){
                        transacao_temp = new Transacao(dataTransacao, enderecoFornecedor, nomeFornecedor, pesoProduto, precoProduto, verdura_temp);
                        transacoes.add(transacao_temp);                        
                    }
                } else {
                    transacao_temp = new Transacao(dataTransacao, enderecoFornecedor, nomeFornecedor, pesoProduto, precoProduto, verdura_temp);
                    transacoes.add(transacao_temp);
                } 
            } else {
                System.out.println("Tipo de produto invalido");
            }
        }
        txtInput.close();
    }
}
/**
 * T2
 */
public class T2 {
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("Começando o Programa");
        System.out.println("Lendo Infromação do txt");
        LeTxt inf = new LeTxt();
        System.out.println("Informação lida");
        //System.out.println(l.transacoes.get(0).getNomeFornecedor());
        for (int i = 0; i < inf.transacoes.size(); i++) {
            System.out.println(inf.transacoes.get(i).getNomeFornecedor());
            for (int j = 0; j < inf.transacoes.get(i).getProduto().size(); j++) {
                System.out.println(inf.transacoes.get(i).getProduto().get(j).getNome());
            }
        }
    }
}