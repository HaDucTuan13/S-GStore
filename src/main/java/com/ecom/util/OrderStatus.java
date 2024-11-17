package com.ecom.util;

public enum OrderStatus {

	IN_PROGRESS(1, "Đang xử lý"), ORDER_RECIVED(2, "Đơn hàng đã nhận"), PRODUCT_PACKED(3, "Đã đóng gói sản phẩm"),
	OUT_FOR_DELIVERY(4, "Đang vận chuyển"), DELIVERED(5, "Đã vận chuyển"),CANCEL(6,"Hủy");

	private Integer id;

	private String name;

	private OrderStatus(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
