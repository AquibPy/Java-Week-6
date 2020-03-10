import java.io.*;

public class ques4 {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Employee Number:");
        int e_no = Integer.parseInt(stdin.readLine());
        System.out.println("Enter Employee Name:");
        String name = stdin.readLine();
        System.out.println("Enter Employee's Sex:");
        String sex = stdin.readLine();
        System.out.println("Enter Employee Gross Salary:");
        int gross_sal = Integer.parseInt(stdin.readLine());
        Employee e = new Employee(e_no,name,sex,gross_sal);

        FileWriter fw = new FileWriter("E:\\MCA\\II nd Sem\\Java\\Week 6\\src\\employee.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(e_no + ",");
        bw.write(name + ",");
        bw.write(sex + ",");
        bw.write(gross_sal + "\n");
        bw.close();
        System.out.println("Press 1 to add new Employee \n2. To delete an Employee \n3.To Update Salary of Employee \n4.To Display details of Employee");
        int choice = Integer.parseInt(stdin.readLine());
            if (choice == 1) {
                FileWriter fw1 = new FileWriter("E:\\MCA\\II nd Sem\\Java\\Week 6\\src\\employee.txt", true);
                BufferedWriter bw1 = new BufferedWriter(fw1);
                System.out.println("----------Enter Details of an Employee-----------");
                System.out.println("Enter Employee Number:");
                e_no = Integer.parseInt(stdin.readLine());
                System.out.println("Enter Name of an Employee:");
                name = stdin.readLine();
                System.out.println("Enter Employee's Sex");
                sex = stdin.readLine();
                System.out.println("Enter Gross Salary of an Employee");
                gross_sal = Integer.parseInt(stdin.readLine());
                Employee e1 = new Employee(e_no, name, sex, gross_sal);
                bw1.write(e_no + ",");
                bw1.write(name + ",");
                bw1.write(sex + ",");
                bw1.write(gross_sal + "\n");
                bw1.close();
            } else if (choice == 2)
            {
                System.out.println("Enter ENo of Employee");
                e_no = Integer.parseInt(stdin.readLine());
                String line;
                String st[];
                int f = 0;
                FileReader fr = new FileReader("E:\\MCA\\II nd Sem\\Java\\Week 6\\src\\employee.txt");
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw2 = new FileWriter("E:\\MCA\\II nd Sem\\Java\\Week 6\\src\\extract.txt");
                BufferedWriter bw2 = new BufferedWriter(fw2);
                while((line=br.readLine())!=null)
                {
                    st = line.split(",");
                    if (e_no == Integer.parseInt(st[0]))
                    {
                        f = 1;
                    }
                    else
                    {
                        bw2.write(Integer.parseInt(st[0]) + ",");
                        bw2.write(st[1] + ",");
                        bw2.write(st[2] + ",");
                        bw2.write(Integer.parseInt(st[3])+ "\n");
                    }
                }
                bw2.close();
                if (f == 0)
                {
                    System.out.println("Provided Employee Doesn't Exit !!!!!!!!");
                    fr.close();
                }
                if (f == 1)
                {
                    FileReader fr1 = new FileReader("E:\\MCA\\II nd Sem\\Java\\Week 6\\src\\extract.txt");
                    BufferedReader br1 = new BufferedReader(fr1);
                    FileWriter fw3 = new FileWriter("E:\\MCA\\II nd Sem\\Java\\Week 6\\src\\employee.txt");
                    BufferedWriter bw3 = new BufferedWriter(fw3);
                    while((line = br1.readLine())!= null)
                    {
                        bw3.write(line + "\n");
                    }
                    bw3.close();
                    br1.close();
                }
            } else if (choice == 3)
            {
                System.out.println("Enter E No of employee");
                e_no=Integer.parseInt(stdin.readLine());
                System.out.println("Enter New Gross Salary of employee");
                int new_sal=Integer.parseInt(stdin.readLine());
                String line2;
                String st2[];
                int f2=0;
                FileReader fru=new FileReader("E:\\MCA\\II nd Sem\\Java\\Week 6\\src\\employee.txt");
                BufferedReader bru=new BufferedReader(fru);
                FileWriter fw2u=new FileWriter("E:\\MCA\\II nd Sem\\Java\\Week 6\\src\\extract.txt");
                BufferedWriter bw2u=new BufferedWriter(fw2u);
                while((line2=bru.readLine())!=null)
                {
                    st2=line2.split(",");
                    if(e_no==Integer.parseInt(st2[0]))
                    {
                        f2=1;
                        bw2u.write(Integer.parseInt(st2[0])+",");
                        bw2u.write(st2[1]+",");
                        bw2u.write(st2[2]+",");
                        bw2u.write(new_sal+"\n");
                    }
                    else
                    {
                        bw2u.write(Integer.parseInt(st2[0])+",");
                        bw2u.write(st2[1]+",");
                        bw2u.write(st2[2]+",");
                        bw2u.write(Integer.parseInt(st2[3])+"\n");
                    }
                }
                bw2u.close();
                if(f2==0)
                    System.out.println("Provided Employee does not exist");
                fru.close();
                if(f2==1)
                {
                    FileReader fr2u=new FileReader("E:\\MCA\\II nd Sem\\Java\\Week 6\\src\\extract.txt");
                            BufferedReader br2u=new BufferedReader(fr2u);
                    FileWriter fw4u=new FileWriter("E:\\MCA\\II nd Sem\\Java\\Week 6\\src\\employee.txt");
                            BufferedWriter bw4u=new BufferedWriter(fw4u);
                    while((line2=br2u.readLine())!=null)
                    {
                        bw4u.write(line2+"\n");
                    }
                    bw4u.close();
                    br2u.close();
                }
            }

            else if (choice == 4)
            {
                System.out.println("Press 1 for individual Employee \nAny other number for all Employees");
                int chh = Integer.parseInt(stdin.readLine());
                String line3;
                String st3[];
                FileReader frd = new FileReader("E:\\MCA\\II nd Sem\\Java\\Week 6\\src\\employee.txt");
                BufferedReader brd = new BufferedReader(frd);
                if (chh == 1)
                {
                    int f2 =0;
                    System.out.println("Enter Employee Number:");
                    e_no = Integer.parseInt(stdin.readLine());
                    while ((line3 = brd.readLine())!=null)
                    {
                        st3 =line3.split(",");
                        if (e_no == Integer.parseInt(st3[0]))
                        {
                            f2 = 1;
                            System.out.println("Employee Number:" + st3[0] +"\nName:"+st3[1]+"\nSex:"+st3[2]+"\nGross Salary:" + st3[3]);
                        }
                    }
                    if (f2 ==0)
                    {
                        System.out.println("Given Employee Doesn't Exist !!!!!!");
                    }
                }
                else
                {
                    while ((line3 = brd.readLine())!=null)
                    {
                        st3 =line3.split(",");
                        System.out.println("Employee Number:" + st3[0] +"\nName:"+st3[1]+"\nSex:"+st3[2]+"\nGross Salary:" + st3[3]);
                    }
                }
                brd.close();
            }
            else
           {
                System.out.println("Please Enter Valid Choice!!!!!");
            }

    }
}

class Employee
{
    int e_no;
    String name;
    String sex;
    int gross_sal;
    Employee(int e_no,String name,String sex,int gross_sal) {
        this.e_no = e_no;
        this.name = name;
        this.sex = sex;
        this.gross_sal = gross_sal;
    }
}