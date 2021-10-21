package com.iportfolio.speacle.account.service;

import com.iportfolio.speacle.account.dto.TestDto;
import com.iportfolio.speacle.data.entity.TestEntity;
import com.iportfolio.speacle.data.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    public TestDto saveTestEntity(final String name) {
        final TestEntity newTestEntity = TestEntity.builder()
                                            .name(name)
                                            .build();
        final TestEntity result = testRepository.save(newTestEntity);
        return parseTestEntityToTestDto(result);
    }

    public TestDto findTestEntityById(final Long id) {
        return parseTestEntityToTestDto(testRepository.findById(id).orElseThrow(NullPointerException::new));
    }

    private TestDto parseTestEntityToTestDto(final TestEntity testEntity) {
        return TestDto.builder()
                .id(testEntity.getId())
                .name(testEntity.getName())
                .build();
    }
}
