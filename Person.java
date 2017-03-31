package json;

/**
 * Created by guft on 2017/3/31.
 */
public class Person {

    private String name;
    public int num;
    public String sex;
    private int age;

    public Person() {
        // TODO Auto-generated constructor stub
    }

    public Person(String name, int num, String sex, int age) {
        super();
        this.name = name;
        this.num = num;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num+"";
    }

    public void setNum(String num) {
        this.num = Integer.valueOf(num);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age+"";
    }

    public void setAge(String age) {
        this.age = Integer.valueOf(age);
    }
}
