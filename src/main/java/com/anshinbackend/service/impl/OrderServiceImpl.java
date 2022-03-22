package com.anshinbackend.service.impl;

import com.anshinbackend.dao.*;
import com.anshinbackend.dto.Admin.AdminOrderDTO;
import com.anshinbackend.dto.Customer.OrderDTO;
import com.anshinbackend.dto.Customer.OrderDetailDTO;
import com.anshinbackend.entity.*;
import com.anshinbackend.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDAO _orderDAO;
    @Autowired
    AcountDAO _acountDAO;

    @Autowired
    OrderDetailDAO _orderDetailDAO;

    @Autowired
    ProductDetailDAO _productDetailDAO;

    @Autowired
    HistoryOrderDAO _historyOrderDAO;

    @Override
    public void newOrder(Order order, Integer idAcount) {
        order.setTimeCreate(new Date());

        Acount acount = _acountDAO.findById(idAcount).get();
        order.setAcount(acount);
        Integer orderId = _orderDAO.save(order).getId();
        order.setId(orderId);
        System.out.println(order.getListOrderDetail().get(0).getQuantity());
        order.getListOrderDetail().forEach(x->{

            DetailProduct detailProduct= _productDetailDAO.findById(x.getDetailProduct().getId()).get();

            OrderDetail detailOrder = x;

            if(detailProduct.getQuantity()<detailOrder.getQuantity()){
                try {
                    throw new Exception("Order false");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                Integer productLeft = detailProduct.getQuantity() - detailOrder.getQuantity();
                detailProduct.setQuantity(productLeft);
                _productDetailDAO.save(detailProduct);

                detailOrder.setPrice(detailProduct.getProduct().getPrice());
                detailOrder.setOrder(order);
                detailOrder.setDetailProduct(detailProduct);
                _orderDetailDAO.save(detailOrder);
            }

        });




    }

    @Override
    public void updateOrder(Order order) {

        order.getListOrderDetail().forEach(x->{

            DetailProduct detailProduct= _productDetailDAO.findById(x.getDetailProduct().getId()).get();

            OrderDetail detailOrder = x;

            if(detailProduct.getQuantity()<detailOrder.getQuantity()){
                try {
                    throw new Exception("Order false");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                Integer productLeft = detailProduct.getQuantity() - detailOrder.getQuantity();
                detailProduct.setQuantity(productLeft);
                _productDetailDAO.save(detailProduct);

                detailOrder.setPrice(detailProduct.getProduct().getPrice());
                detailOrder.setOrder(order);
                detailOrder.setDetailProduct(detailProduct);
                _orderDetailDAO.save(detailOrder);
            }

        });


    }

    @Override
    public List<AdminOrderDTO> findAllOrder() {

        List<AdminOrderDTO> list = new ArrayList<>();
         _orderDAO.findByReturnOrderIsFalseOrderByTimeCreateDesc ().forEach(x->{
             AdminOrderDTO  dto = new AdminOrderDTO() ;
             dto.setId(x.getId());
             dto.setAddress(x.getAddress());
             dto.setDetailAddress(x.getAddressDetail());
             dto.setFullName(x.getFullName());
             dto.setStatus(x.getStatus());
             dto.setIdAcount(x.getAcount().getId());
             dto.setIdStaff(x.getStaffId());
             dto.setPhoneNumber(x.getPhoneNumber());
             AtomicReference<Integer> sum = new AtomicReference<>(0);
             _orderDetailDAO.findByOrder(x).forEach(y->
             {
                 Integer quantity=0;
                 Integer price =0;
                 try {
                     quantity = y.getQuantity();
                     if(quantity==null){
                         quantity=0;
                     }
                 }catch (NullPointerException ex){
                     quantity=0;
                 }

                 try {
                     price = y.getPrice();
                     if(price==null){
                         price=0;
                     }
                 }catch (NullPointerException ex){
                     price = 0;
                 }
                 sum.set(quantity * price);
             });

             dto.setSumPrice(sum.get());
             dto.setTimeCreate(x.getTimeCreate());
             list.add(dto);

         });

         return  list;
    }

    @Override
    public List<AdminOrderDTO> findByStatus(Integer status) {
        List<AdminOrderDTO> list = new ArrayList<>();
        _orderDAO.findByStatusAndReturnOrderIsFalseOrderByTimeCreateDesc(status).forEach(x->{
            AdminOrderDTO  dto = new AdminOrderDTO() ;
            dto.setId(x.getId());
            dto.setAddress(x.getAddress());
            dto.setDetailAddress(x.getAddressDetail());
            dto.setFullName(x.getFullName());
            dto.setStatus(x.getStatus());
            dto.setIdAcount(x.getAcount().getId());
            dto.setIdStaff(x.getStaffId());
            dto.setPhoneNumber(x.getPhoneNumber());
            AtomicReference<Integer> sum = new AtomicReference<>(0);
            _orderDetailDAO.findByOrder(x).forEach(y->
            {
                Integer quantity=0;
                Integer price =0;
                try {
                    quantity = y.getQuantity();
                    if(quantity==null){
                        quantity=0;
                    }
                }catch (NullPointerException ex){
                    quantity=0;
                }

                try {
                    price = y.getPrice();
                    if(price==null){
                        price=0;
                    }
                }catch (NullPointerException ex){
                    price = 0;
                }
                sum.set(quantity * price);
            });

            dto.setSumPrice(sum.get());
            dto.setTimeCreate(x.getTimeCreate());
            list.add(dto);

        });

        return  list;
    }

    @Override
    public Order findById(Integer id) {
        return _orderDAO.findById(id).get();
    }

    @Override

    public void changeReturn(Order order, Integer orderOld, String reason) {

        Order newOrder = _orderDAO.findById(orderOld).get();
        Order oldOrder = new Order();

       List<OrderDetail> listOld =  newOrder.getListOrderDetail();
        String fullName = newOrder.getFullName();
        oldOrder.setAcount(newOrder.getAcount());
        oldOrder.setFullName(fullName);
        oldOrder.setPhoneNumber(newOrder.getPhoneNumber());
        oldOrder.setAddress(newOrder.getAddress());
        oldOrder.setAddressDetail(newOrder.getAddressDetail());
        oldOrder.setReturnOrder(true);
        oldOrder.setStatus(2);
        oldOrder.setTimeCreate(newOrder.getTimeCreate());
       listOld.forEach(x->{
           OrderDetail orderDetailOld = new OrderDetail();
           orderDetailOld.setQuantity(x.getQuantity());
           orderDetailOld.setOrder(oldOrder);
           orderDetailOld.setPrice(x.getPrice());
           orderDetailOld.setDetailProduct(x.getDetailProduct());
           _orderDetailDAO.save(orderDetailOld);
       });





        newOrder.setAddress(order.getAddress());
        newOrder.setTimeCreate(new Date());
        _orderDetailDAO.deleteAllByOrderId(orderOld);
        order.getListOrderDetail().forEach(x->{
            DetailProduct detailProduct= _productDetailDAO.findById(x.getDetailProduct().getId()).get();
            OrderDetail detailOrder = x;
            if(detailProduct.getQuantity()<detailOrder.getQuantity()){
                try {
                    throw new Exception("Order false");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                Integer productLeft = detailProduct.getQuantity() - detailOrder.getQuantity();
                detailProduct.setQuantity(productLeft);
                _productDetailDAO.save(detailProduct);
                detailOrder.setPrice(detailProduct.getProduct().getPrice());
                detailOrder.setDetailProduct(detailProduct);
                detailOrder.setOrder(newOrder);
               _orderDetailDAO.save(detailOrder);
            }
        });

        HistoryOrder historoyOrder = new HistoryOrder();
        historoyOrder.setOrder(newOrder);
        historoyOrder.setDateCreate(new Date());
        historoyOrder.setReason(reason);
        _historyOrderDAO.save(historoyOrder);




    }

    @Override
    public List<OrderDTO> findAllOrderForAcountId(Integer idAcount) {
        List<OrderDTO> list= new ArrayList<>();

        _orderDAO.findByAcountId(idAcount).forEach(x->{



            List<OrderDetailDTO>  listDetail = new ArrayList<>();
            OrderDetailDTO dto= new OrderDetailDTO();
            x.getListOrderDetail().forEach(y->{
                dto.setIdProduct(y.getDetailProduct().getId());
                dto.setNameProduct(y.getDetailProduct().getProduct().getProductName());
                dto.setQuantity(y.getQuantity());
                dto.setColorId(y.getDetailProduct().getColor().getId());
                dto.setColorName(y.getDetailProduct().getColor().getColorName());
                dto.setSizeId(y.getDetailProduct().getSize().getId());
                dto.setSizeName(y.getDetailProduct().getSize().getSize_name());
                dto.setPrice(y.getPrice());



                listDetail.add(dto);

            });
            OrderDTO orderDTO = new OrderDTO();
            orderDTO.setListOrderDetailDTO(listDetail);
            orderDTO.setOrderId(x.getId());
            orderDTO.setDress(x.getAddress());
            orderDTO.setDressDetail(x.getAddressDetail());
            orderDTO.setPhoneNumber(x.getPhoneNumber());
            orderDTO.setStatus(x.getStatus());
            orderDTO.setCreateDate(new Date());

            list.add(orderDTO);







        });
        return list;
    }


    public void updateStatus(Integer id, Integer status){
        _orderDAO.updateStatus(status, id);


    }
}
