/*          ATIVIDADE 20-11-2018 AULA 02

Cadastrar o nome, idade e renda das pessoas no municipio
A) Media das Idades
B) Media da renda

*/

package municipio;

import java.util.Scanner;

public class Municipio {

    public static void main(String[] args) {
        //Atributos = variáveis
        String nome;
        int idade;
        char sexo;
        double renda;
        
        //Objeto para leitura(entrada pelo terminal) de dados        
        Scanner pegar = new Scanner(System.in);
        
        //Entrevistando 1ª pessoa
        Pessoa pessoa1 = new Pessoa(); //pessoa1 é do tipo Pessoa, não pode ser tipo inteiro, string, etc...
        System.out.println("Informe seu nome: ");
        pessoa1.nome = pegar.next();
        System.out.println("Informe sua idade: ");
        pessoa1.idade = pegar.nextInt();
        System.out.println("Informe sua renda: ");
        pessoa1.rendaFixa = pegar.nextDouble();
        System.out.println("Informe seu sexo: ");
        pessoa1.sexo = pegar.next() .charAt(0);
        
        //Entrevistando 2ª pessoa
        Pessoa pessoa2 = new Pessoa(); //pessoa2 é do tipo Pessoa, não pode ser tipo inteiro, string, etc...
        System.out.println("Informe seu nome: ");
        pessoa2.nome = pegar.next();
        System.out.println("Informe sua idade: ");
        pessoa2.idade = pegar.nextInt();
        System.out.println("Informe sua renda: ");
        pessoa2.rendaFixa = pegar.nextDouble();
        System.out.println("Informe seu sexo: ");
        pessoa2.sexo = pegar.next() .charAt(0);

        //Entrevistando 3ª pessoa
        Pessoa pessoa3 = new Pessoa(); //pessoa3 é do tipo Pessoa, não pode ser tipo inteiro, string, etc...
        System.out.println("Informe seu nome: ");
        pessoa3.nome = pegar.next();
        System.out.println("Informe sua idade: ");
        pessoa3.idade = pegar.nextInt();
        System.out.println("Informe sua renda: ");
        pessoa3.rendaFixa = pegar.nextDouble();
        System.out.println("Informe seu sexo: ");
        pessoa3.sexo = pegar.next() .charAt(0);        
        
        //Printando uma pessoa = Posição de memória
        System.out.println(pessoa1);
        
        //Criando um vetor para salvar o objeto
       Pessoa[] listaPessoas = {pessoa1, pessoa2, pessoa3} ;
       //Calculo de Media das Idades;
       int totalIdade = 0, quantidade = 0;
       for (Pessoa p : listaPessoas){
           totalIdade = totalIdade + p.idade; 
           quantidade = + quantidade + 1;
        }
       
       float mediaIdade = (float)totalIdade / quantidade;
        System.out.printf("%.2f" ,mediaIdade);
    
    }
}