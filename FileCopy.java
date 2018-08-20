import java.io.*;

class FileCopy
{
    public static void main(String [] args) throws IOException
    {
        try
        {
            FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1]);
            int ch;
            while((ch = fin.read()) != -1)
            {
                fout.write((char)ch);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        finally
        {
            fin.close();
            fout.close();
        }
    }
}
