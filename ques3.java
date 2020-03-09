import java.io.*;

public class ques3 {
    public static void main(String[] args) {
        try
        {
            File f1 = new File("E:\\MCA\\II nd Sem\\Java\\Week 6\\src\\poem.txt");
            int count =0;
            BufferedReader br = new BufferedReader(new FileReader(f1));
            String str;
            while ((str=br.readLine())!=null)
            {
                count=count+str.toCharArray().length;
            }
            System.out.print(count);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
