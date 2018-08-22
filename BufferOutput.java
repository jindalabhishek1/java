import java.io.*;

class BufferOutput
{
    public static void main(String [] args) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        FileOutputStream fout = new FileOutputStream("myfile.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout, 512);
        char ch;
        while ((ch = (char)dis.read()) != '@')
        {
            bout.write(ch);
        }
        dis.close();
        bout.close();
        fout.close();
    }
}
