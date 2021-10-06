package recipes.businesslayer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import recipes.users.businesslayer.User;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "recipes")
public class Recipe implements Serializable {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @JsonProperty(value = "name")
    @NotBlank(message = "name cannot be empty")
    @Column(name = "name")
    private String name;
    
    @JsonProperty(value = "category")
    @NotBlank(message = "category cannot be empty")
    @Column(name = "category")
    private String category;

    @JsonProperty(value = "description")
    @NotBlank(message = "description cannot be empty")
    @Column(name = "description")
    private String description;

    @JsonProperty(value = "ingredients")
    @NotEmpty(message = "ingredients of recipe cannot be empty")
    @Size(min = 1, message = "recipe must has at least a ingredient")
    @Column(name = "ingredients")
    private String[] ingredients;

    @JsonProperty(value = "directions")
    @NotEmpty(message = "directions of recipe cannot be empty")
    @Size(min = 1, message = "recipe must has at least a direction")
    @Column(name = "directions")
    private String[] directions;

    @JsonProperty(value = "date")
    @Column(name = "date")
    private LocalDateTime date;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "author")
    private User author;

    public void copy(Recipe other) {
        if (other == null) {
            return;
        }
        setId(other.getId());
        setName(other.getName());
        setCategory(other.getCategory());
        setDescription(other.getDescription());
        setIngredients(other.getIngredients());
        setDirections(other.getDirections());
        setDate(other.getDate());
        setAuthor(other.getAuthor());
    }
}
