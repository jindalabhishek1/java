import java.io.*;

class Directory
{
    public static void main(String [] args)
    {
        String fname = args[0];
        File f = new File(fname);
        if(f.exists())
        {
            if(f.isDirectory())
            {
                String file_list[] = f.list();
                for (int i = 0; i < file_list.length; i++)
                {
                    System.out.println(file_list[i]);
                }
            }
        }
    }
}
