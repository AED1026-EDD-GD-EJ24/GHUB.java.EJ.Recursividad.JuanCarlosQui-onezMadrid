package miPrincipal;
public class AppLadrillos{



    public static void menu(){
        System.out.println("Version iterativa");
        dibujar_pared_ite(10);
        System.out.println("Version Recursiva");
        dibujar_pared_rec(10);

        }
        public static void dibujar_pared_ite(int N){
            for(int i=0; 1<N ; i++){
                System.out.println("xxxxxxxxxxxxxxxxx");

        }

        public static void dibujar_pared_rec(int N){
            for(int i=0; 1<N ; i++){
                dibujar_pared_rec(N-1);
                System.out.println("xxxxxxxxxxxxxxxxx");
        }



    }

}