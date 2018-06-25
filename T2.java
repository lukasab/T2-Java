import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.awt.*;
import java.awt.event.*;

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
    }
}

class JanelaPrincipal extends Frame {

	private	Label fixoTexto;	 
	private Button botao1;
	private Button botao2;
	private TextField areaTexto;
	private TextField forn;
	private TextField nom;
	private TextField loc;
	private TextField og;
	private TextField prc;
	private TextField ps;
	private TextField ud;
	private TextField dia;
	private TextField kgs;
	private TextField DataTransacao;
	private Label fornecedor;
	private Label nome;
	private Label local;
	private Label org;
	private Label preco;
	private Label peso;
	private Label un;
	private Label dias;
	private Label kilos;
	private Label DataT;
	private Label Tipo;

	ArrayList<Transacao> transacoes = new ArrayList<Transacao>();

	

	private TextField campoTexto;
    private Choice escolha;
    private List lista;
    private Checkbox caixa;
    private Scrollbar barra;


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
	 		if (escolha.getSelectedItem().equals("Fruta")){
                
			 }
	 		}
 	}	


	// // Classe interna para receber eventos do botao 2
	// class EscutaBotao2 implements ActionListener{
	// 	public void actionPerformed( ActionEvent e) {
	// 		areaTexto.append("Botao <2> acionado\n");
	// 		areaTexto.append(">>" + campoTexto.getText() + "<<\n");
	// 		}
	// 	}	


	//Classe interna para lidar com return do campo texto
	//class EscutaCampoTexto implements ActionListener {
	//	public void actionPerformed( ActionEvent e) {
			//areaTexto.append("TEXTO " + campoTexto.getText() + "\n"); 
	//		}
	//	}


	// //Classe interna para lidar com uma escolha
	class EscutaEscolha implements ItemListener {

	 	public void itemStateChanged( ItemEvent e) {
	 		String item;
	 		int index;
		 
	 		item = escolha.getSelectedItem();
	 		index = escolha.getSelectedIndex();

	// 		areaTexto.append("ESCOLHA " + item + " indice " + index + "\n" );
	 		}
	 	}


	// //Classe interna para lidar com uma lista
	// class EscutaLista implements ItemListener {

	// 	public void itemStateChanged( ItemEvent e) {
	// 		String item;
	// 		int index;
		 
	// 		item = lista.getSelectedItem();
	// 		index = lista.getSelectedIndex();

	// 		areaTexto.append("LISTA " + item + " indice " + index + "\n" );
	// 		}
	// 	}


	//Classe interna para lidar com uma checkbox
	// class EscutaCaixa implements ItemListener {

	// 	public void itemStateChanged( ItemEvent e) {
	// 		if( caixa.getState() ) {
	// 			//areaTexto.append("CAIXA LIGOU\n");
	// 			//areaTexto.append("CAIXA DESLIGOU\n");
	// 		}
	// 	} }


	//Classe interna para lidar com barra de rolagem
	// class EscutaBarra implements AdjustmentListener {
	// 	public void adjustmentValueChanged( AdjustmentEvent e) {
	// 		int x = e.getValue();

	// 		switch( e.getAdjustmentType() )
	// 		  {	case AdjustmentEvent.UNIT_INCREMENT:
	// 				areaTexto.append(x + "BARRA +1\n" );
	// 				break;
	// 			case AdjustmentEvent.UNIT_DECREMENT:
	// 		        areaTexto.append(x + "BARRA -1\n" );
	// 				break;
	// 			case AdjustmentEvent.BLOCK_INCREMENT:
	// 				areaTexto.append(x + "BARRA +bloco\n" );
	// 				break;
	// 			case AdjustmentEvent.BLOCK_DECREMENT:
	// 				areaTexto.append(x + "BARRA -bloco\n" );
	// 				break;
	// 			case AdjustmentEvent.TRACK:
    //     			areaTexto.append(x + "BARRA track\n" );
	// 				break;
	// 			}
	// 		}
	// 	}






	// Inicializa o frame
	public JanelaPrincipal() {



		System.out.println("inicio da janela");

		this.setTitle("Minha Segunda Janela em Java");

		// Define o layout manager
		GridLayout gl = new GridLayout(2,10);
		this.setLayout( gl );

		// Cria um texto fixo
		//fixoTexto = new Label("texto fixo");
		//this.add( fixoTexto);
		nome = new Label("Nome");
		this.add(nome);
		Tipo=new Label ("Tipo");
        this.add(Tipo);
        org=new Label ("Organico");
        this.add(org);
        preco = new Label ("Preco");
        this.add(preco);
        kilos = new Label ("Peso");
        this.add(kilos);
        un = new Label ("Unidade Media");
        this.add(un);
        dias = new Label ("Dias Validade");
		this.add(dias);
		fornecedor = new Label("Fornecedor");
        this.add(fornecedor);
        local = new Label("Local");
		this.add(local);
		DataT= new Label("Data Transacao");
		this.add(DataT);
        

		// Cria uma area para colocar texto

		nom = new TextField("");
		this.add(nom);

		escolha = new Choice();
		escolha.addItem("Fruta");
		escolha.addItem("Verdura");
		escolha.addItem("Legume");

		og = new TextField();
		this.add(og);
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
		DataTransacao= new TextField();
		this.add( DataTransacao );


		
		// // Cria o botao 1
		// botao1 = new Button("Botao <1>");
		// this.add( botao1 );
		// EscutaBotao1 eb1 = new EscutaBotao1();
		// botao1.addActionListener(eb1);
	
		// // Cria o botao 2
		// botao2 = new Button("Botao <2>");
		// this.add( botao2 );
		// EscutaBotao2 eb2 = new EscutaBotao2();
		// botao2.addActionListener(eb2);
		
		// // Cria um campo para texto		
		// campoTexto = new TextField("valor inicial");
		// this.add( campoTexto );

		// EscutaCampoTexto ect = new EscutaCampoTexto();
		// campoTexto.addActionListener(ect);

		// // Cria uma escolha

		// escolha.addItem("ford");
		// escolha.addItem("renault");
		// escolha.addItem("crysler");
		// this.add( escolha);

		// EscutaEscolha ee = new EscutaEscolha();
		// escolha.addItemListener( ee );

		// // Cria uma lista
		// lista = new List( 3, false);
		// lista.add("preto");
		// lista.add("azul");
		// lista.add("vermelho");
		// lista.add("amarelo");
		// lista.add("verde");
		// lista.add("roxo");
		// this.add( lista);

		// EscutaLista el = new EscutaLista();
		// lista.addItemListener( el );

		// // Cria uma caixa de selecao
		// caixa = new Checkbox("caixa para marcar", false);
		// this.add( caixa);
		
		// EscutaCaixa ec = new EscutaCaixa();
		// caixa.addItemListener( ec );

		// // Cria uma barra de rolagem
		// barra = new Scrollbar( Scrollbar.HORIZONTAL, 50, 0, 0, 100);
		// this.add( barra);

		// EscutaBarra eb = new EscutaBarra();
		// barra.addAdjustmentListener( eb );

		// // Cria uma area para desenho
		// desenho = new AreaDesenho("desenho");
		// desenho.setColor(Color.blue);
		// this.add(desenho);
		
		// desenho.setColor(Color.red);
		// desenho.repaint();		


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
		return new Dimension(600, 200);
		}
	}


// Mude o texto escrito sobre o botao 1

// Mude o comportamento de cada componente visual que gera eventos

// Mude o desenho conforme algum evento

