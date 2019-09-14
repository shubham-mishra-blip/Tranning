import java.lang.StringBuffer;
public class PrintWithoutSemiColon {

    public static void main(String[] args) {

        int i = 0;
        StringBuffer sb = new StringBuffer();
        sb.appendCodePoint(59);

        if (System.out.printf("Hello Monster!! ")== null){}

        for (i = 1; i<2; System.out.println("Whats Up "+ String.valueOf(sb))){
            i++;
        }

    }
}
