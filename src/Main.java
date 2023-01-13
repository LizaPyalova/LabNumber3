import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String res="";
        boolean flag=false;
        try {
            File file = new File("input.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line!=null){
                StringTokenizer st = new StringTokenizer(line, "\t\n\r,:-1234567890!@#%^$№?&*()_=+}{|/<>~;.");
                while(st.hasMoreElements()){
                    res+=st.nextToken()+" ";
                    flag=true;
                }
                line= reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(flag==false){
            System.out.println("Нет букв в тексте");
        }
        else {
            System.out.println(res);
        }
    }
}