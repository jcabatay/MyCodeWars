package org.wholikes;

public class WhoLikesIt {
    public static String listlikes(String... names){
        int pos = names.length;
        String message;
        switch (pos){
            case 0: message = "no one likes this";
            break;
            case 1: message = names[0] + " likes this";
            break;
            case 2: message = names[0] + " and " + names[1] + " like this";
            break;
            case 3: message = names[0] + ", " + names[1] + " and " + names[2] + " like this";
            break;
            default: return names[0] + ", " + names[1] + " and " + Integer.toString((names.length)-2)  + " others like this";
        }
        return message;
    }

}
