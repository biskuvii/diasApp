package com.dias.blok.entity;

import java.util.UUID;

import com.dias.site.entity.Site;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bloklar")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Blok {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "adi", nullable = false, length = 100)
    private String adi;

    @Column(name = "toplam_metrekare", nullable = false)
    private Double toplamMetrekare;

    @Column(name = "mesken_sayisi", nullable = false)
    private Integer meskenSayisi;

    @ManyToOne
    @JoinColumn(name = "site_id", nullable = false)
    private Site site;
}
