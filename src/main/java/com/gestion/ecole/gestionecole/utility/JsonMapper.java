package com.gestion.ecole.gestionecole.utility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonMapper {

	public static String toJson(Object obj) throws JsonProcessingException {
		// Use ObjectMapper to convert the object to JSON
		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(obj);
		return json;
	}

	public static <T> T fromJsonToObject(String json, Class<T> valueType) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(json, valueType);
	}

}
