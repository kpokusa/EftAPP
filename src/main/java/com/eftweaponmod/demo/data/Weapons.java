package com.eftweaponmod.demo.data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "weapons")
public class Weapons {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "weapon_id", nullable = false)
    private Long id;

    private String Weapon_name;

    private String weapon_type;

    private String caliber;

    private String fire_rate;

    private String eff_distance;

    private String selectable_firetype;

    private String base_ergo;

    private String base_accu;

    private String base_range;

    private String vert_recoil;

    private String horizontal_recoil;

    private String muzzle_velocity;

    @ManyToMany
    private List<WeaponAttachments> weaponAttachments;

    public Weapons() {
    }

    public Weapons(String weapon_name, String weapon_type, String caliber, String fire_rate, String eff_distance, String selectable_firetype, String base_ergo, String base_accu, String base_range, String vert_recoil, String horizontal_recoil, String muzzle_velocity) {
        Weapon_name = weapon_name;
        this.weapon_type = weapon_type;
        this.caliber = caliber;
        this.fire_rate = fire_rate;
        this.eff_distance = eff_distance;
        this.selectable_firetype = selectable_firetype;
        this.base_ergo = base_ergo;
        this.base_accu = base_accu;
        this.base_range = base_range;
        this.vert_recoil = vert_recoil;
        this.horizontal_recoil = horizontal_recoil;
        this.muzzle_velocity = muzzle_velocity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWeapon_name() {
        return Weapon_name;
    }

    public void setWeapon_name(String weapon_name) {
        Weapon_name = weapon_name;
    }

    public String getWeapon_type() {
        return weapon_type;
    }

    public void setWeapon_type(String weapon_type) {
        this.weapon_type = weapon_type;
    }

    public String getCaliber() {
        return caliber;
    }

    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }

    public String getFire_rate() {
        return fire_rate;
    }

    public void setFire_rate(String fire_rate) {
        this.fire_rate = fire_rate;
    }

    public String getEff_distance() {
        return eff_distance;
    }

    public void setEff_distance(String eff_distance) {
        this.eff_distance = eff_distance;
    }

    public String getSelectable_firetype() {
        return selectable_firetype;
    }

    public void setSelectable_firetype(String selectable_firetype) {
        this.selectable_firetype = selectable_firetype;
    }

    public String getBase_ergo() {
        return base_ergo;
    }

    public void setBase_ergo(String base_ergo) {
        this.base_ergo = base_ergo;
    }

    public String getBase_accu() {
        return base_accu;
    }

    public void setBase_accu(String base_accu) {
        this.base_accu = base_accu;
    }

    public String getBase_range() {
        return base_range;
    }

    public void setBase_range(String base_range) {
        this.base_range = base_range;
    }

    public String getVert_recoil() {
        return vert_recoil;
    }

    public void setVert_recoil(String vert_recoil) {
        this.vert_recoil = vert_recoil;
    }

    public String getHorizontal_recoil() {
        return horizontal_recoil;
    }

    public void setHorizontal_recoil(String horizontal_recoil) {
        this.horizontal_recoil = horizontal_recoil;
    }

    public String getMuzzle_velocity() {
        return muzzle_velocity;
    }

    public void setMuzzle_velocity(String muzzle_velocity) {
        this.muzzle_velocity = muzzle_velocity;
    }

    @Override
    public String toString() {
        return "Weapons{" +
                "id=" + id +
                ", Weapon_name='" + Weapon_name + '\'' +
                ", weapon_type='" + weapon_type + '\'' +
                ", caliber='" + caliber + '\'' +
                ", fire_rate='" + fire_rate + '\'' +
                ", eff_distance='" + eff_distance + '\'' +
                ", selectable_firetype='" + selectable_firetype + '\'' +
                ", base_ergo='" + base_ergo + '\'' +
                ", base_accu='" + base_accu + '\'' +
                ", base_range='" + base_range + '\'' +
                ", vert_recoil='" + vert_recoil + '\'' +
                ", horizontal_recoil='" + horizontal_recoil + '\'' +
                ", muzzle_velocity='" + muzzle_velocity + '\'' +
                '}';
    }
}
