package Cookies;

import java.util.Random;

public class Cookie {

    private static final Random uniqueIdGenerator = new Random();
    private static String cookieType = "SESSION";

    private String id;
    private String userName;
    private String sessionKey;
    private int itemsInCart;

    public Cookie(String userName, String sessionKey, int itemsInCart) {

        this.id = "cookieId-" + uniqueIdGenerator.nextInt();
        this.userName = userName;
        this.sessionKey = sessionKey;
        this.itemsInCart = itemsInCart;


    }

    // Override the toString method to provide a string representation of the object
    @Override
    public String toString() {
        return "Cookie{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", sessionKey='" + sessionKey + '\'' +
                ", itemsInCart=" + itemsInCart +
                '}';
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
