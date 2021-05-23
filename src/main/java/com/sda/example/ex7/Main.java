package com.sda.example.ex7;

public class Main {
    public static void main(String[] args) throws Exception {
        WeaponMagazine weaponMagazine = new WeaponMagazine(3);

        weaponMagazine.loadBullet("bullet1");
        weaponMagazine.loadBullet("bullet2");
        weaponMagazine.loadBullet("bullet3");
        //weaponMagazine.loadBullet("bullet4");

        System.out.println(weaponMagazine.isLoaded());

        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.loadBullet("new bullet");
        weaponMagazine.shot();
        System.out.println(weaponMagazine.isLoaded());
        weaponMagazine.shot();
        weaponMagazine.shot();
    }
}
