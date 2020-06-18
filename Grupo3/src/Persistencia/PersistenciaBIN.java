package Persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PersistenciaBIN implements IPersistencia<Serializable>{
	
	private FileInputStream fileInput;
	private FileOutputStream fileOutput;
	private ObjectOutputStream objectoutput;
	private ObjectInputStream objectinput;

	@Override
	public void abrirInput(String nombre) throws IOException {
		this.fileInput = new FileInputStream(nombre);
		this.objectinput = new ObjectInputStream(fileInput);
	}

	@Override
	public void abrirOutput(String nombre) throws IOException {
		this.fileOutput = new FileOutputStream(nombre);
		this.objectoutput = new ObjectOutputStream(fileOutput);
	}

	@Override
	public void cerrarInput() throws IOException {
		if (this.objectinput !=null)
			this.objectinput.close();
			
		
	}

	@Override
	public void cerrarOutput() throws IOException {
		if (this.objectoutput !=null)
			this.objectoutput.close();
	}
	
	@Override
	public void escribir(Serializable serializable) throws IOException {
		if (objectoutput!=null)
			objectoutput.writeObject(serializable);
	}

	
	public Serializable leer() throws IOException, ClassNotFoundException {
		Serializable objeto = null;
		if (objectinput!=null)
			objeto = (Serializable) objectinput.readObject();
		return objeto;
	}
}
