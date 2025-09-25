package implementaciones;

/**
 * Main solo para pruebas propias.
 * 
 * @author 267826
 */
public class main {

    public static void main(String[] args) {
        ArrayList arrayInteger = new ArrayList<>(Integer.class, 5);
        arrayInteger.append(1);
        System.out.println(arrayInteger.indexOf(1));
        arrayInteger.remove(1);
        
        ArrayList arrayString = new ArrayList<>(String.class, 5);
        arrayString.append("Rebecca Paola Valenzuela Aguirre");
        System.out.println(arrayString.indexOf("Rebecca Paola Valenzuela Aguirre"));
        arrayString.remove("Rebecca Paola Valenzuela Aguirre");
    }

}
