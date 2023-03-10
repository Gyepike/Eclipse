package com.anti.bo;

import java.sql.SQLException;

import com.anti.bo.exception.BOException;
import com.anti.dao.OrderDAO;
import com.anti.dto.Order;
import com.sun.javadoc.ThrowsTag;

public class OrderBOImpl implements OrderBO {

	
	private OrderDAO dao; // spring dependecy injection interface it must be mock !!!
	
	@Override
	public boolean placeOrder(Order order) throws BOException {
		try {
			int result = dao.create(order);
			
			if(result == 0) {
				return false;
			}
		} catch (SQLException e) {
			throw new BOException(e);
		}
		return true;
	}

	@Override
	public boolean cancelOrder(int id) throws BOException {
		try {
			Order order = dao.read(id);
			
			order.setStatus("Cancelled");
			int result = dao.update(order);
			
			if(result == 0) {
				return false;
			}
		} catch (SQLException e) {
			throw new BOException(e);
		}
		return true;
	}

	@Override
	public boolean deleteOrder(int id) throws BOException {
		try {
			int result = dao.delete(id);
			
			if(result == 0) {
				return false;
			}
			
		} catch (SQLException e) {
			throw new BOException(e);
		}
		
		return true;
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
