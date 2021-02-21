package lk.lochana.gradingapplication.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssingmentDto {

    private String asmntId;
    private String asmntName;
    private String asmntType;
   // private List<QuestionDto> questions;

}
