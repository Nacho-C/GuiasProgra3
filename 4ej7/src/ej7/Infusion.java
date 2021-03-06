package ej7;

abstract public class Infusion
{
	public Infusion() {
		
	}
	protected void calentarAgua() {
		System.out.println("Calentando agua\n");
	}
	abstract protected void agregarTipoInfusion();
	protected void endulzar() {
		System.out.println("La bebida se tomará amarga\n");
	}
	abstract protected void tomar();
	
	public void prepararYTomar() {
		this.calentarAgua();
		this.agregarTipoInfusion();
		this.endulzar();
		this.tomar();
		System.out.println("\n" + "\n");
	}
}
