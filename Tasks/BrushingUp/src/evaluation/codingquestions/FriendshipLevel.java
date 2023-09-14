package evaluation.codingquestions;

// Class Acquaintance
class Acquaintance {
    protected String name;

    public Acquaintance(String name) {
        this.name = name;
    }

    public void getStatus() {
        System.out.println(name + " is just an acquaintance.");
    }
}

// Class Friend
class Friend extends Acquaintance {
    protected String homeTown;

    public Friend(String name, String homeTown) {
        super(name);
        this.homeTown = homeTown;
    }

    @Override
    public void getStatus() {
        System.out.println(name + " is a friend and he is from " + homeTown + ".");
    }
}

// Class BestFriend
class BestFriend extends Friend {
    protected String favoriteSong;

    public BestFriend(String name, String homeTown, String favoriteSong) {
        super(name, homeTown);
        this.favoriteSong = favoriteSong;
    }

    @Override
    public void getStatus() {
        System.out.println(name + " is my best friend. He is from " + homeTown + " and his favorite song is " + favoriteSong + ".");
    }
}

public class FriendshipLevel {
    public static void main(String[] args) {
        Acquaintance person1 = new Acquaintance("John");
        Friend person2 = new Friend("Alice", "New York");
        BestFriend person3 = new BestFriend("Bob", "Los Angeles", "Yesterday by The Beatles");

        person1.getStatus();
        person2.getStatus();
        person3.getStatus();
    }
}
