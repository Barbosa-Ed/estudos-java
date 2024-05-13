public class Operadores {
    public static void main(String[] args) {
        
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        double divisao = 10 / 3;
        int modulo = 17 % 3;
        double resultado = (10 * 7) + (20 / 4);

        // em strings o operador + também realiza concatenações

        //operadores ternarios
        // <expressão condicional> ? <caso seja true> : <caso seja false>
        int a = 5, b = 6;
        
        //exemplo de estrutura IF/ELSE
        if (a==b) {
            System.out.println("Verdadeiro!\n");
        }else{
            System.out.println("Falso!");
        }
        // tambem pode ser escrito como
        System.out.println(a==b ?"Verdadeiro!" : "Falso!"); //tambem pode-se atribuir valores como: String resultado = a==b ?"Verdadeiro!" : "Falso!"
    }
}
