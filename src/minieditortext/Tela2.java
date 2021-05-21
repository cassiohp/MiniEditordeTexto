package minieditortext;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author cassi
 */
public class Tela2 extends JFrame {
    private JPanel painel;
    private JLabel jlFonte, jlCor, jlTamanho;
    private JButton jbAlterar, jbLimpar, jbApagar;
    private String[] fontes = {"Arial", "SansSerif", "Calibri", "Verdana", "Times New Roman", "Monospaced", "Serif", "Century", "Impact", "Georgia"};
    private JComboBox jcFonte = new JComboBox(fontes);
    private Integer[] tamanho = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    private JComboBox jcTamanho = new JComboBox(tamanho);
    private String[] cor = {"Vermelho", "Amarelo", "Azul", "Rosa", "Magenta", "Preto", "Cinza", "Laranja", "Ciano", "Verde"};
    private JComboBox jcCor = new JComboBox(cor);
    private JTextArea jtxArea;
    private JRadioButton jrbNegrito;
    private JRadioButton jrbNormal;
    private JRadioButton jrbItalico;
    private JRadioButton jrbItalicoNegrito;
    private ButtonGroup bg = new ButtonGroup();
    
    
    public Tela2(){
        
        painel = new JPanel();
        jlFonte = new JLabel("Fonte: ");
        jlCor = new JLabel("Cor: ");
        jlTamanho = new JLabel("Tamanho: ");
        jtxArea = new JTextArea(250 , 250);
        jbAlterar = new JButton("Alterar Formatação");
        jbLimpar = new JButton("Limpar Formatação");
        jbApagar = new JButton("Apagar Texto");
        jrbItalico = new JRadioButton("Itálico");
        jrbNormal = new JRadioButton("Normal");
        jrbNegrito = new JRadioButton("Negrito");
        jrbItalicoNegrito = new JRadioButton("Itálico - Negrito");
        
        bg.add(jrbItalico);
        bg.add(jrbNormal);
        bg.add(jrbNegrito);
        bg.add(jrbItalicoNegrito);
        
    }
    public void configurarJanela2(){
        setTitle("Mini Editor 0.0.1");
        setSize(600, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(painel); 
        configurarPainel();
        setVisible(true);
                
    }
    
    public void configurarPainel(){
        painel.setLayout(null);
        jlFonte.setBounds(10, 10, 110, 30);
        jcFonte.setBounds(50, 10, 150, 30);
        jlTamanho.setBounds(215, 10, 110, 30);
        jcTamanho.setBounds(278, 10, 150, 30);
        jlCor.setBounds(10, 50, 110, 30);
        jcCor.setBounds(40, 50, 150, 30);
        jbAlterar.setBounds(200, 50 , 160, 30);
        jbAlterar.addActionListener(evento ->{
            
            String cor = (String)jcCor.getSelectedItem();
            
            if(cor == "Vermelho"){
                
                jtxArea.setForeground(Color.RED);
            }
            
            if(cor == "Amarelo"){
                
                jtxArea.setForeground(Color.YELLOW);
            }
            
            if(cor == "Azul"){
                
                jtxArea.setForeground(Color.BLUE);
            }
            
            if(cor == "Rosa"){
                
                jtxArea.setForeground(Color.PINK);
            }
            
            if(cor == "Magenta"){
                
                jtxArea.setForeground(Color.MAGENTA);
            }
            
            if(cor == "Preto"){
                
                jtxArea.setForeground(Color.BLACK);
            }
            
            if(cor == "Cinza"){
                
                jtxArea.setForeground(Color.GRAY);
            }
            
            if(cor == "Laranja"){
                
                jtxArea.setForeground(Color.ORANGE);
            }
            
            if(cor == "Ciano"){
                
                jtxArea.setForeground(Color.CYAN);
            }
            
            if(cor == "Verde"){
                
                jtxArea.setForeground(Color.GREEN);
            }
            
            String fonte = (String)jcFonte.getSelectedItem();
            int tamanho = (int)jcTamanho.getSelectedItem();
            int estilo = 0;
            
            if(jrbNormal.isSelected()){
                
                estilo = Font.PLAIN;
                
            }
            
            if(jrbItalico.isSelected()){
                
                estilo = Font.ITALIC;
                
            }
            
            if(jrbNegrito.isSelected()){
                
                estilo = Font.BOLD;
            }
            
            if(jrbItalicoNegrito.isSelected()){
                
                estilo = Font.BOLD + Font.ITALIC;
                
            }
            
            jtxArea.setFont(new Font(fonte, estilo, tamanho));
            
        });
        jbLimpar.setBounds(380, 50 , 160, 30);
        jrbNormal.setBounds(80, 90, 70, 30);
        jrbItalico.setBounds(150, 90, 70, 30);
        jrbNegrito.setBounds(10,90, 70, 30);
        jrbItalicoNegrito.setBounds(220,90, 120, 30);
        jbLimpar.addActionListener(evento ->{
            jtxArea.setFont(new Font("Arial", Font.PLAIN, 14));
            jtxArea.setForeground(Color.black);
        });
        jbApagar.setBounds(400, 90, 140, 30);
        jbApagar.addActionListener(evento ->{
            jtxArea.setText("");
        });
        jtxArea.setBounds(10, 130, 560, 460);
 
        painel.add(jlFonte);
        painel.add(jcFonte);
        painel.add(jlTamanho);
        painel.add(jcTamanho);
        painel.add(jlCor);
        painel.add(jcCor);
        painel.add(jbAlterar);
        painel.add(jbLimpar);
        painel.add(jbApagar);
        painel.add(jtxArea);
        painel.add(jrbItalico);
        painel.add(jrbNormal);
        painel.add(jrbNegrito);
        painel.add(jrbItalicoNegrito);
        
    }

}
