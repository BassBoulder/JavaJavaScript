public class Twofer {
    public String twofer(String name) {
       return name != null ? String.format("One for %s, one for me.", name) : "One for you, one for me.";
    }
}
