package Ejercicio3;

public class Test {

	public static void main(String[] args) {
		
		Estudiante [] vec_est=new Estudiante[3];
		
		Profesor [] vec_pro=new Profesor[3];
		
		vec_est[0]= new Estudiante();
		vec_est[1]= new Estudiante();
		vec_est[2]= new Estudiante();
		
		vec_pro[0]=new Profesor();
		vec_pro[1]=new Profesor();
		vec_pro[2]=new Profesor();
	
		vec_est[0].setNombre("Alejandro");
		vec_est[0].setApellido("Proia");
		vec_est[0].setComision("comision4b");
		vec_est[0].setEmail("ale.proia@hotmail.com");
		vec_est[0].setDireccion("aeropuerto");
		
		vec_est[1].setNombre("Alejandroo");
		vec_est[1].setApellido("Proiaa");
		vec_est[1].setComision("comision4bb");
		vec_est[1].setEmail("ale.proia@hotmail.comm");
		vec_est[1].setDireccion("aeropuertoo");
				
		vec_est[2].setNombre("Alejandrooo");
		vec_est[2].setApellido("Proiaaa");
		vec_est[2].setComision("comision4bbb");
		vec_est[2].setEmail("ale.proia@hotmail.commm");
		vec_est[2].setDireccion("aeropuertooo");
		
		vec_pro[0].setNombre("jose");
		vec_pro[0].setApellido("pepito");
		vec_pro[0].setCatedra("ayed");
		vec_pro[0].setEmail("pepito@hotmail.com");
		vec_pro[0].setFacultad("informatica");

		vec_pro[1].setNombre("josee");
		vec_pro[1].setApellido("pepitoo");
		vec_pro[1].setCatedra("ayedd");
		vec_pro[1].setEmail("pepito@hotmail.comm");
		vec_pro[1].setFacultad("informaticaa");
		
		vec_pro[2].setNombre("joseee");
		vec_pro[2].setApellido("pepitooo");
		vec_pro[2].setCatedra("ayeddd");
		vec_pro[2].setEmail("pepito@hotmail.commm");
		vec_pro[2].setFacultad("informaticaaa");
		
		for(int i=0;i <vec_est.length;i++) {
			System.out.println(vec_est[i].tusDatos());
		}
		
		for(int i=0;i <vec_pro.length;i++) {
			System.out.println(vec_pro[i].tusDatos());
		}
		

	}

}
