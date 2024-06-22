package com.example.GPECapp.repository;

import com.example.GPECapp.model.RegDHN;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface RegRepository extends JpaRepository<RegDHN, Long> {

    @Query(value = "SELECT * from regdhn where ((tZasCO -tZasZadanaAkt) > 5 ) and dataOdczytuReg between ?1 and ?2",
            nativeQuery = true)
   List<RegDHN> findByDataOdczytuRegBetween(LocalDateTime dataStart, LocalDateTime dataStop);

    @Query(value = "SELECT MAX(dataOdczytuReg) from regdhn where (tZasCO -tZasZadanaAkt) > 5" +
            "and dataOdczytuReg between ?1 and ?2",
            nativeQuery = true)
    List<RegDHN> findLatestDataOdczytuReg(LocalDateTime dataStart, LocalDateTime dataStop);



    RegDHN findByIdAutoReg(Long idAutoReg);


//    @Query("SELECT dataOdczytuReg FROM regdhn WHERE regdhn.dataOdczytuReg BETWEEN :dataStart AND :dataStop AND (regdhn.tZasCO - regdhn.tZasZadanaAkt) > 5")
//    List<RegDHN> findAlarmsCO(@Param("dataStart") LocalDateTime dataStart, @Param("dataStop") LocalDateTime dataStop);

//    @Query(value = "SELECT dataOdczytuReg from regdhn where dataOdczytuReg between dataStart and dataStop and ((tZasCO -tZasZadanaAkt) > 5 )")
//          List<RegDHN> findAlarmsCO(LocalDateTime dataStart, LocalDateTime dataStop);

//

}
//    List<RegDHN>findByDataOdczytuRegIsBetweenAndTzasCOGreaterThanAndTZasZadanaAkt(LocalDateTime dataStart, LocalDateTime dataStop,int 5);
