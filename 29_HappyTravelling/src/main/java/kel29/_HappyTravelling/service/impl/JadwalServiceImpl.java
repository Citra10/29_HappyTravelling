package kel29._HappyTravelling.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kel29._HappyTravelling.model.Jadwal;
import kel29._HappyTravelling.repo.JadwalRepository;
import kel29._HappyTravelling.service.JadwalService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class JadwalServiceImpl implements JadwalService {
    @Autowired
    JadwalRepository jadwalRepository;
    @Override
    public List<Jadwal> findAll() {
        return jadwalRepository.findAll();
    }
}
