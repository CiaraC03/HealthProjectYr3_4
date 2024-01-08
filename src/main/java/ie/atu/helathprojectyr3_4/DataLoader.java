package ie.atu.helathprojectyr3_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DataLoader implements CommandLineRunner {
    private final PharmacyRepository pharmacyRepository;

    @Autowired
    public DataLoader(PharmacyRepository pharmacyRepository) {
        this.pharmacyRepository = pharmacyRepository;
    }

    @Override
    public void run(String... args) throws Exception
    {
        Pharmacy testdata = new Pharmacy(1L, "12345", "", "", "");
        Pharmacy testdata2 = new Pharmacy(1L, "12345", "", "", "");
        Pharmacy testdata3 = new Pharmacy(1L, "12345", "", "", "");
    }
}
