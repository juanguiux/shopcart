package com.shopcart.basket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;
@Entity
@Table(name = "basket_checkout")
public class BasketCheckout {

    @Id
    @Column(name = "request_id")
    private UUID requestId;
    @Column(name = "city")
    private String city;
    @Column(name = "street")
    private String street;
    @Column(name = "state")
    private String state;
    @Column(name = "country")
    private String country;
    @Column(name = "zip_code")
    private String zipCode;
    @Column(name = "card_number")
    private String cardNumber;
    @Column(name = "card_holder_name")
    private String cardHolderName;
    @Column(name = "card_expiration")
    private Date cardExpiration;
    @Column(name = "card_security_number")
    private String cardSecurityNumber;
    @Column(name = "card_type_id")
    private int cardTypeId;
    @Column(name = "buyer")
    private String buyer;

    public UUID getRequestId() {
        return requestId;
    }

    public void setRequestId(UUID requestId) {
        this.requestId = requestId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public Date getCardExpiration() {
        return cardExpiration;
    }

    public void setCardExpiration(Date cardExpiration) {
        this.cardExpiration = cardExpiration;
    }

    public String getCardSecurityNumber() {
        return cardSecurityNumber;
    }

    public void setCardSecurityNumber(String cardSecurityNumber) {
        this.cardSecurityNumber = cardSecurityNumber;
    }

    public int getCardTypeId() {
        return cardTypeId;
    }

    public void setCardTypeId(int cardTypeId) {
        this.cardTypeId = cardTypeId;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    @Override
    public String toString() {
        return "BasketCheckout{" +
                "requestId=" + requestId +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", cardExpiration=" + cardExpiration +
                ", cardSecurityNumber='" + cardSecurityNumber + '\'' +
                ", cardTypeId=" + cardTypeId +
                ", buyer='" + buyer + '\'' +
                '}';
    }
}
