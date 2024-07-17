package stringProblemsAdvance;


import org.junit.Test;

public class RemoveVowelsFromString {
    @Test
    public void testCase(){
        String words = "what is your name";
        solution1(words);
    }

    private void solution1(String words) {
       String result = words.replaceAll("[AEIOUaeiou]", "");
       System.out.println(result);

    }

    private void solution(String words) {
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < words.length(); i++){
            char c = words.charAt(i);
            if(checkVowels(c)){
            sb.append(c);
            }

        }
        System.out.println(sb.toString());
    }

    private boolean checkVowels(char c) {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return false;
        }
        return true;
    }

}
