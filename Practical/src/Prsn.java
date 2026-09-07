class Prsn {
    int id;
    String name;

    Prsn(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [ID=" + id + ", Name=" + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Prsn p = (Prsn) obj;
        return id == p.id && name.equals(p.name);
    }

    @Override
    public int hashCode() {
        return id + name.hashCode();
    }
}