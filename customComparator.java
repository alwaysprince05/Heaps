import java.util.Arrays;

class Student implements Comparable<Student>{
    int rno;
    double perc;
    String name;
    Student(int rno, double perc, String name){
        this.name = name;
        this.rno = rno;
        this.perc = perc;
    }
    public int compareTo(Student s){ //always try to put the name compareTo
        // return this.rno - s.rno; // menas 2 student compare ho gye on the basis of rollno.
        // return (int) (this.perc - s.perc); // on the basis on perc
        return this.name.charAt(0) - s.name.charAt(0); // on the basis of String and hm name ke index ko badha denge to uske index ke basis pr char ki sorting ho jayegi.
    }
}
public class customComparator {
    public static void print(Student[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i].name+" ");
            System.out.print(arr[i].perc+" ");
            System.out.println(arr[i].rno+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student(76, 89.5, "Raghav");
        s[1] = new Student(88, 78.1, "Prachi");
        s[2] = new Student(13, 95.8, "Arpit");
        s[3] = new Student(83, 50.3, "Himanshu");
        print(s);
        // Arrays.sort(); // hm yha pr directly ye nhi kr skte hai because hme custom comparater me batana padega ki hm sorting kis basis pr kr rhe hai.
        Arrays.sort(s);
        print(s);
    }
}
// Note -> hm string ke basis pr sorting nhi kr pate hai here string is name.
// and return karte time hme integer me typecasting karni hoti hai.