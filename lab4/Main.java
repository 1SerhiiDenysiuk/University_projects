package lab4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
         NumberProccess NumberProccess = new NumberProccess();

        String inputString = NumberProccess.readInputText();
        String resultText = NumberProccess.processText(inputString);
        NumberProccess.showResults(resultText);
    }
}
