import java.io.FileWriter;
import java.io.IOException;

/**
 * JavaClassStudy
 */
public class JavaClassStudy {

    public static void main(String[] args) throws IOException {
        //생활코딩 객체지향 강의 

        //class : System, Math, FileWriter
        //instance : f1, f2

        //수업을 통해 class 와 instance의 개념을 정의함.
        //class : 연관된 주제의 메소드 및 변수들의 그룹을 class라 정의함.
        //instance : class 의 연결 변수라 정의함

        System.out.println(Math.PI);
        System.out.println(Math.min(10, 7));

        FileWriter f1 = new FileWriter("data.txt");
        f1.write("Hello");
        f1.write(" JAVA");
        f1.close();
        
        //-----------------------------------------------------------
    }
}