package com.expenseManager.ExpenseManagerAPI.repositories;

import com.expenseManager.ExpenseManagerAPI.domain.Expense;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense, String> {

    List<Expense> findByMonthAndYear(String month, int year);

    List<Expense> findByYear(int year);

    //This is added because of an error. It does not override.
    void delete(String id);
}
