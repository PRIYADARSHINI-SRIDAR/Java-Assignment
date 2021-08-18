class Student{
    int roll;
    String name;
    float marks;
    void input(int r,String n,float m){
        roll = r;
        name = n;
        marks = m;
    }
    void display()
    {
        System.out.println(roll + "" + name + marks);
    }
}
class Test{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.input(101,'Mark',95);
        s2.input(102,'Rose',99);
        s3.input(103,'Tina',98);
        s1.display();
        s2.display();
        s3.display();
        
        

    }
}