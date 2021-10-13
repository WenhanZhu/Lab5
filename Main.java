import java.util.ArrayList;
class Main {
  public static void main(String[] args) {

    Student student1 = new Student();
    Student student2=new Student();
    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");
    student2.setName("Wenhan Zhu");
    student2.setGPA(4.3);
    student2.setMajor("Information System");  
// or can do this with the dot operator
    //student1.name = "Arnold Spielberg";
    //student1.gpa = 4.0;
    //student1.major = "Electrical Engineering";

  student1.print();
  student2.print();

ArrayList<Double> gpas = new ArrayList<Double>();
gpas.add(student1.gpa);
gpas.add(student2.gpa);
double sum;
sum=0;
for(int i=0; i<gpas.size(); i++){
sum += gpas.get(i);
}
System.out.println("The average GPA is " + sum/gpas.size());
}


// or can do t his with the dot operator
    //System.out.println("student1's name is " + student1.name + " and their GPA is " + student1.gpa + " and their major is " + student1.major);
  
}
