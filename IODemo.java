import java.io.*;

class IODemo
{
    public static void main(String [] args) throws IOException
    {
        try
        {
            //DataInputStream ds = new DataInputStream(System.in);
            //System.out.println(ds.read());
            FileInputStream fin = new FileInputStream("Myfile.txt");
            //FileOutputStream fout = new FileOutputStream("Myfile.txt", true);//true for appending the text
            int ch;
            /*while((ch = (char)ds.read()) != '@')
            {
                fout.write(ch);
                //ch = (char)ds.read();
            }*/
            {
                while ((ch=fin.read() )!= -1)
                System.out.print((char)ch);
            }
        }
        catch(FileNotFoundException f)
        {
            System.out.println("File not found");
        }
    }
}
