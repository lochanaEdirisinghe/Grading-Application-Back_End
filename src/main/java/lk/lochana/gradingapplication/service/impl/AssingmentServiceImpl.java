package lk.lochana.gradingapplication.service.impl;

import lk.lochana.gradingapplication.dto.AssingmentDto;
import lk.lochana.gradingapplication.dto.QuestionDto;
import lk.lochana.gradingapplication.entity.Assingment;
import lk.lochana.gradingapplication.entity.Question;
import lk.lochana.gradingapplication.repository.AssingmentRepository;
import lk.lochana.gradingapplication.repository.QuestionRepository;
import lk.lochana.gradingapplication.service.AssingmentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AssingmentServiceImpl implements AssingmentService {
    
    @Autowired
    private AssingmentRepository assingmentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private QuestionRepository questionRepo;

    @Override
    public List<AssingmentDto> getAssingments(String teacherId) {
        List<Assingment> assingments =assingmentRepo.findByteacher(teacherId);
        if(!assingments.isEmpty()){
            return modelMapper.map(assingments, new TypeToken<List<AssingmentDto>>() {
            }.getType());
        }else{
            throw new RuntimeException("Teacher has not given any assignment");
        }

    }

    @Override
    public List<QuestionDto> getQuestions(String asmntId) {
        List<Question> questions = questionRepo.findByasmnt(asmntId);
        if(!questions.isEmpty()){
            return modelMapper.map(questions, new TypeToken<List<QuestionDto>>() {
            }.getType());
        }else {
            throw new RuntimeException("No Questions");
        }

    }


}
