import java.util.Scanner;
public class Desafio02 {
    /*Para um ano ser bissexto ele deve ser m�ltiplo de 4, mas n�o ser m�ltiplo de 100 (com exce��o dos anos que forem m�ltiplos de 400).
Crie um programa com uma fun��o que receba um ano em uma vari�vel inteira, fa�a os testes para verificar se ele � bissexto, e retorne uma String dizendo �O ano informado � bissexto� ou �O ano informado n�o � bissexto).
A main do seu programa deve conter a digita��o do ano, a chamada da fun��o e a exibi��o do texto retornado.
     * */
    public static String ehBissexto(int ano) {
        if (ano % 4 == 0) {
            //Talvez seja bissexto
            if (ano % 400 == 0) {
                //Com certeza � bissexto, porque � m�ltiplo de 4 e de 400!
                return "O ano informado � bissexto";    
            }else if(ano % 100 == 0) {
                //N�o � bissexto, porque � multiplo de 4, � multiplo de 100, mas n�o � multiplo de 400!
                return "O ano informado n�o � bissexto";
            }
            //� bissexto, porque � multiplo de 4, n�o � multiplo de 400 e nem de 100
            return "O ano informado � bissexto";    
        }else {
            //N�o � bissexto porque n�o � divis�vel por 4
            return "O ano informado n�o � bissexto";
        }
    }
    public static void main(String[] args) {
        int ano;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor, digite o ano");
        ano = leitor.nextInt();
        System.out.println(ehBissexto(ano));
        leitor.close();
    }
}