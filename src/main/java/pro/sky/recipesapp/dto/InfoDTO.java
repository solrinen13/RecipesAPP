package pro.sky.recipesapp.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class InfoDTO {
    private final String author;
    private final String name;
    private final LocalDate localDate;
    private final String description;

    public InfoDTO(String author, String name, LocalDate localDate, String description) {
        this.author = author;
        this.name = name;
        this.localDate = localDate;
        this.description = description;
    }
}
