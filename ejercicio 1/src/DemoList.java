import java.util.ArrayList;

public class DemoList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(30);
        nums.add(30);
        nums.add(40);
        nums.add(26);
        nums.add(25);

        int suma = 0;
        for (int numero : nums) {
            suma += numero;
        }
        System.out.println("La suma de los nums es: " + suma);

        for (int num : nums) {
            System.out.println(num);
        }
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(i + " : " + nums.get(i));
        }

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("valentina");
        nombres.add("Sofia");
        nombres.add("Ana");
        nombres.add("Andres");

        System.out.println("for:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }

        System.out.println("for each:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.println("while:");
        int i = 0;
        while (i < nombres.size()) {
            System.out.println(nombres.get(i));
            i++;
        }
    }
}

