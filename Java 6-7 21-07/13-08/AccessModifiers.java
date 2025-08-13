class Example {
    private String name;

    // getters and setters
    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

class AccessModifiers {
    public static void main(String[] args) {
        Example e1 = new Example();
        // e1.name = "XYZ";
        e1.setName("XYZ");
        // System.out.println(e1.name);
        System.out.println(e1.getName());
    }
}