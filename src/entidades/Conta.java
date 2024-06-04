package entidades;

public class Conta {

    private  int numeroDaConta;
    private String titularDaConta;
    private double saldoDaConta;

    public Conta(int numeroDaConta, String titularDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.titularDaConta = titularDaConta;
    }

    public Conta(int numeroDaConta, String titularDaConta, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.titularDaConta = titularDaConta;
        deposito(depositoInicial);
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTitularDaConta() {
        return titularDaConta;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setTitularDaConta(String titularDaConta) {
        this.titularDaConta = titularDaConta;
    }
    public void deposito(double quantia){
        saldoDaConta += quantia;
    }

    public void sacar(double quantia){
        saldoDaConta -= quantia + 5.0;
    }

    public String toString(){
        return "Conta " + numeroDaConta + ", Titular: " + titularDaConta + ", Saldo: $ " + String.format("%.2f", saldoDaConta);
    }


    }
