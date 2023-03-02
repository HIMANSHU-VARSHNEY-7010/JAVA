package QUES_1;

public enum EnumClass {
    CAR(1200000), BIKE(125000), CYCLE(15000);
    private int price;
    private EnumClass(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
}
