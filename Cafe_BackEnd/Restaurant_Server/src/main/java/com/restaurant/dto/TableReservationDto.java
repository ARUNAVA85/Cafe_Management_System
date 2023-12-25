package com.restaurant.dto;

import com.restaurant.enums.ReservationStatus;
import lombok.Data;

import java.util.Date;

//@Data
public class TableReservationDto {

    private Long id;

    private String tableType;

    private String description;

    private Date dateTime;

    private ReservationStatus reservationStatus;

    private Long userId;

    private String username;

	public TableReservationDto(Long id, String tableType, String description, Date dateTime,
			ReservationStatus reservationStatus, Long userId, String username) {
		super();
		this.id = id;
		this.tableType = tableType;
		this.description = description;
		this.dateTime = dateTime;
		this.reservationStatus = reservationStatus;
		this.userId = userId;
		this.username = username;
	}

	public TableReservationDto() {
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
    
    

}
