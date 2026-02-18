// com/access/one/Base.java
package com.access.one;

public class Base {
    public String publicMethod() {
        return "public method";
    }

    protected String protectedMethod() {
        return "protected method";
    }

    String defaultMethod() {
        return "default method";
    }

    private String privateMethod() {
        return "private method";
    }

    public String callPrivate() {
        return privateMethod();
    }
}


// com/access/two/Derived.java
package com.access.two;

import com.access.one.Base;

public class Derived extends Base {
    public void testAccess() {
        System.out.println("Public    : " + publicMethod());
        System.out.println("Protected : " + protectedMethod());
        System.out.println("Private (via wrapper): " + callPrivate());

        System.out.println("\ndefaultMethod() - NOT accessible from another package");
        System.out.println("privateMethod() - NOT accessible outside Base class");
    }
}


// AccessMain.java
import com.access.two.Derived;

public class AccessMain {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.testAccess();
    }
}
