package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.models.AdditionalTasksInfo;
import com.hexagonal.tasks.domain.ports.in.GetAdditionalTaskInformationUseCase;
import com.hexagonal.tasks.domain.ports.out.ExternalServicePort;
import com.hexagonal.tasks.domain.ports.out.TaskRepositoryPort;

public class GetAdditionalTaskInformationUseCaseImpl implements GetAdditionalTaskInformationUseCase {
    public GetAdditionalTaskInformationUseCaseImpl(TaskRepositoryPort taskRepositoryPort, ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTasksInfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.getAdditionalTaskInfo(id);
    }
    private final ExternalServicePort externalServicePort;
}
