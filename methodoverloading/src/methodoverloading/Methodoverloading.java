package methodoverloading;

public class Methodoverloading {

    static int max(int x, int y)
    {
        return x>y?x:y;
    }
    
    static float max(float x, float y)
    {
        return x>y?x:y;
    }
    public static void main(String[] args) {
        System.out.println(max(10.5f, 5.4f));
    }
    
}
