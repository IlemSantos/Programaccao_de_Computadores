/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Programa para calcular a área de uma casa(e seus cômodos:uma sala de 11X11m,
 * um banheiro e um quarto de 5.5X7m cada) é uma piscina.
 * Programa com o uso de Métodos.
 * @author Ilem Santos
 * @version 3
 */
class AreaCasa {
    //Método areaCasa
    static void areaCasa(){
        /*O que o significa o void? Que o método não retornar nenhum valor.Ele apenas executa a tarefa e termina.*/ 
	float lateral = 11;
	float cquarto = 7;
	float areaq;
	float areas;
	float areat;

	System.out.println("Programa para cálculo da área da casa e da piscina");
	areas =lateral*lateral;
	System.out.println("A área da sala é "+areas);
	areaq = cquarto*(lateral/2);
	System.out.println("A área do quarto é "+areaq);
	System.out.println("A área do banheiro é "+areaq);
	areat= areas + 2*areaq;
	System.out.println("A área total é "+areat);
    }

    //Método areaPiscina
    static double areaPiscina(){
        /*O que significa o double? Que o método irá retornar um valor do tipo double.Semelhante ao pow(a,b).*/
	double raio = 2;
	return(Math.PI * Math.pow(raio,2));
        /*E o return? É quando o valor é efetivamente retornado.Asubrotina para aí.*/
    }
         
    public static void main(String[] args){
	double areap;
		
	areaCasa(); //a partir deste ponto,chamar o método areaCasa é executar o método.
						
	areap = areaPiscina(); //Note que areaPiscina() retorna valor,então guardamos esse valor em areap
		
	System.out.println("A área da piscina é "+areap);
   }
}
