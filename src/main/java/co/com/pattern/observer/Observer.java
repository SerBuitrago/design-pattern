package co.com.pattern.observer;

import co.com.pattern.subject.Subject;

public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
