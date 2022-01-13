import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Service service = new Service();
    static ArrayList<Movie> movies = service.getAllMovies("movie.json");
    static Scanner sc = new Scanner(System.in);

    public static void run() {
        chooseMenuItem();
    }

    private static void searchMoviesByCategory() {
        String searchCategory;
        System.out.print("Nhập thể loại cần tìm: ");
        searchCategory = sc.nextLine();

    }

    private static void show3MoviesWithMostView() {
        System.out.println("Danh sách 3 phim có lượt xem cao nhất: ");
        service.show3MoviesWithMostView(movies);
    }

    private static void searchTitle() {
        String searchTitle;
        System.out.print("Nhập từ khoá tìm kiếm theo tên: ");
        searchTitle = sc.nextLine();
        System.out.println("Danh sách phim có từ khoá \"" + searchTitle + "\" trong tên: ");
        service.searchTitle(movies, searchTitle);
    }

    private static void sortTitle() {
        System.out.println("Danh sách phim sắp xếp theo tên: ");
        service.sortTitle(movies);
        service.showAllMovies(movies);
    }

    private static void sortYear() {
        System.out.println("Danh sách phim sắp xếp theo năm xuất bản: ");
        service.sortYear(movies);
        service.showAllMovies(movies);
    }

    private static void showAllMovies() {
        System.out.println("Danh sách phim: ");
        service.sortId(movies);
        service.showAllMovies(movies);
    }

    public static void showMenu() {
        System.out.println("----------" + "MENU" + "----------");
        System.out.println("1. Xem danh sách phim");
        System.out.println("2. Sắp xếp phim theo năm xuất bản");
        System.out.println("3. Sắp xếp phim theo tên");
        System.out.println("4. Tìm phim theo tên");
        System.out.println("5. Top 3 phim có lượt xem cao nhất");
        System.out.println("6. Tìm phim theo thể loại");
        System.out.println("0. Thoát chương trình");
        System.out.print("Nhập lựa chọn của bạn: ");
    }

    public static void chooseMenuItem() {
        boolean isContinue = true;

        while (isContinue) {
            showMenu();

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    showAllMovies();
                    break;
                case 2:
                    sortYear();
                    break;
                case 3:
                    sortTitle();
                    break;
                case 4:
                    searchTitle();
                    break;
                case 5:
                    show3MoviesWithMostView();
                    break;
                case 6:
                    searchMoviesByCategory();
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }
        }
    }

}
