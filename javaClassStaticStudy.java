class PrintStaticTest{
    public static String classData = "class";
    public String instanceData = "instance";

    public static void classMethod(){
        System.out.println(classData);
        // System.out.println(instanceData); 
        // 위의 주석 코드 error 발생.
        // static 메소드 안에 instance 변수를 사용할 수 없음
        // static 메소드 안에는 static 변수 즉 class 메소드 안에는 class 변수만 사용 가능함.
    }

    public void instanceMethod(){
        System.out.println(classData);
        System.out.println(instanceData);
    }
}

public class javaClassStaticStudy {
    public static void main(String[] args) {
        /*
         * 지금까지 class 와 instance의 개념과 왜 사용하는지에 대해 공부를 했다.
         * 여기서 알아두어야 할 것이 static 이란 개념인데 일단 간략하게 알아두고 좀 더 공부가 되었을 때 깊게 파고들어보자.
         * class 안에 static 변수 및 메소드는 class의 변수 및 메소드 이다.
         * static 이 없는 변수 및 메소드는 instance 를 위한 변수 및 메소드 이다.
         * 예문을 통해 이해해 보자.
         * 
         * Print 라는 class 안에 public static String classData = "" 라는 변수와 public String instanceData = "" 라는 변수가 있다고 가정한다면
         * class 자체로 instanceData를 변경 및 사용 할 수 없으며 
         * instance로 classData를 변경하면 classData는 class 자체의 변수이기 때문에 Print 의 class를 instance한 모든 classData의 변수값이 바뀐다.
         * 
         * 코드를 통해 이해해 보자.
         */

        PrintStaticTest.classData = "AAAA";
        //PrintStaticTest.instanceData = "AAAA"; 
        // 위의 주석 코드 error 발생 -> class 자체로 instance 변수의 값을 변경 할 수 없음
        PrintStaticTest.classMethod();  // 결과 'AAA'

        PrintStaticTest p1 = new PrintStaticTest();
        p1.classData = "Change by p1 instance";
        p1.instanceData = "BBB";
        p1.classMethod();
        p1.instanceMethod();

        PrintStaticTest.classMethod();  //결과 'Change by p1 instance' 로 변경 됨.

        PrintStaticTest p2 = new PrintStaticTest();
        p2.instanceMethod(); // classData 의 값이 'Change by p1 instance'인것 확인.

    }
}
