
/*
 * This file is part of the Soapbox Race World core source code.
 * If you use any of this code for third-party purposes, please provide attribution.
 * Copyright (c) 2020.
 */

package com.soapboxrace.jaxb.http;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommerceResultTrans complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CommerceResultTrans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommerceItems" type="{}ArrayOfCommerceItemTrans" minOccurs="0"/>
 *         &lt;element name="InvalidBasket" type="{}InvalidBasketTrans" minOccurs="0"/>
 *         &lt;element name="InventoryItems" type="{}ArrayOfInventoryItemTrans" minOccurs="0"/>
 *         &lt;element name="PurchasedCars" type="{}ArrayOfOwnedCarTrans" minOccurs="0"/>
 *         &lt;element name="Status" type="{}CommerceResultStatus"/>
 *         &lt;element name="Wallets" type="{}ArrayOfWalletTrans" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommerceResultTrans")
public class CommerceResultTrans extends GenericCommerceResult {

}
