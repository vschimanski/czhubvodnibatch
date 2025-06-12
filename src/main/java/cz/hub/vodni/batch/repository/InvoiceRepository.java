package cz.hub.vodni.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.hub.vodni.batch.model.Invoice;

public interface  InvoiceRepository extends JpaRepository<Invoice, Long> {

}

