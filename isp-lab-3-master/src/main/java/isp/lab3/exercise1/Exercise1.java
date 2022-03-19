package isp.lab3.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        Tree t1 = new Tree();
        System.out.println(t1.toString());
        for(int i=0;i<4;i++)
            t1.grow(i);
        System.out.println(t1);
    }
}
