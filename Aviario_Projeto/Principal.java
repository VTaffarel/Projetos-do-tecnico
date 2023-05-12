import java.util.Scanner;
import Classes.Baia;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);
		ArrayList<Baia> listaBaia = new ArrayList<>();
		//contador de numero de baias
		int numeroBaia = 1;
		int op, opb,baia;
		
		do {
	   System.out.println("======= MENU ================");
	   System.out.println("==                         ==");
	   System.out.println("== 1. adicionar lote       ==");
	   System.out.println("== 2. ver lote             ==");
	   System.out.println("== 3. excluir lote         ==");
	   System.out.println("== 4. pesquisar lote       ==");
	   System.out.println("==                         ==");
	   System.out.println("=============================");
	   System.out.println("== 10. sair                ==");
	   System.out.println("=============================");

       op = leia.nextInt();
	   
		switch(op)
		{
			case 1:
					
				   Baia b = new Baia(numeroBaia);
				   numeroBaia +=1;
				   System.out.println("======= MENU =======");
				   System.out.println("Para comecar informe quantos frangos existem em seu lote!");
				   System.out.println("");
				   System.out.println("Quantidade de frangos:  ");
				   int numgalinhas = leia.nextInt();
				   b.setQuantidadedegalinhas(numgalinhas);
				   b.getQuantidadedegalinhas();
				   System.out.println("");
				   System.out.println("");

				   System.out.println("======= MENU =======");
				   System.out.println("Agora informe qual a idade de abate dos frangos");
				   System.out.println("");
				   System.out.println("Idade de abate:  ");
				   float abate = leia.nextFloat();
				   b.setIdadeAbate(abate);
				   b.getIdadeAbate();
				   System.out.println("");
				   System.out.println("");

			       System.out.println("======= MENU =======");
				   System.out.println("Agora vamos calcular o peso total da sua baia");
				   System.out.println("");
				   System.out.println("Para calcularmos o peso total subtraimos o ");
				   System.out.println("peso final pelo peso inicial");
				   System.out.println("");
				   System.out.println("Qual o peso inicial? ");
				   float pI = leia.nextFloat();
				   b.setpI(pI);
				   b.getpI();
				   System.out.println("");
				   System.out.println("");

				   
				   
				   System.out.println("======= MENU =======");
				   System.out.println("");
				   System.out.println(" Qual o peso final? ");
				   float pF = leia.nextInt();
				   b.setpF(pF);
				   b.getpF();
			       
                   float pT = b.getpF() - b.getpI();	
				   b.setpT(pT);

				   			  

				   float pD;
				   pD = b.getpT() / b.getIdadeAbate();
				   b.setpD(pD);
				  
				   
				   
                   System.out.println("======= MENU =======");
				   System.out.println("O peso total da baia ===> " + pT);
				   System.out.println("");
				   System.out.println("");
				   
				   
				   System.out.println("======= MENU =======");
				   System.out.println("");
				   System.out.println("Com os dados ja fornecidos ");
				   System.out.println("podemos fazer outros calculos");				  
				   System.out.println("como o peso diario do seu lote");
				   System.out.println("onde dividimos o peso total pela idade de abate");	
				   System.out.println("pesodiario = " + pD);	

				   System.out.println("");
				   System.out.println("");


				   
				   System.out.println("======= MENU =======");
				   System.out.println("Agora vamos  calcular o consumo de raçao da sua baia");
				   System.out.println("");
				   System.out.println("para isso subtraimos a racao fornecida pelas sobras");
				   System.out.println("");

				   System.out.println("Qual a quantidade de racao fornecida? ");
				   float rF = leia.nextInt();
				   b.setrF(rF);
				   b.getrF();
				   System.out.println("");
				   System.out.println("");
				   
				   System.out.println("======= MENU =======");
				   System.out.println("");
				   System.out.println("Qual a quantidade de sobras da baia? ");
				   float sobras = leia.nextInt();
				   b.setSobras(sobras);
				   b.getSobras();
				   
				   float cR = b.getrF() - b.getSobras();
				   b.setcR(cR);

				   System.out.println("");
				 
				   
				   

				   System.out.println("======= MENU =======");
				   System.out.println("O consumo de racao total da baia ===> " + cR);
				   System.out.println("");
				   System.out.println("");
				   
				   
				   
				   System.out.println("======= MENU =======");
				   System.out.println("Agora informe qual a area em metros quadrados em que os frangos ficaram alojados");
				   System.out.println("");
				   System.out.println("area do aveario em m2:  ");
				   float area = leia.nextFloat();
				   b.setArea(area);
				   b.getArea();
				     
				   System.out.println("");
				   System.out.println("");
				   
				   System.out.println("======= MENU =======");
				   System.out.println("Agora vamos calcular a viabilidade da sua baia");
				   System.out.println("");
				   System.out.println("A viabilidade é a subtraçao da sua taxa de mortalidade");
				   System.out.println("por 100%");
				   System.out.println("");
				   System.out.println("Qual a taxa de mortalidade da baia ");
				   float mortalidade = leia.nextInt();
				   b.setMortalidade(mortalidade);
				   b.getMortalidade();
				   float taxamortal;	
				   b.setMortalidade(mortalidade);

				   taxamortal = b.getMortalidade() / 100;		   
				   float result;
				   result =  100 - mortalidade;	
				   b.setViabilidade(result);
				   System.out.println("");
				     
				   System.out.println("Logo se a taxa de mortalidade de sua baia e ===> " + taxamortal + "%");
				   System.out.println("A viabilidade de sua baia sera ===> " + result + "%");
				   System.out.println("");
				   System.out.println("");
				  
				   float cA;
				  
				   cA = b.getcR() / b.getpT();
				   b.setCa(cA);
				   System.out.println("");
				   System.out.println("");
				   System.out.println("======= MENU =======");
				   System.out.println("Com os dados ja fornecidos anteriormente tamebem podemos");
				   System.out.println("calcular a conversao alimentar");
				   System.out.println("onde dividimos o consumo de raçao pelo peso total");
				   System.out.println("");
				   System.out.println("");


				   System.out.println("======= MENU =======");
				   System.out.println("A CA do seu lote e " + cA);
				   System.out.println("");
				
				   System.out.println("");
				   System.out.println("");
				   
				   
				   System.out.println("======= MENU =======");
				   System.out.println("Agora vamos calcular o IEP do seu lote");
				   System.out.println("");
				   System.out.println("IEP = [(viabilidade x peso vivo) / (Ca x idade de abate)] x 100");
				   System.out.println("");
				   System.out.println("Para isso informe o peso vivo do seu lote:");
				   float pesoVivo = leia.nextFloat();
				   b.setPesoVivo(pesoVivo);
				   b.getPesoVivo();
				   System.out.println("");
				   System.out.println("");
				   float IEP;
				   
				   IEP = ((b.getViabilidade() * b.getPesoVivo()) / (b.getCa() * b.getIdadeAbate())) * 100;
				   b.setIEP(IEP);

				   System.out.println("======= MENU =======");
				   System.out.println("O IEP da sua baia e " + IEP);
				   System.out.println("");
				   
				   
				   //Numero de comedouros
				   
				   System.out.println("======= MENU =======");
				   System.out.println("Agora vamos calcular o numero de comedouros");
				   System.out.println("para isso dividimos a quantidade de frangos pela capacidade de comedouros");
				   System.out.println("");
				   System.out.println("Informe a capacidade do comedouro: ");
				   
				   int capacidadecomedouro = leia.nextInt();
				   b.setCapacidadecomedouro(capacidadecomedouro);
				   b.getCapacidadecomedouro();
				   
				   int Ncomedouro;
				   Ncomedouro = b.getQuantidadedegalinhas() / b.getCapacidadecomedouro();
				   b.setComedouro(Ncomedouro);
				   System.out.println("");
				   System.out.println("");
				   System.out.println("======= MENU =======");
				   System.out.println("O numero de comedouros e " + Ncomedouro);
				   System.out.println("");
				   System.out.println("");
				   
				   //Numero de bebedouros
				   
				   System.out.println("======= MENU =======");
				   System.out.println("Agora vamos calcular o numero de bebedouros");
				   System.out.println("para isso dividimos a quantidade de frangos pela capacidade de bebedouro");
				   System.out.println("Informe a capacidade do bebedouros: ");
				   int capacidadebebedouros = leia.nextInt();
				   b.setCapacidadebebedouro(capacidadebebedouros);
				   b.getCapacidadebebedouro();
				   
				   int Nbebedouro;
				   Nbebedouro = b.getQuantidadedegalinhas() / b.getCapacidadebebedouro();
				   b.setBebedouro(Nbebedouro);

				   System.out.println("======= MENU =======");
				   System.out.println("O numero de bebedouros e " + Nbebedouro);
				   System.out.println("");
				   System.out.println("");
				   
				   listaBaia.add(b);
				   
				break;
				
			case 2: 
				
				// verificar baias
				 for(Baia a: listaBaia){
					 
					  
                      System.out.println("\n");
                      
                      a.Dados();
                     
				 }
				break;
				
			case 3:
				// excluir baia
				 System.out.println("====== MENU ===== ");
				 System.out.println("Agora vamos remover uma baia");
				 System.out.println("Digite o numero do codigo da baia que voce deseja excluir");
                 int opremove = leia.nextInt();
				 int cont=0;
                 
                for(Baia c: listaBaia) {
                	if(opremove == c.getNumeroBaia()) {
                		listaBaia.remove(c);
                		cont=1;
                	}
                }
				if(cont==1) {
				 System.out.println("LOTE exluida");	
				}else {System.out.println("Baia nao encontrada");}
				
				break;
				
			case 4:
				 System.out.println("====== MENU ===== ");
				 System.out.println("Voce pode pesquisar um lote em especifico");
				 System.out.println("para ver os dados somente dela");
				 System.out.println("Digite o codigo do lote que deseja visualizar");
                 int num = leia.nextInt();
				 int cont2 = 0;
				 
                 for(Baia d: listaBaia) {
                 	if(num == d.getNumeroBaia()) {
                 		d.Dados();
                 		cont2=1;
                 	}
                 }
 				if(cont2==1) {
 					 System.out.println("Lote encontrado!!!");
 				}else {System.out.println("Lote nao encontrado");}
				 System.out.println("");

 				break;	
 				
			case 5:
				
				break;
				
				
		}
		}while(op != 10);
		   System.out.println("");
		   System.out.println("OBG por usar meu software :)");	
	}
	}