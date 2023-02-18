public class Main {

    public static void main(String[] args) {
        int[][] array={
                {1,1,0,0,0,0,1,1},
                {1,1,0,1,1,0,1,1},
                {0,0,0,1,1,0,0,0},
                {1,1,0,1,1,0,1,1},
                {1,1,0,0,0,0,1,1}};//user input
        HeadCount example=new HeadCount(array);
        example.printAll();
    }
}
