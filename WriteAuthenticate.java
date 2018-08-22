import java.io.*;

class WriteAuthenticate
{
    public static void main(String [] main) throws IOException
    {
        FileWriter fw = new FileWriter("Authentication.txt", true);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedWriter bw = new BufferedWriter(fw);
        System.out.print("Enter UserName: ");
        char ch;
        while ((ch = (char)isr.read()) != '\n')
        {
            bw.write(ch);
        }
        bw.write(":");
        System.out.print("Password: ");
        while ((ch = (char)isr.read()) != '\n')
        {
            bw.write(ch);
        }
        bw.write("\n");
        bw.close();
        fw.close();
    }
}
