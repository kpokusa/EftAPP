package com.eftweaponmod.demo.data;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class WeaponAttachments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "attachment_id", nullable = false)
    private Long id;

    private String attach_name;

    private String attach_type;

    private Boolean modded_in_raid;

    private String ergonomics;

    private String muzzle_velocity;

    private String accuracy;

    private String size_change;

    private ArrayList<String> compatible = new ArrayList<>();

    @ManyToMany(mappedBy = "weaponAttachments")
    private List<Weapons> weapons;



    public WeaponAttachments() {
    }

    public WeaponAttachments(String attach_name, String attach_type, Boolean modded_in_raid, String ergonomics, String muzzle_velocity, String accuracy, String size_change, ArrayList<String> compatible, List<Weapons> weapons) {
        this.attach_name = attach_name;
        this.attach_type = attach_type;
        this.modded_in_raid = modded_in_raid;
        this.ergonomics = ergonomics;
        this.muzzle_velocity = muzzle_velocity;
        this.accuracy = accuracy;
        this.size_change = size_change;
        this.compatible = compatible;
        this.weapons = weapons;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttach_name() {
        return attach_name;
    }

    public void setAttach_name(String attach_name) {
        this.attach_name = attach_name;
    }

    public String getAttach_type() {
        return attach_type;
    }

    public void setAttach_type(String attach_type) {
        this.attach_type = attach_type;
    }

    public Boolean getModded_in_raid() {
        return modded_in_raid;
    }

    public void setModded_in_raid(Boolean modded_in_raid) {
        this.modded_in_raid = modded_in_raid;
    }

    public String getErgonomics() {
        return ergonomics;
    }

    public void setErgonomics(String ergonomics) {
        this.ergonomics = ergonomics;
    }

    public String getMuzzle_velocity() {
        return muzzle_velocity;
    }

    public void setMuzzle_velocity(String muzzle_velocity) {
        this.muzzle_velocity = muzzle_velocity;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public String getSize_change() {
        return size_change;
    }

    public void setSize_change(String size_change) {
        this.size_change = size_change;
    }

    public ArrayList<String> getCompatible() {
        return compatible;
    }

    public void setCompatible(ArrayList<String> compatible) {
        this.compatible = compatible;
    }

    public List<Weapons> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapons> weapons) {
        this.weapons = weapons;
    }

    @Override
    public String toString() {
        return "WeaponAttachments{" +
                "id=" + id +
                ", attach_name='" + attach_name + '\'' +
                ", attach_type='" + attach_type + '\'' +
                ", modded_in_raid=" + modded_in_raid +
                ", ergonomics='" + ergonomics + '\'' +
                ", muzzle_velocity='" + muzzle_velocity + '\'' +
                ", accuracy='" + accuracy + '\'' +
                ", size_change='" + size_change + '\'' +
                ", compatible=" + compatible +
                ", weapons=" + weapons +
                '}';
    }
}
