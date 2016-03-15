package demo.engineering.papers;

public abstract class BasicEngineering {
    // papers() in the template method
    public void papers() {
        // Common papers:
        math();
        softSkills();
        // Specialized Paper:
        specialPaper();
    }

    // Non-Abstract method math(), softSkills() are already implemented by Template class
    private void math() {
        System.out.println("Mathemathics");
    }

    private void softSkills() {
        System.out.println("Soft Skills");
    }

    // Abstract method specialPaper() must be implemented in derived classes
    public abstract void specialPaper();
}
