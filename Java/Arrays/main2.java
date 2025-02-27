package Arrays;
public class main2 {
    public static void main(String args[]) {
        StringBuilder s = new StringBuilder("HOLA PEPE");
        System.out.println(s);
        s.replace(5,9,"JOSEFINA");
        System.out.println(s);
        
        StringBuilder t= new StringBuilder();
        t.append("ADIOS PEPE");
        System.out.println(t);
        
        t.insert(6,"Y NO VUELVAS ");
        System.out.println(t);
        
        t.delete(6,19);
        System.out.println(t);
        
        System.out.println(t.reverse());
        
        System.out.println(t.toString());
        }
}
