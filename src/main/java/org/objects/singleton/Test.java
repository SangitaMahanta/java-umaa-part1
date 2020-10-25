package org.objects.singleton;

public class Test {
    public static void main(String[] args) {
//        AuthenticationProvider authenticationProvider=new AuthenticationProvider(); // private constructor
//        System.out.println(authenticationProvider.hashCode());

        System.out.println(AuthenticationProvider.getInstance());
        System.out.println(AuthenticationProvider.getInstance());
        System.out.println(AuthenticationProvider.getInstance());

    }
}
