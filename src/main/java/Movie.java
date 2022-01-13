import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Movie {
    @SerializedName("id")
    private int id;

    @SerializedName("title")
    private String title;

    @SerializedName("length")
    private int lenght;

    @SerializedName("category")
    private String[] category;

    @SerializedName("view")
    private int view;

    @SerializedName("year")
    private int year;

}