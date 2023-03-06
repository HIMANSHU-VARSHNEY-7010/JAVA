package QUES_1;

public enum AutoMobiles {
    CAR(1200000), BIKE(125000), CYCLE(15000);
    private int price;
    private AutoMobiles(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
}
