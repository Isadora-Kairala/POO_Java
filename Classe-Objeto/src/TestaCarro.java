public class TestaCarro {
    public static void main(String[] args){
        //System.out.println("oi"); jdk compila trazendo o resultado dessa linha por exemplo
        //byte code => arquivo .class
        //jvm interpreta o .class, fica no jdk
        //compilado e interpretado ao mesmo tempo
        //instanciar objeto obj1




            /*
            Carro obj1 = new Carro();
            obj1.marca = "Fiat";
            obj1.modelo = "Uno";
            obj1.velocidade = 0;
            obj1.motor = false;
            System.out.println(obj1.toString());
            //sout
             */
            // instanciei obj1

            //obj pode chamar os metodos da classe que ele pertence !!


            /*
            Carro obj2 = new Carro("Caoa Cherry", "Tiggo 8", 110, true););
            obj2.marca = "GM";
            obj2.modelo = "Onix";
            obj2.velocidade = 0;
            obj2.motor = false;
            System.out.println(obj2.toString());

             */


        //objeto usando contrutor:
        Carro carro = new Carro("Caoa Cherry", "Tiggo 8", 110, true);
        System.out.println(carro.toString());


        carro.ligar();
        carro.acelerar(30);
        carro.acelerar(60);
        carro.frear(20);




    }
}
