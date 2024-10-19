class Solution { 
    ArrayList<Integer> playOfGlasses(int c1, int w1, int c2, int w2, int c3, int w3) { 
        ArrayList<Integer> result = new ArrayList<>(); 
 
        for (int i = 0; i < 10; i++) { 
            int pour = Math.min(w1, c2 - w2); 
            w1 -= pour; 
            w2 += pour; 
 
            pour = Math.min(w2, c3 - w3); 
            w2 -= pour; 
            w3 += pour; 
 
            pour = Math.min(w3, c1 - w1); 
            w3 -= pour; 
            w1 += pour; 
        } 
 
        result.add(w1); 
        result.add(w2); 
        result.add(w3); 
 
        return result; 
    }