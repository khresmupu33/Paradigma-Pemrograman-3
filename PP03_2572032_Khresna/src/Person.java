public class Person implements Comparable<Person>{
    private String firtnam;
    private String lastnam;

    public Person(String firtnam, String lastnam) {
        this.firtnam = firtnam;
        this.lastnam = lastnam;
    }

    @Override
    public String toString() {
        return String.format("%s %s", firtnam,lastnam);
    }

    @Override
    public int compareTo(Person o) {
        return this.firtnam.compareTo(o.firtnam);
    }
}
