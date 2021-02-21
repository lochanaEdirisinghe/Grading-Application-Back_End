package lk.lochana.gradingapplication.service;

import lk.lochana.gradingapplication.dto.AssingmentDto;

import java.util.List;

public interface AssingmentService {
    List<AssingmentDto> getAssingments(String tracherId);
}
