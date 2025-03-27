package com.dias.kisi.entity;

import java.util.UUID;

import com.dias.site.entity.Site;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "kisiler")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Kisi {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "tc_no", nullable = false, unique = true, length = 11)
    private String tcNo;

    @Column(name = "ad", nullable = false, length = 50)
    private String ad;

    @Column(name = "soyad", nullable = false, length = 50)
    private String soyad;

    @Column(name = "telefon", nullable = false, length = 15)
    private String telefon;

    @Column(name = "is_telefon", nullable = true, length = 15)
    private String isTelefon;

    @Column(name = "eposta", nullable = true, unique = true, length = 100)
    private String eposta;

    @Column(name = "iban", nullable = true, unique = true, length = 34)
    private String iban;

    @ManyToOne
    @JoinColumn(name = "site_id", nullable = false)
    private Site site;
}
