package by.academy.task6;

import by.academy.task6.HeadFactory;
import by.academy.task6.BodyHeadFactory;
import by.academy.task6.BodyFactory;

public class BodyHead implements BodyHeadFactory{

    @Override
    public HeadFactory makeHead(int head) {

        if (head == 0){
            return HeadFactory.BIG_HEAD;

        } else if (head == 1){
            return HeadFactory.MIDDLE_HEAD;
        } else {
            return HeadFactory.SHORT_HEAD;
        }
    }

    @Override
    public BodyFactory makeBody(int body) {

        if (body == 0){
            return BodyFactory.BIG_BODY;

        } else if (body == 1){
            return BodyFactory.MIDDLE_BODY;
        } else {
            return BodyFactory.SHORT_BODY;
        }
    }

}
