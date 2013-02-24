package tests;
public class Test {
    private Object expected;
    private String message;
    public Test(String message) {
        this.message = message;
    }

    public void expect(Object expected) {
        this.expected = expected;
    }

    public void run(Object output) {
        if (expected == null) {
            if (output != null) {
                error(output);
            }
        } else if (! expected.equals(output)) {
            error(output);
        }
    }

    void error(Object output) {
        System.out.println("*********");
        System.out.println("   Error: " + message);
        System.out.println("Expected: " + expected);
        System.out.println("     Got: " + output);
    }
}
