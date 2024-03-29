package com.quickbudget.repository;

import com.quickbudget.domain.Budget;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BudgetRepository extends CrudRepository<Budget, Long> {
    @Override
    List<Budget> findAll();

    @Override
    Optional<Budget> findById(Long id);

    @Override
    Budget save(Budget budget);

    @Override
    void deleteById(Long aLong);
}
