import java.io.*;
public class buf
{
    public static void main(String[] args) throws IOException
    {
        String name;
    	InputStreamReader in = new InputStreamReader(System.in); 
        BufferedReader reader =
                   new BufferedReader(in);
        System.out.println("type 'stop' to exit");
        do{
            name = reader.readLine();
            System.out.println(name);
        }while(!name.equals("stop"));
    }
}
