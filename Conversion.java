public class Conversion {
    /**Conversie van numerieke String naar int*/
    public static int toInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 10 + (s.charAt(i) - '0');
        }
        return result;
    }
    
    /*Je kunt ook Integer.parseInt(s) of Integer.valueOf(s) gebruiken, maar
    bovenstaande is de meest basale source code.
    
    //Conversie van String naar int
    public static int intString(String s) {
        return Integer.parseInt(s);
    }
    
    //Conversie van String naar int
    public static int intString(String s) {
        return Integer.valueOf(s);
    }
    */
    
    /**Conversie van array van numerieke Strings naar int - concatenated*/
    public static int toInt(String[] s) {
        int result = 0;
        for (int i = 0; i < s.length; i++) {
            result = Conversion.toInt(result + s[i]);
        }
        return result;
    }
    
    /**Conversie van array van numerieke Strings naar int - opgeteld*/
    public static int toIntSum(String[] s) {
        int result = 0;
        for (int i = 0; i < s.length; i++) {
            result += Conversion.toInt(s[i]);
        }
        return result;
    }
    
    /**Conversie van numeriek character naar int*/
    public static int toInt(char ch) {
        return ch - '0';   //Impliciete casting naar int
    }
    
    /**Conversie van array van numerieke characters naar int - concatenated*/
    public static int toInt(char[] ch) {
        int result = 0;
        for (int i = 0; i < ch.length; i++) {
            result = result * 10 + (ch[i] - '0');
        }
        return result;
    }
    
    /**Conversie van array van numerieke character naar int - opgeteld*/
    public static int toIntSum(char[] ch) {
        int result = 0;
        for (int i = 0; i < ch.length; i++) {
            result += ch[i] - '0';
        }
        return result;
    }
}
