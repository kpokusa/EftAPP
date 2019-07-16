package com.eftweaponmod.demo.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponAttachRepo extends CrudRepository <WeaponAttachments, Long> {
}
