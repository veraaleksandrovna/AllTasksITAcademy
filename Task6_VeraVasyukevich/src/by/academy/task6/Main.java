package by.academy.task6;

public class Main {
BodyHeadFactory  head = new BodyHead();
BodyHeadFactory  body = new BodyHead() ;

        for (int body = 0; body < BodyFactory.values().length; body++) {
            BodyFactory robotBody = BodyFactory.makeBody(body);
            for(int head = 0; head<HeadFactory.values().length;head++){
                HeadFactory robotHead = HeadFactory.makeHead(head);
            RoboticFactory robot = new RoboticFactory("asd" + head + body, robotHead, robotBody);
            System.out.println(robot);

        }

    }

}
