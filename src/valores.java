public class valores {
    public static void main(String[] args) {
        int [] numeros = new int [5];
        numeros[0] = 2;
        numeros[1] = 1;
        numeros[2] = 5;
        numeros[3] = 3;
        numeros[4] = 7;

        int menor = 10;

        for (int i = 0; i < numeros.length; i++){
            int temporaria = numeros[i];
            if (temporaria < menor){
                menor = temporaria;
            }
        }
        System.out.println(menor);
    }
}
