package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class ShowSeat extends BaseModel{
    @ManyToOne
    private Show show; // 1
    @ManyToOne
    private  Seat seat; // M
    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;
}


/*
*   1       -   1
* Showseat --- Show
*   M       -- 1
* */

/*
*
*  1         ---- 1
* ShowSeat   --- Seat
* M        ---  1 ,various screns ,shows ,movies etc...
* */