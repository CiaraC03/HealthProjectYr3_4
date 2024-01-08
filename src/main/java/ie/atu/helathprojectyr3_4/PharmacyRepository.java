package ie.atu.helathprojectyr3_4;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {
    Pharmacy findByPatientId(String patientId);
}
