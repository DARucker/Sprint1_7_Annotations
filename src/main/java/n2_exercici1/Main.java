package n2_exercici1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import practicas.ObjectToJson;

public class Main {

	public static void main(String[] args) {

		List<Player> players = new ArrayList<>();
		ObjectToJson object = new ObjectToJson();

		players.add(new Player("Leo", "Messi"));
		players.add(new Player("Julian", "Alvarez"));
		players.add(new Player("Dibu", "Martinez"));
		
		for (Player p : players) {
			String linea1 = "{\"" + p.getNombre() + "\" : \"" + p.getApellido() + "\"}," + "\n";
			write(object.getPath(new Player()), linea1);
		}
		
	}

	private static void write(String directory, String json) {
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(directory, true));
			bw.write(json);
			bw.close();
			System.out.println("Archivo actualizado");
		} catch (IOException e) {
			System.out.println("Buffer problem (Write)");
		}

	}
}