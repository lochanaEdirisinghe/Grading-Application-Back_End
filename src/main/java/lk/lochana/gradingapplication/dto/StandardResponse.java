package lk.lochana.gradingapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StandardResponse{
    private int code;
    private String message;
    private Object data;
}
