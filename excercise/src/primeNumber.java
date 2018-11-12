public class primeNumber {
    public static void main(String []args) throws Exception{
        for(int i=2;i<100;i++){
//            i = 25;
            int j;
            for(j=2;j<=Math.sqrt(i);j++){
                if(i%j==0)
                    break;
            }
            if(j>Math.sqrt(i))
                System.out.println(i);
        }
    }
}
