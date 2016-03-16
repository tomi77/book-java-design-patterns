package demo.contextofchoice;

import demo.choices.IChoice;

public class Context {
    IChoice myChoice;

    // Set a strategy or algorithm in the Context
    public void setChoice(IChoice choice) {
        myChoice = choice;
    }

    public void showChoice(String s1, String s2) {
        myChoice.myChoice(s1, s2);
    }
}
