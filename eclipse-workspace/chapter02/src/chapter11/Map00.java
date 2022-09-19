package chapter11;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Map00 {

	public static void main(String[] args) {
//		Map<String, Integer> map = new HashMap<>();
//
//		map.put("박길동", 78);
//		map.put("고길동", 89);
//		map.put("홍길동", 95);
//		map.put("금길동", 99);
//		map.put("이길동", 100);
//		map.put("최길동", 100);

//		System.out.println("전체 맵 갯수 : " + map.size());
//		map.put("홍길동", 25);
//		System.out.println("전체 맵 갯수 : " + map.size());
//		System.out.println("홍길동 점수 : " + map.get("홍길동"));
//		
//		map.remove("이길동");
//		System.out.println("전체 맵 갯수 : " + map.size());

// =================================================================================

//		Set<String> keySet = map.keySet();
//		Iterator<String> keyItr = keySet.iterator();
//		while(keyItr.hasNext()) {
//			String key = keyItr.next();
//			Integer value = map.get(key);
//			
//			System.out.println("이름 : " + key + " 점수 : " + value);
//	}

// =================================================================================

//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//		
//		Iterator<Map.Entry<String, Integer>> entryItr = entrySet.iterator();
//		while(entryItr.hasNext()) {
//			Map.Entry<String, Integer> entry = entryItr.next();
//			
//			String key = entry.getKey();
//			Integer value = entry.getValue();
//			
//			System.out.println("이름 : " + key + " 점수 : " + value);
//	}
		
// ===================================================================================
		TreeMap<String, Integer> map = new TreeMap<>();
		
		map.put("가길동", 78);
		map.put("나길동", 89);
		map.put("다길동", 95);
		map.put("라길동", 99);
		map.put("마길동", 100);
		map.put("바길동", 100);
		
		System.out.println("첫째 : " + map.firstEntry().getKey() + "점수 : " + map.firstEntry().getValue());
		System.out.println("마지막째 : " + map.lastEntry().getKey() + "점수 : " + map.lastEntry().getValue());
		
		System.out.println("라길동 뒤 이름 : " + map.higherEntry("라길동").getKey());
		System.out.println("라길동 앞 이름 : " + map.lowerEntry("라길동").getKey());
		
		System.out.println("다길동이거나 바로 뒤 : " + map.ceilingEntry("다길동").getKey() + "점수 : " + map.ceilingEntry("다길동").getValue());
		System.out.println("당길동이거나 바로 앞 : " + map.floorEntry("당길동").getKey() + "점수 : " + map.floorEntry("당길동").getValue());
		
		System.out.println();
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyItr = keySet.iterator();
		while(keyItr.hasNext()) {
			String key = keyItr.next();
			Integer value =map.get(key);
			
			System.out.println("이름 : " + key + " 점수 : " + value);
		}
		
		}

	}

