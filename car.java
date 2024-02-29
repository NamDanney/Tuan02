public class car {
    int id;
    String name;
    public car(int id, String name){
        this.id = id;
        this.name= name;
    }

    public static void main(String[] args) {
        car car1 = new car(1, "BMW");
        car car2 = new car(2, "KALU");
    }
}
