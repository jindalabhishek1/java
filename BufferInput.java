import java.io.*;

class BufferInput
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter FileName: ");
        String fname = br.readLine();
        FileInputStream fin = null;
        try
        {
            fin = new FileInputStream(fname);
        }
        catch(FileNotFoundException fe)
        {
            System.out.println(fe);
        }
        BufferedInputStream bin = new BufferedInputStream(fin);
        int ch;
        while ((ch = bin.read()) != -1)
        {
            System.out.print((char)ch);
        }
        bin.close();
    }
}
