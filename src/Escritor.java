import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Autores : Guilherme Deconto e Gustavo Possebon
 */

public class Escritor {
	private File arquivo;
	private FileWriter writer;
	
	public Escritor(String nomeArquivo) throws IOException {
		arquivo = new File(nomeArquivo);
		if(arquivo.exists())
			arquivo.delete();
		writer = new FileWriter(arquivo);
	}
	
	public void escreveProximaLinha(String texto) throws IOException {
		writer.write(texto + "\n");
	}
	
	public void fechaArquivo() throws IOException {
		writer.close();
	}
}
