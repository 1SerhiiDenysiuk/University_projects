package lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberProccess {
	

	    public String readInputText() throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter String:");
	        return br.readLine();
	    }

	    public String processText(String inputText){
	        Pattern pattern = Pattern.compile("[-?0-9]+");
	        Matcher matcher = pattern.matcher(inputText);

	        StringBuffer sb = new StringBuffer();
	        while (matcher.find()){
	            matcher.appendReplacement(sb, new StringBuffer(matcher.group()).reverse().toString());
	        }
	        matcher.appendTail(sb);

	        return sb.toString();
	    }

	    public void showResults(String resultText){
	        System.out.println(resultText);
	    }

	}
