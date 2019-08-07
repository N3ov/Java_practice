package Class;

public class Class {

    private String className;

    public Class(){
        className = "Java";
    }

    public Class(String className){
        this.className = className;
    }

    // getter & setter
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void printClass(){
        System.out.println("Class Name: " + this.className);
    }
}
