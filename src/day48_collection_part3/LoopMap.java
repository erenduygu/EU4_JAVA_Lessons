package day48_collection_part3;

import java.util.*;

import day46_collection_part1.Product;

public class LoopMap {

	public static void main(String[] args) {

		Map<String, String> dataMap = new HashMap<>();

		dataMap.put("url", "qa3.vytrack.com");
		dataMap.put("username", "user66");
		dataMap.put("password", "abc66");
		dataMap.put("browser", "chrome");
		dataMap.put("truckdriver", "Bob");
		dataMap.put("storemanager", "John");

		// keySet == returns set with all the keys in the map

		for (String key : dataMap.keySet()) {
			System.out.println(key);
		}
		
		// values == returns set with all the values in the map
		for (String value : dataMap.values()) {
			System.out.println(value);
		}

		//key and values
		for (String key : dataMap.keySet()) {
			System.err.println(key + "|" + dataMap.get(key));

		}
		
		// forEach Method.
		
		dataMap.forEach((k,v) -> System.out.println(k+"|"+v));
		
		Map<Integer, Product> studentMap= new HashMap<>();
		Map<String, String[]> data = new HashMap<>();
		Map<Integer, List<String>> data2= new HashMap<>();
		Map<Integer, List<String[]>> data3= new HashMap<>();
		Map<String,Map<Integer,Integer>> data4= new HashMap<>();
		Map<String,Map<Integer,Product>> data5= new HashMap<>();
		
		



	}

}
