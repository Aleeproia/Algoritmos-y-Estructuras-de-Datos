package Ejercicio4;

import Cola_Pila.PilaGenerica;


public class TestBalanceo {
	
	public boolean estaBalanceado(String S) {
		boolean ok=true;
		if(S == "") {
			return ok;
		}
		else {
			char c = S.charAt(0);
			if((c == ')')||(c ==']')||(c =='}')) {
				ok=false;
			}
			else {
				PilaGenerica<Character> pila = new PilaGenerica<Character>();
				for(int i=0;i<S.length();i++) {
					c = S.charAt(i);
					if((c == '(')||(c =='[')||(c =='{')) {
						pila.apilar(c);
					}else
					{	
						if(ok!=false) {				
							if((c == ')')&&(pila.desapilar() != '(')){
								ok=false;
							}
							if((c == ']')&&(pila.desapilar() != '(')){
								ok=false;
							}
							if((c == '}')&&(pila.desapilar() != '{')){
								ok=false;
							}
						}		
					}
					
				}									
			}
			return ok;
					
		}
				
	}

	public static void main(String[] args) {

		TestBalanceo t = new TestBalanceo();
		
		if(t.estaBalanceado("({)}")) {
			System.out.print("El string esta balanceado");
		}
		else {
			System.out.print("El string NO esta balanceado");
		}

	}

}
