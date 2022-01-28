package java_11_12;

public class Son {
    private int age = 16;

    public int multi(int numberA,int numberB){
        int result = numberA * numberB;
        return result;
    }

    public int division(int numberA, int numberB){
        int result = numberA / numberB;
        return result;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
