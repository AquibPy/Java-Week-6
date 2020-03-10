import java.io.*;
public class ques5 {
    public static void main(String[] args) throws IOException {
        Product p[] =new Product[5];
        FileOutputStream fos = new FileOutputStream("E:\\MCA\\II nd Sem\\Java\\Week 6\\src\\item.txt",true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (int i = 0;i<2;i++)
        {
            p[i] = new Product();
            oos.writeObject(p[i]);
            oos.flush();
        }
        oos.close();
    }
}
class Product implements Serializable
{
    String p_code;
    float cost;
    int number;
    Product() throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Product Code:");
        p_code = stdin.readLine();
        System.out.println("Enter Cost:");
        cost = Float.parseFloat(stdin.readLine());
        System.out.println("Enter Number of Items:");
        number = Integer.parseInt(stdin.readLine());
    }
}