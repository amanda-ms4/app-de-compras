package modelos;
public class CartaoDeCredito {

    private double limite;
    private double saldo;
    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
        this.saldo = limite;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public boolean comprarNoCredito(Produto produto){

        if(produto.getPreco()<= this.saldo) {
            this.saldo -= produto.getPreco();
            System.out.println("Compra realizada!");
           return true;
        }
        else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
}