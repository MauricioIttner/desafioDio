import java.util.Scanner;

public class contador {
    public static void main(String[] args) throws ParametrosInvalidosException {

        Scanner sc = new Scanner(System.in);
        
        int x =sc.nextInt();
       
        int y = sc.nextInt();
        try{
            
            contar(x, y);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
        sc.close();

    }

    static void contar(int x, int y)throws ParametrosInvalidosException{
        
        if(x < y){
            int contagem = y - x;
            for(int i = 1; i<=contagem;i++){
                System.out.println(i);
            }
        }else{
            throw new ParametrosInvalidosException();

        }
    }
}
