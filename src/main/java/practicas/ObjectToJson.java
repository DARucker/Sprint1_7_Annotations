package practicas;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class ObjectToJson {

	public String convertToJson(Object object) throws JsonSerializationException {
		try {
			checkIfSerializable1(object);
			return getJsonString(object);
		} catch (Exception e) {
			throw new JsonSerializationException(e.getMessage());
		}
	}

	private void checkIfSerializable1(Object object) throws JsonSerializationException {
		if (Objects.isNull(object)) {
			throw new JsonSerializationException("The object to serialize is null");
		}
		Class<?> clazz = object.getClass();
		if (!clazz.isAnnotationPresent(SerializeJson.class)) {
			throw new JsonSerializationException(
					"The class " + clazz.getSimpleName() 
					+ " is not annotated with JsonSerializable");
		}
	}

	private String getJsonString(Object object) throws Exception {
		Class<?> clazz = object.getClass();
		Map<String, String> jsonElemenstMap = new HashMap<>();
		for(Field field : clazz.getDeclaredFields()) {
			field.setAccessible(true);
			if(field.isAnnotationPresent(JsonElement.class)) {
				jsonElemenstMap.put(getKey(field), (String) field.get(object));
			}
		}
		
		String jsonString = jsonElemenstMap.entrySet()
				.stream()
				.map(entry -> "\"" + entry.getKey() + "\":\""
				+ entry.getValue() + "\"")
				.collect(Collectors.joining(","));
		
		return "{" + jsonString + "}\n";
	}

	private String getKey(Field field) {
		String value = field.getAnnotation(JsonElement.class).key();
		return value.isEmpty() ? field.getName() : value;
	}
	
	public String getPath(Object object) {
		Class<?> clazz = object.getClass();
		return clazz.getAnnotation(SerializeJson.class).path();
	}
	
}
