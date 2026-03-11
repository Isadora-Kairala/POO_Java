import java.util.Date;

    public class Pedido {
    private int id;
    private Date data;
    private Cliente cliente; // associação todo-parte


        public Pedido() {

        }

        //cliente veio pronto mostrando sua independencia do pedido
        public Pedido(int id, Date data, Cliente cliente) {
            this.id = id;
            this.data = data;
            this.cliente = cliente;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getData() {
            return data;
        }

        public void setData(Date data) {
            this.data = data;
        }

        public Cliente getCliente() {
            return cliente;
        }

        //cliente veio pronto mostrando sua independencia do pedido
        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        @Override
        public String toString() {
            return "Pedido{" +
                    "id=" + id +
                    ", data=" + data +
                    ", cliente=" + cliente +
                    '}';
        }
    }
