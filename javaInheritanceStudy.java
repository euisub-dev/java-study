class Cal{
    public int sum(int x, int y){
        return x + y;
    }

    // Overloading
    public int sum(int x, int y, int z){
        //이름이 같은 메소드를 인자값을 다르게 해 정의함. 이것을 Overloading 이라고 함.

        //this 자기자신
        //this로 Cal(자기자신) class내의 sum 함수를 사용하고 그 결과값에 z를 더한 것
        return this.sum(x,y)+z;
    }
}

class Cal2 extends Cal{
    // java 에서 상속기능을 사용할 때 extends를 입력한다.
    // Cal 을 상속받음
    // Cal은 부모 Class, Cal2 는 Cal의 자식 Class
}

class Cal3 extends Cal{
    // java 에서 상속기능을 사용할 때 extends를 입력한다.
    // Cal 을 상속받음
    // Cal은 부모 Class, Cal3 는 Cal의 자식 Class

    //부모 Class의 기능을 재정의 할 수 있음 이것을 Overrinde, Overriding 이라고 함.
    // Overriding
    public int sum(int x, int y){
        System.out.println("재정의");

        //super : 부모 접근
        //super 를 통해 부모 Class의 sum함수를 사용함.
        return super.sum(x,y);
    }
}


// 상속과 생성자
class CalCons{
    int x,y;
    CalCons(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class CalCons2 extends CalCons{
    // 상속받을 class에 생성자가 있을 시 자식 Class에서 부모 class 생성자를 셋팅해줘야 함.
    CalCons2(int x, int y){
        super(x, y);
    }
}

public class javaInheritanceStudy {
    public static void main(String[] args) {
        //생활코딩 java 상속 공부
        //상속 : 변수 및 메소드를 자식 class에서 사용할 수 있도록 하는 기능
        //왜 사용하는가? : 서로 다른 class에서 같은 기능을 가진 변수 및 메소드를 정의해야 할 때 하나의 부모 class로 관리하는게 용이함.
        //ex) 게임 캐릭터 전사,도적,마법사 class 가 존재함 
        // class 전사 , class 도적, class 마법사 
        // 기본적으로 점프, 걷기등의 함수는 3개의 class에 동일한 기능을 가진다.
        // 상속의 기능을 사용하지 않으면 각각의 class에 같은 기능의 변수 및 메소드를 정의해야하는데 이렇게 정의하면 나중에 유지보수 및 코드분석이 어려워진다.
        // 그래서 상속의 기능을 통해 부모 class에 공통된 기능을 가진 변수 및 메소드를 정의하고 상속받아 사용하는 것이 유지보수 및 코드분석에 용이함.
        // 또 나중에 캐릭터에 공통된 기능을 추가해야 할 때 부모 class에 한번 만 추가해주면 된다. --> 확장성 용이
        // 새로운 캐릭터를 출시할 때 공통된 기능은 다시 개발 할 필요없이 부모 class 상속받아서 쓰면 된다. --> 재사용 용이

        //Cal2에 아무런 기능이 없지만 Cal을 상속받아 Cal의 있는 기능을 사용할 수 있음
        Cal2 c2 = new Cal2();
        System.out.println("cal2 class = "+c2.sum(2, 1));

        // Overriding, Overloading
        // Overriding  : 부모 Class의 기능(메소드)을 재정의
        // Overloading : class 이름이 같은 메소드를 인자값 및 형태 변경 후 재정의


        // this 와 super
        // this : 자기자신 , super : 부모
    }
}


// blog 에 상속의 개념 및 왜 사용하는지에 대한 글 쓸때 소스 참조 메모장 겸용 사용 -------

class ParentsClass{
    public int sum(int x, int y){
        return x + y;
    }
}

class ChildClass extends ParentsClass{
    // extends 키워드로(약속) ParentsClass 상속받음
    // 부모 class = ParentsClass, 자식 Class = ChildClass
}

class 공통{
    public void jump(){
        System.out.println("점프");
    }

    // Overloading
    public String jump(String action){
        System.out.println("점프");
        return action;
    }
}

class 전사 extends 공통{
    // Overriding
    public void jump(){
        System.out.println("점프");
        System.out.println("돌진");
    }
}

class 도적 extends 공통{
    
}

class 마법사 extends 공통{
    
}
