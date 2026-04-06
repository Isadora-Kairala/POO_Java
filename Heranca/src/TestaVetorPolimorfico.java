

public class TestaVetorPolimorfico {
        static void main(String[] args) {
            DesenvolvedorJava[] devs = new DesenvolvedorJava[4];

            devs[0] = new Junior("Ana", "Java", 3000, "Carlos");
            devs[1] = new Pleno("Bruno", "Java", 5000, 10); //
            devs[2] = new Senior("Carla", "Java", 8000, 2000); //
            devs[3] = new DesenvolvedorJava("Daniel", "Java", 2000);

            /*
            um vetor (array) de tamanho 4 do tipo Desenvolvedor.Preencha o vetor com:
            Um objeto Junior.
            Um objeto Pleno.
            Um objeto Senior.
            Um objeto Desenvolvedor (genérico).
            Utilizando um laço de repetição (for ou foreach), percorra o vetor e, para cada objeto:
            Chame o método codar().
            Imprima o resultado do método calcularBonus().
            Imprima o toString() do objeto.
             */

            for( int i = 0 ; i < devs.length ; i++){
                devs[i].codar();
                System.out.println(devs[i].calcularBonus());
                System.out.println(devs[i]);
            }



        }


}
