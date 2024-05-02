package modelos;

public class CartaoDeCredito {

    private double limite;
    private double saldo;
    private boolean compraRealizada;

    public CartaoDeCredito() {
    }

    public CartaoDeCredito(double limite) {
        this.limite = limite;
    }

    public boolean isCompraRealizada() {
        return compraRealizada;
    }
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
        this.saldo = limite;
    }

    public void comprarNoCredito(Produto produto){

        if(produto.getPreco()<= this.saldo) {
            this.saldo -= produto.getPreco();
            System.out.println("Compra realizada!");
            this.compraRealizada = true;

        }
        else {
            System.out.println("Saldo insuficiente!");
            this.compraRealizada = false;
        }

    }
    public double getSaldo() {
        return this.saldo;
    }


}