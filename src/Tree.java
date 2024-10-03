public class Tree implements Comparable<Tree>{
    private double height;
    private int age;
    private String type;
    public Tree(double height, int age, String type){
        this.height = height;
        this.age = age;
        this.type = type;
    }
    public int compareTo(Tree other){
        return Integer.compare(this.age, other.age);
    }
    public String toString(){
        return "Type: " + getType() + "\tAge: " + getAge() + "\tHeight: " + getHeight();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
