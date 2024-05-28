package Pessoal.Tests;
import java.util.Scanner;
import Pessoal.Tests.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        int n2 = sc.nextInt();

        try{
            contar(n1, n2);
        }
        catch (ParametrosInvalidosException e){
            System.out.println("O segundo número precisa ser maior que o primeiro");
        }

    }
    static void contar(int n1, int n2) throws ParametrosInvalidosException {
        if(n1 > n2 || n1 == n2)
            throw new ParametrosInvalidosException();


        int contagem = n2 - n1;

        for(int i = 0;i < contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }

    }

}
