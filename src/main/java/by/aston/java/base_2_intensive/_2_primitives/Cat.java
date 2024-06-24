package by.aston.java.base_2_intensive._2_primitives;

public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public  void test(){
        for (int i=0; i<1; i++){
            if(getName() == null && getName() =="Tom"){
                System.out.println("пустой");
            }
            else {
                System.out.println("другое");
            }
        }
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
