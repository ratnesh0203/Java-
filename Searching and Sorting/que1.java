import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of posts: ");
        int n = scanner.nextInt();

        int[] likes = new int[n];
        int[] comments = new int[n];

        System.out.println("Enter the number of likes and comments for each post:");

        for (int i = 0; i < n; i++) {
            likes[i] = scanner.nextInt();
            comments[i] = scanner.nextInt();
            // scanner.close();
        }

        int mostPopularPostIndex = findMostPopularPostIndex(likes, comments);

        System.out.println("Most popular post is post " + (mostPopularPostIndex + 1));
    }

    private static int findMostPopularPostIndex(int[] likes, int[] comments) {
        int mostPopularIndex = 0;

        for (int i = 1; i < likes.length; i++) {
            if (likes[i] > likes[mostPopularIndex] ||
                    (likes[i] == likes[mostPopularIndex] && comments[i] > comments[mostPopularIndex])) {
                mostPopularIndex = i;
            }
        }

        return mostPopularIndex;
    }
}