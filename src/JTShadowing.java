public class JTShadowing {
    int x = 3;

    class Shadow{
        int x = 5;

        void metot(int x){
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("JTShadowing.this.x = " + JTShadowing.this.x);
        }
    }

    public static void main(String [] args){

        JTShadowing st = new JTShadowing();
        JTShadowing.Shadow shadow = st.new Shadow();
        shadow.metot(7);

    }

}
