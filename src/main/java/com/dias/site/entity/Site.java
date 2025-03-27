package com.dias.site.entity;

import java.util.List;
import java.util.UUID;

import com.dias.blok.entity.Blok;
import com.dias.cari.entity.Cari;
import com.dias.kisi.entity.Kisi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "siteler")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Site {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "adi", nullable = false, length = 100)
    private String adi;

    @Column(name = "sehir", nullable = false, length = 100)
    private String sehir;

    @Column(name = "ilce", nullable = false, length = 100)
    private String ilce;

    @Column(name = "adres", nullable = false, length = 255)
    private String adres;

    @Column(name = "vergi_dairesi", nullable = false, length = 100)
    private String vergiDairesi;

    @Column(name = "vergi_no", nullable = false, length = 11)
    private String vergiNo;

    @Column(name = "banka", nullable = false, length = 100)
    private String banka;

    @Column(name = "yonetici_ad", nullable = false, length = 100)
    private String yoneticiAdi;

    @Column(name = "yonetici_soyad", nullable = false, length = 100)
    private String yoneticiSoyadi;

    @Column(name = "yardimci", nullable = false, length = 100)
    private String yardimci;

    @Column(name = "denetci", nullable = false, length = 100)
    private String denetci;

    @Column(name = "sms_aktif", nullable = false)
    @Builder.Default
    private Boolean smsAktif = false;

    @Column(name = "sayac_okuma", nullable = false)
    @Builder.Default
    private Boolean sayacOkuma = false;

    @Column(name = "sms_gun", nullable = false, length = 100)
    private String smsGun;

    @Column(name = "site_notu", nullable = false, length = 255)
    private String siteNotu;

    @OneToMany(mappedBy = "site", cascade = CascadeType.ALL)
    private List<Blok> bloklar;

    @OneToMany(mappedBy = "site", cascade = CascadeType.ALL)
    private List<Kisi> kisiler;

    @OneToMany(mappedBy = "site", cascade = CascadeType.ALL)
    private List<Cari> cariler;

}
