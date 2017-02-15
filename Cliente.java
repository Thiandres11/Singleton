
package Singleton;

import java.util.Scanner;
public class Cliente
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner (System.in);
        System.out.println("Escriba un numero aleatorio");
        int numero= stdin.nextInt(); 
        for(int num=1; num<=numero; num++)
        {
            Puerta.getInstancia();
        }
    }
}
