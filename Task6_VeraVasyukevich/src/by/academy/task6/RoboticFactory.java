package by.academy.task6;

public class RoboticFactory {
    private String name;
    private HeadFactory head;
    private BodyFactory body;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeadFactory getHeadFactory() {
        return head;
    }

    public void setHeadFactory(HeadFactory head) {
        this.head = head;
    }

    public BodyFactory getBodyFactory() {
        return body;
    }

    public void setBodyFactory(BodyFactory body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", head=" + head +
                ", body=" + body +
                '}';
    }

    public RoboticFactory(String name, HeadFactory head, BodyFactory body) {
        this.name = name;
        this.head = head;
        this.body = body;
    }
}
