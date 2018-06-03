package com.sorahjy.buytickets.dto;

import com.sorahjy.buytickets.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Data
public class OrderDTO {

    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Integer orderStatus ;

    private Integer payStatus ;

    private Date createTime;

    private Date updateTime;

    List<OrderDetail> orderDetailList;

}
