public class methodProgram {
    static int naeeb(int x, int y){
        int z;
        if (x>y){
            z = (x+y);
        }else {
            z = x-y;
        }

        return z;
    }
    public static void main(String[] args){
        int a =  5;
        int b = 10;
        int z= naeeb(a,b);
        System.out.println(z);
    }
}
