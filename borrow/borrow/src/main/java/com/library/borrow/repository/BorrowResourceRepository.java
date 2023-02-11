package com.library.borrow.repository;

import com.library.borrow.model.BorrowResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowResourceRepository extends JpaRepository<BorrowResource, Long> {
}
