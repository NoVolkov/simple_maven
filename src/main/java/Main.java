public class Main {
    private int x=1,y=2;

    public Main() {}

    public Main(int x, int y){
        this.x=x;
        this.y=y;
    }

    public static void main(String[] args) {
		System.out.println("Ну, здарова!");
    }

    public int getSum(){
        return x + y;
    }
}
