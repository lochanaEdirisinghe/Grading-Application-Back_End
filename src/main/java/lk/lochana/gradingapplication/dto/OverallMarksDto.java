package lk.lochana.gradingapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OverallMarksDto {
    private LocalTime avgTime;
    private int rightCount;
    private int wrongCount;
    private int partialCount;
    private List<MarksDto> studentMarks;
}
