package stringproblems;

public class LongestPrefix {
    public void example(){
        String[] names = {"geekforgeeks", "geeks", "geeks", "geezer"};
        findLongest(names);
    }

    private void findLongest(String[] names) {
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length()-1; j++) {

            }
        }


    }

    public static void main(String[] args) {
        String name = "Gangadaran";
        int greeks = name.indexOf("daran");
        System.out.println(greeks);
    }
}
