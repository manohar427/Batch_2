package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapManager_3 {

	public static void main(String[] args) {
       Map map = new HashMap();
       map.put("Pqr", "Pqr 1 Value");
       map.put("Xyz", "Xyz Value");
       map.put("Pqr", "Pqr 2 Value");
       
       System.out.println(map);
	}
}
