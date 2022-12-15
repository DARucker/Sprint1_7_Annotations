package n2_exercici1;

import practicas.SerializeJson;

public class ObjectToJason {
	
	public String getPath(Player player) {
		Class<?> clazz = player.getClass();
		return clazz.getAnnotation(SerializeJson.class).path();
	}


}
