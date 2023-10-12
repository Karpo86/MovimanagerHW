public class MovieManager {
    private String[] movies = new String[0];
    private int limit;

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public MovieManager() {
        limit = 5;
    }

    public void add(String film) {
        String[] tmp  = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++ ) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = film;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] ans = new String[resultLength];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = movies[movies.length - 1 - i];
        }
        return ans;
    }
}