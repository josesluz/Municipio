/*          ATIVIDADE 20-11-2018 AULA 02

Cadastrar o nome, idade e renda das pessoas no municipio
A) Media das Idades
B) Media da renda

*/

package municipio;

public class Pessoa {
    
    //Características = variáveis = atributos
    String nome;
    int idade;
    char sexo;
    double rendaFixa;
    
    //Funcionalidades = Métodos
    public void rendaAnual(){
        double resultado = this.rendaFixa * 12;
        System.out.println(resultado);
    }
            
}
