package com.eftweaponmod.demo.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WeaponsRepo extends CrudRepository <Weapons, Long> {
}
