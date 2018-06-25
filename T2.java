import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.awt.*;
import java.awt.event.*;
import java.nio.file.*;

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
            System.out.println(inf.transacoes.get(i));
        }
        new JanelaPrincipal();
        new JanelaMostra();
    }
}

class JanelaPrincipal extends Frame {
 
	private Button botao1;
    private Label cod;
    private Label nome;
    private Label local;
    private Label org;
    private Label embalag;
    private Label preco;
	private Label peso;
	private Label un;
	private Label dias;
	private Label kilos;
	private Label DataT;
    private Label Tipo;
    private Label confirma;
    private Label fornecedor;
    private Label pesoProd;
	private TextField codigo1;
    private TextField forn;
    private Choice escolha;
	private TextField nom;
	private TextField loc;
    private Choice og;
    private Choice embalagem1;
	private TextField prc;
	private TextField ud;
	private TextField dia;
	private TextField kgs;
	private TextField DataTransacao;
    private TextField pesoProduto1;


    ArrayList<Transacao> transacoes = new ArrayList<Transacao>();
    Transacao transacao;
    Transacao transacao_temp;


	// Classe interna para receber eventos associados com a janela
	class EscutaJanela extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.out.println("janela foi fechada");
			System.exit(0);            
		}    	
	}

	// // Classe interna para receber eventos do botao 1
	class EscutaBotao1 implements ActionListener{
	 	public void actionPerformed( ActionEvent e) {
            // String codigo = codigo1.getText();
            // String tipoVegetal = escolha.getSelectedItem();
            // String nomeVegetal = nom.getText();
            // boolean organico = Boolean.valueOf(og.getSelectedItem());
            // boolean embalagem = Boolean.valueOf(embalagem1.getSelectedItem());
            // int duracaoDias = Integer.parseInt(dia.getText());
            // Float pesoMedio = Float.parseFloat(kgs.getText());

            // String nomeFornecedor = forn.getText();
            // String enderecoFornecedor = loc.getText();
            // float precoProduto = Float.parseFloat(prc.getText());
            // LocalDate dataTransacao = LocalDate.parse(DataTransacao.getText());
            // float pesoProduto = Float.parseFloat(pesoProduto1.getText());
            String novoTipo = "";
            if (escolha.getSelectedItem().equals("Fruta")) {
                novoTipo = "F";
            } else if (escolha.getSelectedItem().equals("Legume")){
                novoTipo = "L";
            } else {
                novoTipo = "V";
            }
            String novoNomeVegetal = nom.getText();
            String novoOrganico = og.getSelectedItem();
            String novaEmbalagem = embalagem1.getSelectedItem();
            String novaDuracaoDias = dia.getText();
            String novoCodigo = codigo1.getText();
            String novoPesoMedio = kgs.getText();
            String novoFornecedor = forn.getText();
            String novoEnderecoFornecedor = loc.getText();
            String novoPrecoProduto = prc.getText();
            String novaDataTranscao = DataTransacao.getText();
            String novoPesoProduto = pesoProduto1.getText();

            String novoProdutoTxt = "\t" + novoTipo + "\t" + novoNomeVegetal + "\t" + novoOrganico + "\t" + novaEmbalagem + "\t" + novaDuracaoDias + "\t" + novoCodigo + "\t" + novoPesoMedio + "\t" + novoFornecedor + "\t" + novoEnderecoFornecedor + "\t" + novoPrecoProduto + "\t" + novaDataTranscao + "\t" + novoPesoProduto;  
            try {
                Files.write(Paths.get("/home/neoson/Documents/P2-Java-Prog-Aut/text.txt"), novoProdutoTxt.getBytes(), StandardOpenOption.APPEND);
            }catch (IOException er) {
                //exception handling left as an exercise for the reader
            }
            
        }	
    }
     
     class EscutaEscolha implements ItemListener {

        public void itemStateChanged( ItemEvent e) {
 
    
        } 
    }	

	//Classe interna para lidar com return do campo texto
	class EscutaCampoTexto implements ActionListener {
		public void actionPerformed( ActionEvent e) {
			//areaTexto.append("TEXTO " + campoTexto.getText() + "\n"); 
        } 
    }

	// Inicializa o frame
	public JanelaPrincipal() {

		System.out.println("inicio da janela");

		this.setTitle("Nova Transação");

		// Define o layout manager
		GridLayout gl = new GridLayout(2,14);
		this.setLayout( gl );

		// Cria um texto fixo
		//fixoTexto = new Label("texto fixo");
        //this.add( fixoTexto);
        cod= new Label("Codigo");
        this.add(cod);

        Tipo=new Label ("Tipo:");
        this.add(Tipo);

        nome = new Label("Nome");
		this.add(nome);
	
        org=new Label ("É Organico?");
        this.add(org);
        
        embalag=new Label ("Possui embalagem?");
        this.add(embalag);
        
        preco = new Label ("Preco");
        this.add(preco);
        
        kilos = new Label ("Peso Unidade");
        this.add(kilos);
        
        un = new Label ("Unidade Media");
        this.add(un);
        
        dias = new Label ("Dias Validos");
		this.add(dias);
        
        fornecedor = new Label("Nome Fornecedor");
        this.add(fornecedor);
        
        local = new Label("Local");
		this.add(local);
        
        DataT= new Label("Data Transacao");
        this.add(DataT);

        pesoProd = new Label ("Peso Total");
        this.add(pesoProd);
        
        confirma=new Label ("Adicione o Produto");
        this.add(confirma);
        

        // Cria uma area para colocar texto

        codigo1 = new TextField();
        this.add(codigo1);
        
		escolha = new Choice();
		escolha.addItem("Fruta");
		escolha.addItem("Verdura");
        escolha.addItem("Legume");
        this.add(escolha);
        EscutaEscolha ee = new EscutaEscolha();
		escolha.addItemListener( ee );

        nom = new TextField();
		this.add(nom);

        og = new Choice();
        og.addItem("true");
		og.addItem("false");
        this.add(og);
        EscutaEscolha og1 = new EscutaEscolha();
		og.addItemListener( og1 );
        
        embalagem1= new Choice();
        embalagem1.addItem("true");
		embalagem1.addItem("false");
        this.add(embalagem1);
        EscutaEscolha em1 = new EscutaEscolha();
		embalagem1.addItemListener( em1);

        prc = new TextField();
        this.add( prc );
        
        kgs = new TextField();
        this.add(kgs);
        
        ud = new TextField();
        this.add( ud );
        
        dia = new TextField();
        this.add( dia );
        
        forn = new TextField();
        this.add( forn );
        
        loc = new TextField();
        this.add( loc );
        
        DataTransacao= new TextField("aaaa-mm-dd");
        this.add( DataTransacao );

        pesoProduto1 = new TextField ();
        this.add(pesoProduto1);

        botao1 = new Button("Confirmar");
        this.add(botao1);
        EscutaBotao1 eb1 = new EscutaBotao1();
        botao1.addActionListener(eb1);

		// Para pegar o fechamento da janela
		EscutaJanela ej = new EscutaJanela();
		this.addWindowListener(ej);


		// Acabou
		System.out.println("terminou criacao dos componentes");

		// Mostra
		this.pack();
		this.setVisible(true);	// "this" eh opcional
		}


	// Informa o tamanho preferido
	public Dimension getPreferredSize() {
		return new Dimension(1200, 80);
		}
}

class JanelaMostra extends Frame {
        private Button refresh;
        private Label key;
        private Label name;
        private Label localCompany1;
        private Label organic;
        private Label package1;
        private Label price;
        private Label weight;
        private Label unidmedia;
        private Label days;
        private Label kilog;
        private Label transactionDate;
        private Label type;
        private Label confirm;
        private Label company;
        private Label weightProd;
        private TextArea key1;
        private TextArea comp;
        private TextArea types;
        private TextArea nameVegetable;
        private TextArea localCompany;
        private TextArea organicOrNot;
        private TextArea packageem1;
        private TextArea priceProduct;
        private TextArea ud1;
        private TextArea day;
        private TextArea kilos;
        private TextArea dateTransaction;
        private TextArea weightProduto1;

        class EscutaCampoTexto implements ActionListener {
            public void actionPerformed( ActionEvent e) {
                //areaTexto.append("TEXTO " + campoTexto.getText() + "\n"); 
                }
            }


            class EscutaBotao1 implements ActionListener{
	 	public void actionPerformed( ActionEvent e) {

            
        }	
    }

    	class EscutaJanela extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.out.println("janela foi fechada");
			System.exit(0);            
		}    	
    }
    
        public JanelaMostra () {

            System.out.println("inicio da janela");

		    this.setTitle("Vegetais Disponiveis");

            GridLayout gl = new GridLayout(2,14);
            this.setLayout( gl );
        
            key= new Label("Codigo");
            this.add(key);
    
            type=new Label ("type:");
            this.add(type);
    
            name = new Label("Nome");
            this.add(name);
        
            organic=new Label ("É Organico?");
            this.add(organic);
            
            package1=new Label ("Possui packageem?");
            this.add(package1);
            
            price = new Label ("Preco");
            this.add(price);
            
            kilog = new Label ("Peso Unidade");
            this.add(kilog);
            
            unidmedia = new Label ("Unidade Meday");
            this.add(unidmedia);
            
            days = new Label ("Dias Validos");
            this.add(days);
            
            company = new Label("Nome Fornecedor");
            this.add(company);
            
            localCompany1 = new Label("Local");
            this.add(localCompany1);
            
            transactionDate= new Label("Data Transacao");
            this.add(transactionDate);
    
            weightProd = new Label ("Peso Total");
            this.add(weightProd);

            confirm = new Label ("Refresh");
            this.add(confirm);
        
                // Cria uma area para colocalCompanyar texto
            key1 = new TextArea();
            key1.setEditable(false);
            this.add( key1 );

            types = new TextArea();
            types.setEditable(false);
            this.add(types);

            nameVegetable = new TextArea();
            nameVegetable.setEditable(false);
            this.add( nameVegetable );

            organicOrNot = new TextArea();
            organicOrNot.setEditable(false);
            this.add( organicOrNot );

            packageem1 = new TextArea();
            packageem1.setEditable(false);
            this.add( packageem1 );

            priceProduct = new TextArea();
            priceProduct.setEditable(false);
            this.add( priceProduct );

            priceProduct = new TextArea();
            priceProduct.setEditable(false);
            this.add(priceProduct);

            ud1 = new TextArea();
            ud1.setEditable(false);
            this.add( ud1 );

            day = new TextArea();
            day.setEditable(false);
            this.add( day );

            comp = new TextArea();
            comp.setEditable(false);
            this.add( comp );

            localCompany = new TextArea();
            localCompany.setEditable(false);
            this.add( localCompany );

            dateTransaction = new TextArea();
            dateTransaction.setEditable(false);
            this.add( dateTransaction );

            weightProduto1 = new TextArea();
            weightProduto1.setEditable(false);
            this.add( weightProduto1 );

            refresh = new Button ("Refresh");
            this.add(refresh);
            EscutaBotao1 eb1 = new EscutaBotao1();
            refresh.addActionListener(eb1);

            EscutaJanela ej = new EscutaJanela();
		    this.addWindowListener(ej);

            this.pack();
            this.setVisible(true);	// "this" eh opcional
                
        }

        public Dimension getPreferredSize() {
		return new Dimension(1200,100);
		}

    }
    
