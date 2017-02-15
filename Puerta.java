
package Singleton;
public class Puerta
{
    private static Puerta instancia;
    private Puerta() {
    }
     public static Puerta getInstancia()
    {
         if (instancia == null) {
             instancia = new Puerta();
            System.out.println("La puerta se creó\n");
        }
        else {
            System.out.println("Ya hay una puerta creada");
        }
         return instancia;
    }
}