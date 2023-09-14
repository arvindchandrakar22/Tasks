package evaluation.codingquestions;

import java.util.*;

class Tweet {
    int id;
    int xCoord;
    int yCoord;

    public Tweet(int id, int xCoord, int yCoord) {
        this.id = id;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }
}

public class FetchTweets {
    private List<Tweet> tweets;

    public FetchTweets() {
        this.tweets = new ArrayList<>();
    }

    public void storeTweet(int xCoord, int yCoord, int id) {
        Tweet tweet = new Tweet(id, xCoord, yCoord);
        tweets.add(tweet);
    }

    public Tweet[] fetchTweets(int xCoordOfUser, int yCoordOfUser, int K) {
        // Custom comparator to sort tweets based on distance and preferences
        Comparator<Tweet> tweetComparator = new Comparator<Tweet>() {
            @Override
            public int compare(Tweet t1, Tweet t2) {
                int dist1 = (xCoordOfUser - t1.xCoord) * (xCoordOfUser - t1.xCoord) +
                        (yCoordOfUser - t1.yCoord) * (yCoordOfUser - t1.yCoord);
                int dist2 = (xCoordOfUser - t2.xCoord) * (xCoordOfUser - t2.xCoord) +
                        (yCoordOfUser - t2.yCoord) * (yCoordOfUser - t2.yCoord);

                if (dist1 != dist2) {
                    return dist1 - dist2;
                } else if (t1.xCoord != t2.xCoord) {
                    return t1.xCoord - t2.xCoord;
                } else if (t1.yCoord != t2.yCoord) {
                    return t1.yCoord - t2.yCoord;
                } else {
                    return t1.id - t2.id; // Prefer the one stored first
                }
            }
        };

        // Sort the tweets based on the custom comparator
        Collections.sort(tweets, tweetComparator);

        // Fetch the first K tweets
        int count = Math.min(K, tweets.size());
        Tweet[] result = new Tweet[count];
        for (int i = 0; i < count; i++) {
            result[i] = tweets.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        FetchTweets fetchTweets = new FetchTweets();

        // Store some tweets
        fetchTweets.storeTweet(1, 2, 101);
        fetchTweets.storeTweet(2, 3, 102);
        fetchTweets.storeTweet(3, 4, 103);
        fetchTweets.storeTweet(4, 5, 104);
        fetchTweets.storeTweet(5, 6, 105);

        // Fetch K closest tweets to a user's location
        int xCoordOfUser = 3;
        int yCoordOfUser = 3;
        int K = 3;
        Tweet[] closestTweets = fetchTweets.fetchTweets(xCoordOfUser, yCoordOfUser, K);

        // Print the closest tweets
        for (Tweet tweet : closestTweets) {
            System.out.println("Tweet ID: " + tweet.id + ", Location: (" + tweet.xCoord + ", " + tweet.yCoord + ")");
        }
    }
}
