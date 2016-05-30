package com.xxshop.foundation.dao;

import com.xxshop.core.base.GenericDAO;
import com.xxshop.foundation.domain.Payment;

import org.springframework.stereotype.Repository;

@Repository("paymentDAO")
public class PaymentDAO extends GenericDAO<Payment>
{
}
