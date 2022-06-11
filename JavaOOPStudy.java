public class JavaOOPStudy {
    public static void main(String[] args) {
        //..
        System.out.println("------");
        System.out.println("A");
        System.out.println("A");
        //..
        System.out.println("------");
        System.out.println("B");
        System.out.println("B");

        /*
         A를 출력하는 것과 B를 출력하는 로직이 있다 그 외에는 수 많은 소스들이 있다고 가정한다.
         같은 소스 한 메소드 안에 나열하는 것 보다 메소드로 묶어주는게 재사용성 및 유지보수에 효율적이다.
        */

        //..
        printStr("------", "A");
        //..
        printStr("------", "B");

        /*
         * 함수를 쓸 때 parameter도 보내기 싫다 그러면 전역변수를 활용하자.
         */

         //..
         delimiter = "------";
         str = "A";
         printStrNoPram();
         //..
         delimiter = "------";
         str = "B";
         printStrNoPram();

         /*
          * 전역변수를 사용하고, 서로 다른 메소드들을 같은 class 안에 남발하면 코드 분석하는데 시간을 많이 소요할 것이다.
          * pinStr 에 관련된 메소드 및 변수를 print 라는 class로 비슷한 기능들을 한곳에 모아두어서 코드 분석 및 객체지향에 한발짝 다가가자!
          */

          //..
          Print.delimiter = "------";
          Print.str = "A";
          Print.printClassStr();
          //..
          Print.delimiter = "------";
          Print.str = "B";
          Print.printClassStr();
    }

    public static void printStr(String pram_delimiter, String pram_str){
        /*
            구분자와 출력할 데이터를 prameter(매개변수)로 받아와 메소드를 재사용 할 수 있다.
        */
        System.out.println(pram_delimiter);
        System.out.println(pram_str);
        System.out.println(pram_str);
    }

    public static String delimiter = "";
    public static String str = "";
    public static void printStrNoPram(){
        /*
            전역변수를 활용할 수 도 있다.
            하지만 전역변수를 쓸 때 잘 알고 써야한다.

            전역 변수의 문제점
            - 전역 변수는 모든 코드가 전역 변수를 참조할 수 있는 암묵적 결함을 허용한다.
              즉, 유효 범위가 크면 코드의 가독성이 나빠지고 의도치 않게 상태가 변경되어 위험성이 높아진다.

            - 긴 생명주기 
              : 전역 변수는 지역변수와 다르게 return을 할 수 없어 로직이 시작되고 끝날 때 까지 메모리를 사용하고 있는다.

            전역 변수 사용시 다른 개발자가 봐도 용도를 알 수 있게 설명을 잘 달고, 용도에 맞게만 사용해야한다.
        */
        System.out.println(delimiter);
        System.out.println(str);
        System.out.println(str);
    }
}

/*
 * class를 사용함으로 코드의 가독성을 높이고 유지보수 및 재사용에 용의함.
 * 서로 다른 class 들을 같은 java file에 있는 것보다 다른 class 파일로 두고 참조하여 쓰는 것이 좋다.
 */
class Print{
    public static String delimiter = "";
    public static String str = "";

    public static void printClassStr(){
        System.out.println(delimiter);
        System.out.println(str);
        System.out.println(str);
    }
}