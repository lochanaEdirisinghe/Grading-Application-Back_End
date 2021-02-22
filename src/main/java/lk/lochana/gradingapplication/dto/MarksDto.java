package lk.lochana.gradingapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarksDto {

    private String answer;
    private int noOfAttempts;
    private String result;
    private Time spentTime;
}
