class PrintIns{
    public String delimiter = "";
    public String str = "";
    public void printStr(){
        System.out.println(delimiter);
        System.out.println(str);
        System.out.println(str);
    }
}

public class javaInstanceStudy {
    public static void main(String[] args) {
        /*
         * 전시간에 class를 통해 비슷한 메소드 및 변수들을 묶어 사용하여 데이터를 처리하는 소스를 공부를 하였다.
         * class로 묶어 class 자체의 변수 및 메소드를 사용하려고 하다보면 같은 기능이지만 변수의 값이 변경 되어야 할 때 매변 변경해줘야 하는 문제가 발생한다.
         * 이러한 문제를 없애주는 것이 바로 instance 이다.
         * instance란 class의 변수 및 메소드들을 다 사용할 수 있지만 class 자체의 변수 및 메소드를 사용하는 것이 아닌 복제하여 사용하는것.
         * 
         * 생활코딩 댓글에 좋은 예가 있어 적어봅니다.
         * -- class 와 instance의 개념
         * 하나님이 '인간' 이라는 class를 만들었습니다. 그 class 안에 눈,코,입 등등의 메소드 및 변수들이 있습니다.
         * 하나님이 '인간' 이라는 class를 통해 각각의 재료 및 값이 다른 '인간'을 만들고 싶어했고, 매번 '인간' 이라는 class의 메소드 및 변수값을 변경하면서 만들기에는 가독성도 떨어지고, 위험부담도 존재했습니다.
         * 그래서 하나님은 '인간' 이라는 class의 변수 및 메소드에는 영향이 안가는 instance 기능을 통해 각각의 서로 다른 '인간'을 만들 수 있었습니다.
         * 
         * instance화 의 예
         * ex) 인간 철수 = new 인간();  --> 철수.눈 = "초롱초롱", 철수.입 = "두껍게"...
         *     인간 영희 = new 인간();  --> 영희.눈 = "반짝반짝", 영희.입 = "얇게" ...
         * 
         * instance를 사용하지 않고 class 자체를 사용하게 된다면
         * 인간.눈 = "초롱초롱", 인간.입 = "두껍게" ...
         * ....
         * 인간.눈 = "반짝반짝", 인간.입 = "얇게" ...
         * ....
         * 이런식으로 작성을 해야하는데 가독성이 현저하게 떨어지게 된다.
         */

         //instance

         PrintIns printInstanceA = new PrintIns();
         printInstanceA.delimiter = "-------";
         printInstanceA.str = "A";

         PrintIns printInstanceB = new PrintIns();
         printInstanceB.delimiter = "******";
         printInstanceB.str = "B";

        printInstanceA.printStr();
        printInstanceB.printStr();
        printInstanceA.printStr();
        printInstanceB.printStr();
    }
}
 