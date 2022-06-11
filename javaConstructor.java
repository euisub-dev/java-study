class Food{
    public String mainFood = "";

    //생성자
    public Food(String mainFood){
        //this.mainFood 는 instance 변수를 가르키고 mainFood 변수는 instance화 할 때 던져주는 prameter값이다.
        this.mainFood = mainFood;
    }

    public void printMainFodd(){
        System.out.println(this.mainFood);
    }
}

public class javaConstructor {
    public static void main(String[] args) {
        /*
         *  생성자 와 this 의 개념에 대해 공부해보자.
         *  생성자 : instance화 할 때 초기값및 초기활동을 셋팅해주기 위함.
         *  개발자가 instance화 할 때 초기값이 필수인 class를 참조할때 초기값을 빠져먹지 않도록 하기 위함.
         *  this 는 해당 class의 instance 변수 및 메소드를 가르키는 표준(약속) 이다.
         */

        //Food f = new Food();
        //음식점의 음식중에 메인음식이 무조건 초기에 지정 되어야 한다고 가정할 때 
        //음식점을 만든 사람은 초기값을 지정해줘야 한다는 것을 알고 있지만 다음 음식점을 만들 사람은 모를 수 있기에 초기값을 설정 안하면 오류로 보이게 하면 초기설정을 해줘야 한다는 것을 인지할 것이다.
        //그래서 생성자를 사용한다.
        //위의 코드는 초기값을 설정 해 주지 않기 때문에 error 발생

        Food f = new Food("닭볶음탕");
        f.printMainFodd();
    }
}
