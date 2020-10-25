package org.objects.singleton;
// singleton : java.lang.Runtime
public class AuthenticationProvider {
    // this gets initialized only once at the time of classloading.
    // only one object will be created
    private static AuthenticationProvider INSTANCE=new AuthenticationProvider();
//    private static AuthenticationProvider obj=new AuthenticationProvider();


//  we Write a static method that has return type object of this singleton class.
    public static AuthenticationProvider getInstance(){
        return INSTANCE;
    }

//    public static AuthenticationProvider getInstance(){
//        return obj;
//    }

//singleton constructor always private
    // it don't allow anyone from outside class to call and create an object.
    private AuthenticationProvider(){
        //

    }
}
