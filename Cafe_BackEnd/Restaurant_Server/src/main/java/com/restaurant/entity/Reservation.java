package com.restaurant.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.restaurant.dto.TableReservationDto;
import com.restaurant.enums.ReservationStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;

@Entity
//@Data
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tableType;

    private String description;

    private Date dateTime;

    private ReservationStatus reservationStatus;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private User user;

    public TableReservationDto getTableReservationDto() {
        TableReservationDto tableReservationDto = new TableReservationDto();
        tableReservationDto.setId(id);
        tableReservationDto.setTableType(tableType);
        tableReservationDto.setDescription(description);
        tableReservationDto.setDateTime(dateTime);
        tableReservationDto.setReservationStatus(reservationStatus);
        tableReservationDto.setUserId(user.getId());
        tableReservationDto.setUsername(user.getName());
        return tableReservationDto;
    }

	public Reservation(Long id, String tableType, String description, Date dateTime,
			ReservationStatus reservationStatus, User user) {
		super();
		this.id = id;
		this.tableType = tableType;
		this.description = description;
		this.dateTime = dateTime;
		this.reservationStatus = reservationStatus;
		this.user = user;
	}

	public Reservation() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTableType() {
		return tableType;
	}

	public void setTableType(String tableType) {
		this.tableType = tableType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public ReservationStatus getReservationStatus() {
		return reservationStatus;
	}

	public void setReservationStatus(ReservationStatus reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
    

}
