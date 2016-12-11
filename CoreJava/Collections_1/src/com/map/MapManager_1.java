package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapManager_1 {

	public static void main(String[] args) {

		Map map = new HashMap();
		Member m1 = new Member("Abc","B100");
		Member m2 = new Member("Pqr","B130");
		Member m3 = new Member("Abc","B100");
		Member m4 = new Member("Xyz","B140");
		
		
		map.put(m1, "m1 member");//K,V
		map.put(m2, "m2 member");
		map.put(m3, "m3 member");
		map.put(m4, "m4 member");
		
		System.out.println(map);
	}

}
class Member
{
	String name;
	String id;
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	public String toString() {
		return "Member [name=" + name + ", id=" + id + "]";
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
