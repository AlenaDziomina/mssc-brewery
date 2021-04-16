package guru.springframework.msscbrewery.web.domain;

import guru.springframework.msscbrewery.web.model.v2.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;
//    @CreationTimestamp
//    @Column(updatable = false)
    private Timestamp createdDate;
//    @UpdateTimestamp
    private Timestamp lastModifiedDate;

}

