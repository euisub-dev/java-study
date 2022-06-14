class Menu{
    public String mainFood = "";

    public Menu(String mainFood){
        //생성자
        this.mainFood = mainFood;
    }

    public void mainFoodPrint(){
        System.out.println(this.mainFood);
    }
}

public class javaBlog {
    public static void main(String[] args) {
        // Menu m = new Menu(); -- Error 생성자를 통해 초기값을 셋팅 해줬는데 instance화 할 때 초기값을 지정하지 않음

        Menu m = new Menu("라면");
        m.mainFoodPrint(); //결과값 -- 라면
    }
}
