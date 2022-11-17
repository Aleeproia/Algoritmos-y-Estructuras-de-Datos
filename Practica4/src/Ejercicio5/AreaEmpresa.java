package Ejercicio5;

public class AreaEmpresa {
	
	private String identificacion;
	private int tardanza;
	
	public AreaEmpresa(String id, int tardanza) {
		this.setIdentificacion(id);
		this.setTardanza(tardanza);
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public int getTardanza() {
		return tardanza;
	}

	public void setTardanza(int tardanza) {
		this.tardanza = tardanza;
	}
}
