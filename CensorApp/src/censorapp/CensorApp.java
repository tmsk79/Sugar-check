
package censorapp;


public class CensorApp {

    public static void main(String[] args) {
        Censor censor = new Censor();
        
        String a = "Test case with sugar in it";
        String b = "Test case without that sweet thing";
        
        boolean c = censor.ifItsSugarFree(a);
        boolean d = censor.ifItsSugarFree(b);
        
        System.out.println(c);
        System.out.println(d);
    }
    
}
