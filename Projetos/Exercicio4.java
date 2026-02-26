

public class Exercicio4 {
    public static void main(String[] args) {
        Integer[] n1 = {1,2,3,4,5};
        int soma = 0;
        int maior = n1[0];
        
        for(int i = 0; i < n1.length; i++) {
            soma += n1[i];

            if (n1[i] > maior) {
                maior = n1[i];
            }
        }  
        double media = (double) soma / n1.length;
     
        System.out.println("SOMA: "+n1);
        System.out.println("Média: " + media);
        System.out.println("Maior número:" +maior );
    }
}
