import java.io.*;

/*
 * Autores : Guilherme Deconto
 */

public class Leitor {
	private File arquivo;
	private BufferedReader reader;
	
	public Leitor(String nomeArquivo) throws FileNotFoundException {
		arquivo = new File(nomeArquivo);
		if(arquivo.exists())
			reader = new BufferedReader(new FileReader(arquivo));
		else
			throw new FileNotFoundException();
	}
	
	public String leProximaLinha() throws IOException {
		return reader.readLine();

	}
	
	public void fechaArquivo() throws IOException {
		reader.close();
	}
}
