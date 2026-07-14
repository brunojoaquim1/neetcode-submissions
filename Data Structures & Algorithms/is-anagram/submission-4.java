class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for(char letter : s.toCharArray()){
            if (mapS.containsKey(letter)){
                mapS.put(letter, mapS.get(letter) +1 );  
            } else {
                mapS.put(letter, 1 );
            }
        }

        for(char letter : t.toCharArray()){
            if (mapT.containsKey(letter)){
                mapT.put(letter, mapT.get(letter) +1 );  
            } else {
                mapT.put(letter, 1 );
            }
        }

        return mapS.equals(mapT);



    }
}
