package templatemethod.components;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getInput();

        return answer.toLowerCase().startsWith("y");
    }

    private String getInput() {
        String answer = null;
        System.out.print("Would you like sugar and milk? y/n ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (answer == null) {
            return "no";
        }

        return answer;
    }
}
