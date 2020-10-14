package lista;

//toda vez que o codigo for complilado pelo no cmd o package deve estar comentado

public class Ex2 {
	
	public static void main (String[] args) {
		
		if(args.length > 0){
			for(int i = 0; i<args.length; i++){
				System.out.println((i+1)+ " --> " + args[i]);
			}
		}else{
			System.out.println("Nao tem argumentos");
			}
}

}

//Leonardo Henrique M. de A. Ramos
