import java.io.*;

class FileSpaceWordLine
{
    public static void main(String [] args) throws IOException
    {
        try
        {
            FileInputStream fin = new FileInputStream(args[0]);
            int ch, n_ch = 0, words = 0, lines = 0;
            while ((ch = fin.read()) != -1)
            {
                n_ch++;
                if (ch == ' ')
                {
                    words ++;
                }
                if (ch == '\n')
                {
                    lines ++;
                }
            }
            System.out.println("Characters = " + n_ch + "\nWords = " + words + "\nLines = " + lines);
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
}
