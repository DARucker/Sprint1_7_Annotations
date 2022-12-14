package practicas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import practicas.ObjectToJson;

public class MainSerializeJson {

	public static void main(String[] args) throws JsonSerializationException {

		ObjectToJson object = new ObjectToJson();

		ArrayList<Capital> capitals = new ArrayList<>();
		Capital espana = new Capital ("Espana", "Madrid");
		Capital portugal = new Capital ("Portugal", "Lisboa");
		Capital francia = new Capital ("Francia", "Paris");
		Capital argentina = new Capital ("Argentina", "Buenos Aires");
		
		capitals.add(espana);
		capitals.add(portugal);
		capitals.add(francia);
		capitals.add(argentina);
		
		String json = "";
		for (Capital c : capitals) {
			json = object.convertToJson(c);
			write(object.getPath(c), json);
		}
	}

	private static void write(String directory, String json) {
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(directory, true));
			bw.write(json);
			bw.close();
		}catch(IOException e) {
			System.out.println("Buffer problem (Write)");
		}
		
	}

}
