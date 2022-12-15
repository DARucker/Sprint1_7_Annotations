package n2_exercici1;

import practicas.SerializeJson;

public class ObjectToJason {
	
	public String getPath(Object object) {
		Class<?> clazz = object.getClass();
		return clazz.getAnnotation(SerializeJson.class).path();
	}


}
