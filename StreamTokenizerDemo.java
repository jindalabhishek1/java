import java.io.*;

class StreamTokenizerDemo
{
    public static void main(String [] args) throws IOException
    {
        FileReader fr = new FileReader("Sample_Text.txt");
        StreamTokenizer st = new StreamTokenizer(fr);
        double sum = 0.0;
        int numWords = 0, numChars = 0, numLines = 1, check = 0;
        st.eolIsSignificant(true);
        while (st.nextToken() != st.TT_EOF)
        {
            if (st.lineno() != check)
            {
                System.out.println(st.lineno());
                check ++;
            }
            //System.out.println("Token Type = " + st.ttype);
            if(st.ttype == StreamTokenizer.TT_EOL)
            {
                numLines ++;
            }
            else if (st.ttype == StreamTokenizer.TT_NUMBER)
            {
                sum += st.nval;
                //System.out.println("Token = " + st.nval);
            }
            else if (st.ttype == StreamTokenizer.TT_WORD)
            {
                numWords ++;
                numChars += st.sval.length();
                //System.out.println("Token = " + st.sval);
            }
        }
        System.out.println("Numbers in the file = " + sum);
        System.out.println("Words in the file = " + numWords);
        System.out.println("Characters in the file = " + numChars);
        System.out.println("Lines in the file = " + numLines);
    }
}
