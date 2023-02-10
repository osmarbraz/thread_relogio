
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class FrmJanela extends JFrame {

    // Declaração dos relógios e das threads
    private Relogio r1;
    private Thread t1;

    private Relogio r2;
    private Thread t2;

    private JPanel contentPane;
    private JButton jBtFechar;
    private Border border1;
    private Border border2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JButton jButton4;
    private JButton jButton5;
    private JTextField jTextField2;
    private JLabel jLabel4;
    private JButton jButton6;
    private JButton jButton7;
    private JLabel jLabel1;
    private JTextField jTextField3;
    private JButton jButton8;
    private JButton jButton9;
    private JButton jBtFechar0;
    private JLabel jLabel5;
    private JButton jBtFechar1;
    private JPanel jPanel5;
    private JLabel jLabel2;
    private JPanel jPanel6;

    public FrmJanela() {
        inicializar();
    }

    public void inicializar() {
        instanciar();
        posicionar();
        agrupar();
        configurar();
        associarEventos();
    }

    public void instanciar() {
        jBtFechar = new JButton();
        jPanel3 = new JPanel();
        jPanel4 = new JPanel();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jTextField2 = new JTextField();
        jLabel4 = new JLabel();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jLabel1 = new JLabel();
        jTextField3 = new JTextField();
        jButton8 = new JButton();
        jButton9 = new JButton();
        jBtFechar0 = new JButton();
        jLabel5 = new JLabel();
        jBtFechar1 = new JButton();
        jPanel5 = new JPanel();
        jLabel2 = new JLabel();
        jPanel6 = new JPanel();

        // instancia os relogios passando os textfield e a janela como argumento
        r1 = new Relogio(jTextField2, this);
        r2 = new Relogio(jTextField3, this);
    }

    public void posicionar() {
        this.setSize(new Dimension(370, 260));
        jBtFechar.setBounds(new Rectangle(273, 202, 79, 27));
        jPanel3.setBounds(new Rectangle(1, 101, 354, 95));
        jPanel4.setBounds(new Rectangle(160, 3, 186, 87));
        jButton4.setBounds(new Rectangle(87, 54, 92, 27));
        jButton5.setBounds(new Rectangle(87, 24, 92, 27));
        jTextField2.setBounds(new Rectangle(8, 27, 141, 57));
        jLabel4.setBounds(new Rectangle(6, 5, 71, 17));
        jButton6.setBounds(new Rectangle(4, 24, 79, 27));
        jButton7.setBounds(new Rectangle(5, 54, 79, 27));
        jLabel1.setBounds(new Rectangle(5, 6, 170, 17));
        jTextField3.setBounds(new Rectangle(8, 27, 141, 57));
        jButton8.setBounds(new Rectangle(5, 54, 79, 27));
        jButton9.setBounds(new Rectangle(4, 24, 79, 27));
        jBtFechar0.setBounds(new Rectangle(87, 24, 92, 27));
        jLabel5.setBounds(new Rectangle(6, 5, 71, 17));
        jBtFechar1.setBounds(new Rectangle(87, 54, 92, 27));
        jPanel5.setBounds(new Rectangle(160, 3, 186, 87));
        jLabel2.setBounds(new Rectangle(5, 6, 170, 17));
        jPanel6.setBounds(new Rectangle(0, 0, 354, 95));
    }

    public void agrupar() {
        contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(null);
        jPanel3.setLayout(null);
        jPanel4.setLayout(null);
        jPanel5.setLayout(null);
        jPanel6.setLayout(null);
        jPanel3.add(jLabel4, null);
        jPanel3.add(jTextField2, null);
        jPanel3.add(jPanel4, null);
        jPanel4.add(jButton4, null);
        jPanel4.add(jButton6, null);
        jPanel4.add(jButton7, null);
        jPanel4.add(jButton5, null);
        jPanel4.add(jLabel1, null);
        contentPane.add(jBtFechar, null);
        contentPane.add(jPanel6, null);
        jPanel6.add(jLabel5, null);
        jPanel6.add(jTextField3, null);
        jPanel6.add(jPanel5, null);
        jPanel5.add(jBtFechar1, null);
        jPanel5.add(jButton9, null);
        jPanel5.add(jButton8, null);
        jPanel5.add(jBtFechar0, null);
        jPanel5.add(jLabel2, null);
        contentPane.add(jPanel3, null);
    }

    public void configurar() {
        border1 = BorderFactory.createBevelBorder(BevelBorder.RAISED,
                Color.white, Color.white, new Color(148, 145, 140), new Color(
                        103, 101, 98));
        border2 = BorderFactory.createBevelBorder(BevelBorder.RAISED,
                Color.white, Color.white, new Color(148, 145, 140), new Color(
                        103, 101, 98));
        this.setTitle("Janela Relógio");
        jBtFechar.setText("Fechar");
        jPanel3.setBorder(border2);
        jPanel4.setBorder(border1);
        jButton4.setText("Diminuir");
        jButton4.setToolTipText("");
        jButton5.setText("Aumentar");
        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 35));
        jTextField2.setText("23:59:59");
        jLabel4.setToolTipText("");
        jLabel4.setText("Tempo 2");
        jButton6.setText("Iniciar");
        jButton7.setText("Parar");
        jLabel1.setToolTipText("");
        jLabel1.setText("Controle Tempo 2");
        jTextField3.setText("23:59:59");
        jTextField3.setFont(new java.awt.Font("SansSerif", 0, 35));
        jButton8.setText("Parar");
        jButton9.setText("Iniciar");
        jBtFechar0.setText("Aumentar");
        jLabel5.setText("Tempo 1");
        jBtFechar1.setToolTipText("");
        jBtFechar1.setText("Diminuir");
        jPanel5.setBorder(border1);
        jLabel2.setToolTipText("");
        jLabel2.setText("Controle Tempo 1");
    }

    public void associarEventos() {
        jBtFechar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton4_actionPerformed(e);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton5_actionPerformed(e);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton6_actionPerformed(e);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton7_actionPerformed(e);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton8_actionPerformed(e);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton9_actionPerformed(e);
            }
        });
        jBtFechar0.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jBtFechar0_actionPerformed(e);
            }
        });
        jBtFechar1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jBtFechar_actionPerformed(e);
            }
        });
    }

    // Overridden so we can exit when window is closed
    @Override
    protected void processWindowEvent(WindowEvent e) {
        super.processWindowEvent(e);
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            System.exit(0);
        }
    }

    void jButton4_actionPerformed(ActionEvent e) {// diminuir1
        r1.diminuir();// diminnui o tempo do relogio 1
    }

    void jButton5_actionPerformed(ActionEvent e) { // aumentar1
        r1.aumentar(); // incrementa o tempo do relogio 1
    }

    void jButton6_actionPerformed(ActionEvent e) { // iniciar1
        if (t1 == null) { // coloca o relogio1 dentro da thread1
            t1 = new Thread(r1);
            // inicializa a thread1 para o relogio1
            t1.start();
        } else // chama o continuar para notificar as threads do relogio1
        {
            r1.continuar();
        }
    }

    void jButton7_actionPerformed(ActionEvent e) { // parar1
        // set a variável parar para true do relogio1 indicando que a thread
        // deve esperar(waint)
        r1.setParar(true);
    }

    void jButton8_actionPerformed(ActionEvent e) { // parar2
        // set a variável parar para true do relogio2 indicando que a thread
        // deve esperar(waint)
        r2.setParar(true);
    }

    void jButton9_actionPerformed(ActionEvent e) { // iniciar2
        if (t2 == null) { // coloca o relogio2 dentro da thread2
            t2 = new Thread(r2);
            // inicializa a thread2 para o relogio2
            t2.start();
        } else // chama o continuar para notificar as threads do relogio2
        {
            r2.continuar();
        }
    }

    void jBtFechar0_actionPerformed(ActionEvent e) { // aumentar2
        r2.aumentar();// incrementa o tempo do relogio 2
    }

    void jBtFechar_actionPerformed(ActionEvent e) {// diminuir2
        r2.diminuir();// decrementa o tempo do relogio 2
    }
}
