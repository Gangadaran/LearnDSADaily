package learn_regular_expression;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegular {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("agent \\d{3}");
        Matcher matcher = pattern.matcher("agent 007");
        System.out.println(matcher.find());
    }
}
