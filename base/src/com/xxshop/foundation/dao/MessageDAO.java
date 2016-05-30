package com.xxshop.foundation.dao;

import com.xxshop.core.base.GenericDAO;
import com.xxshop.foundation.domain.Message;

import org.springframework.stereotype.Repository;

@Repository("messageDAO")
public class MessageDAO extends GenericDAO<Message>
{
}
