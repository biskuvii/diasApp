package com.dias.cari.entity;

import java.util.UUID;

import com.dias.site.entity.Site;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cariler")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cari {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
    @Column(name = "unvan", nullable = false, length = 100)
    private String unvan;
    
    @Column(name = "ilgili_kisi", nullable = false, length = 100)
    private String ilgiliKisi;
    
    @Column(name = "adres", nullable = false, length = 255)
    private String adres;
    
    @Column(name = "telefon", nullable = false, length = 15)
    private String telefon;
    
    @Column(name = "eposta", nullable = false, unique = true, length = 100)
    private String eposta;
    
    @Column(name = "vergi_dairesi", nullable = false, length = 100)
    private String vergiDairesi;
    
    @Column(name = "vergi_no", nullable = false, length = 11)
    private String vergiNo;
    
    @Column(name = "iban", nullable = false, unique = true, length = 34)
    private String iban;

    @ManyToOne
    @JoinColumn(name = "site_id", nullable = false)
    private Site site;
}
