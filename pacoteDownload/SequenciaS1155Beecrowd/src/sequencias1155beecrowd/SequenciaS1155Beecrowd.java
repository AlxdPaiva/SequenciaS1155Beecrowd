package sequencias1155beecrowd;
public class SequenciaS1155Beecrowd {
    public static void main(String[] args) {
        float S = 1;
        for (float i = 2; i <= 100; i++) {
            S = (S + (1/i));            
        }
        System.out.printf("%.2f", S);
        System.out.println("");
    }
    
}
