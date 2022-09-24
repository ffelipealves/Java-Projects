package programa;

public class Conta {

    private static int idConta=0;
    private Cliente cliente;
    private double saldo=0;

    public Conta(Cliente cliente){

        this.cliente = cliente;
        idConta++;
    }

    public static int getIdConta() {
        return idConta;
    }

    public static void setIdConta(int idConta) {
        Conta.idConta = idConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "idConta=" + getIdConta() +
                "cliente=" + cliente.getNome() +
                "email=" + cliente.getEmail() +
                "cpf=" + cliente.getCpf() +
                ", saldo=" + getSaldo() +
                '}';
    }
}
