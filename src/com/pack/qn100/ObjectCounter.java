package com.pack.qn100;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.HashMap;
import java.util.Map;

class ObjectTracker {
    private static final Map<String, AtomicInteger> counterMap = new HashMap<>();

    public ObjectTracker() {
        String className = this.getClass().getSimpleName();
        counterMap.putIfAbsent(className, new AtomicInteger(0));
        counterMap.get(className).incrementAndGet();
    }

    public static int getCount(String className) {
        return counterMap.getOrDefault(className, new AtomicInteger(0)).get();
    }
}

// Example class extending ObjectTracker
class Employee extends ObjectCounter {
    public Employee() {
        super();
    }
}

class Department extends ObjectCounter {
    public Department() {
        super();
    }
}

public class ObjectCounter {
    public static void main(String[] args) {
        String str1="welcome";
        String str2=new String("world");
        char[] chars= {'H','e','l','l','o'};
        String str3=new String(chars);

        System.out.println("Object created: " + ObjectTracker.getCount("String"));
    }
}
