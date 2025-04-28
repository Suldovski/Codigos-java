
import java.util.Scanner;

public class Principal {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        
        //exercicio01();
        //exercicio02();
        exercicio03();


    }   

    public static void exercicio01(){

        System.out.println("Informe os 5 números: ");
        float media = 0;
        int[] valores = new int[5];


        for(int i = 0;i<valores.length;i++){
            System.out.println((i+1) + "º valor:");
            valores[i] = leitor.nextInt();
            media += valores[i];
        }
         media = media / 5;

         System.out.println("\nMédia dos valores: " + media);
         System.out.println("\nValores do vetor menor que a média: ");
         for(int i =0; i<valores.length;i++){
            if(valores[i]<media){
                System.out.println(valores[i] + "");
            }
         }
         System.out.println("\nValores do vetor maior que a média: ");
         for(int i =0; i<valores.length;i++){
            if(valores[i]>media){
                System.out.println(valores[i] + "");
            }
         }
         System.out.println("\nValores do vetor igual a média: ");
         for(int i =0; i<valores.length;i++){
            if(valores[i] == media){
                System.out.println(valores[i] + "");
            }
         }        

   
}

public static void exercicio02() {

    
    System.out.println("Informe quantos números quer armazenar: ");
    int quantidade = leitor.nextInt();
    int[] posicao = new int[quantidade];
    String tipo;

    for(int i = 0; i<quantidade; i++){
        System.out.println((i+1) + "° valor:");
        posicao[i] = leitor.nextInt();
       
    }
    System.out.println("exibir resultados:");
    for (int i = 0; i < quantidade; i++) {
        System.out.println(posicao[i] + ":");
        
        if (posicao[i]>0){
            System.out.println("positivo"); ;
        }
        else if(posicao[i]<0){
            System.out.println("negativo"); ;
        }
        else{
            System.out.println("zero"); ;
        }

    }
    }
 
    
public static void exercicio03() {
    System.out.println("Informe quantos números quer armazenar: ");
    int tamanho = leitor.nextInt();
    int[] valores = new int[tamanho];   
    int[] dobro = new int[tamanho];
    System.out.println("Leitura dos valores do vetor normal:");

    for (int i = 0; i < tamanho; i++) {
        System.out.println((i+1) + "° valor: ");
        valores[i]=leitor.nextInt();

        dobro[i]=valores[i]*2;
        
    }

    System.out.println("Exibindo valores do vetor dobro: ");
    for (int i = 0; i < tamanho; i++) {
        System.out.print(dobro[i] + " ");
        
    }
}


public static void exercicio06() {
    System.out.println("Digitar 5 notas e 5 pesos: ");
    float[] notas = new float[5];
    float[] pesos = new float[5];
    float media=0;
    float calculo=0;
    float somapesos=0;

    for (int i = 0; i < notas.length; i++) {
        System.out.println((i+1) + "° nota: ");
        notas[i] = leitor.nextInt();

        System.out.println((i+1) + "º peso: ");
        pesos[i]=leitor.nextInt();
        
    }

for (int i = 0; i < notas.length; i++) {
    calculo+=notas[i] * pesos[i];
    somapesos+= pesos[i];

    media = calculo / somapesos;

    System.out.println(media + ":");
    
}    
}
}






