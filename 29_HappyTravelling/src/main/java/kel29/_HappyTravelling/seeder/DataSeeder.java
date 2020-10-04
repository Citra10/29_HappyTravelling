package kel29._HappyTravelling.seeder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import kel29._HappyTravelling.model.Jadwal;
import kel29._HappyTravelling.model.Role;
import kel29._HappyTravelling.model.User;
import kel29._HappyTravelling.repo.JadwalRepository;
import kel29._HappyTravelling.repo.RoleRepository;
import kel29._HappyTravelling.repo.UserRepository;

import java.time.LocalDate;
import java.util.Date;

@Component
public class DataSeeder {
    @Autowired
    RoleRepository roleRepo;

    @Autowired
    UserRepository userRepository;

    @Autowired
    JadwalRepository jadwalRepository;

    //Data Seeder for Jadwal


    //cek apakah field sudah terdaftar
    public void checkRoleIfExists(String roleName) {
        if (!roleRepo.existsByRoleName(roleName)) {
            Role roles = new Role();
            roles.setRoleName(roleName);
            saveRoles(roles);
        }
    }
    public void insertDefaultUser(String username){
        if(!userRepository.existsByUsername(username)){
            User user = new User("admin","admin","admin123",1);
            userRepository.save(user);
        }
    }
//    public void insertDefaultSchedule(){
//
//        jadwalRepository.save(jadwal);
//    }
    //simpan ke DB jika field belum ada
    public void saveRoles(Role roles) {
        roleRepo.save(roles);
    }
    public void saveUser(User user){
        userRepository.save(user);
    }
    //pengecekan
    @EventListener
    public void seeder(ContextRefreshedEvent contextRefreshedEvent) {
        checkRoleIfExists("Admin");
        checkRoleIfExists("User");
//        checkRoleIfExists(RoleName.ROLE_MERCHANT);
        insertDefaultUser("admin");
//        insertDefaultSchedule();
    }
}
