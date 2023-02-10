
import javax.swing.*;

public class Relogio implements Runnable {

    private int hora;
    private int minuto;
    private int segundo;
    private boolean parar;
    private int tempo;
    private JTextField campo;
    private FrmJanela janela;

    public Relogio(JTextField campo, FrmJanela janela) {
        this.campo = campo;
        this.janela = janela;
        setTempo(1000);
        setHora(0);
        setMinuto(0);
        setSegundo(0);
        setParar(false);
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void aumentar() {
        setTempo(getTempo() + 25);
    }

    public void diminuir() {
        setTempo(getTempo() - 25);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int _hora) {
        if (_hora < 24) {
            this.hora = _hora;
        } else {
            this.hora = 0;
            setMinuto(0);
            setSegundo(0);
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int _minuto) {
        if (_minuto < 60) {
            this.minuto = _minuto;
        } else {
            this.minuto = 0;
            setHora(getHora() + 1);
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int _segundo) {
        if (_segundo < 60) {
            this.segundo = _segundo;
        } else {
            this.segundo = 0;
            setMinuto(getMinuto() + 1);
        }
    }

    public boolean getParar() {
        return parar;
    }

    public void setParar(boolean _parar) {
        parar = _parar;
    }

    public String horaString() {
        return (getHora() + ":" + getMinuto() + ":" + getSegundo());
    }

    public void imprimir() {
        campo.setText(horaString());
        janela.repaint();
    }

    private synchronized void parar() {
        //Se parar igual a true o relogio wait
        if (getParar() == true) {
            System.out.print("parando");
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
    }

    public synchronized void continuar() {
        System.out.print("continuando");
        setParar(false);
        notify();
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(getTempo());
            } catch (InterruptedException e) {
            }
            //incrementa os segundos do relogio
            setSegundo(getSegundo() + 1);
            imprimir(); //atualiza o Frame com os dados do relogio
            //Chamada a parada
            parar();
        }
    }
}
