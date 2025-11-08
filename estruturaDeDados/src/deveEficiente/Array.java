package deveEficiente;

public class Array {
    public static void main(String[] args) {
        int[] arrayUm = {12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321};
        int[] arrayDois = {43, 42, 4, 8, 55, 21, 2, 45};

        //SOMANDO TODOS OS ELEMENTOS - FÁCIL
//        int soma =0;
//        for (int i =0; i< arrayUm.length; i++){
//             soma += arrayUm[i];
//        }
//        System.out.println(soma);
//

        //ENCONTRAR O MAIOR VALOR DE TODOS
        int maiorValor = arrayUm[0];
        for (int i = 0; i < arrayUm.length; i++) {
            if (arrayUm[i] > maiorValor) {
                maiorValor = arrayUm[i];
            }
        }
        System.out.println(maiorValor);

    }
}
