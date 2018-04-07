
package censorapp;

public class Censor {
    public boolean ifItsSugarFree(String text){
        boolean sugarFree = true;
        String tmpText = "";
        for(int i = 0; i < text.length(); i++){            
            String tmpChar = "" + text.charAt(i);
            System.out.println("actual char: "+tmpChar+" "+i);            
            if("s".equals(tmpChar) && "".equals(tmpText)){
                tmpText += text.charAt(i);
                System.out.println("actual string: "+tmpText);
            } else if("u".equals(tmpChar) && "s".equals(tmpText)){
                tmpText += text.charAt(i);
                System.out.println("actual string: "+tmpText);
            } else if("g".equals(tmpChar) && "su".equals(tmpText)){
                tmpText += text.charAt(i);
                System.out.println("actual string: "+tmpText);
            } else if("a".equals(tmpChar) && "sug".equals(tmpText)){
                tmpText += text.charAt(i);
                System.out.println("actual string: "+tmpText);
            } else if("r".equals(tmpChar) && "suga".equals(tmpText)){
                tmpText += text.charAt(i);
                System.out.println("actual string: "+tmpText);
                sugarFree = false;
                break;
            } else {
                sugarFree = true;
            }           
        }
        return sugarFree;
    }  
}
