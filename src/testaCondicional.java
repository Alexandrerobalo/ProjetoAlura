public class testaCondicional {
    public static void main (String[] args) {
        System.out.println("testando condicionais");

        int idade = 16;
        int quantidadedePessoas = 3;

        if (idade >= 18) {
            System.out.println("você tem mais de 18 anos");
            System.out.println("Seja bem vindo");
        } else {


            if (quantidadedePessoas >= 2) {

                System.out.println("Você nao tem 18 anos, mas pode entrar" +
                        " pois esta acompanhado");
            }else{
                System.out.println("infelizmente você não pode entrar");

            }
        }

    }
}
