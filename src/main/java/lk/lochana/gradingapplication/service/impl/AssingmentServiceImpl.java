package lk.lochana.gradingapplication.service.impl;

import lk.lochana.gradingapplication.dto.AssingmentDto;
import lk.lochana.gradingapplication.entity.Assingment;
import lk.lochana.gradingapplication.repository.AssingmentRepository;
import lk.lochana.gradingapplication.service.AssingmentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssingmentServiceImpl implements AssingmentService {
    
    @Autowired
    private AssingmentRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<AssingmentDto> getAssingments(String teacherId) {
        List<Assingment> assingments =repository.findByteacher(teacherId);
       return modelMapper.map(assingments, new TypeToken<List<AssingmentDto>>() {
        }.getType());
    }


}
