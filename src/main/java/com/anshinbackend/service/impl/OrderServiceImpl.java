package com.anshinbackend.service.impl;

import com.anshinbackend.dao.*;
import com.anshinbackend.dto.Admin.AdminOrderDTO;
import com.anshinbackend.dto.Admin.OrderDetailForCreateOrderDTO;
import com.anshinbackend.dto.Customer.OrderDTO;
import com.anshinbackend.dto.Customer.OrderDetailDTO;
import com.anshinbackend.entity.*;
import com.anshinbackend.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
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
                 sum.set(sum.get()+  quantity * price);;
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

    @Override
    public List<com.anshinbackend.dto.OrderTableForAdmin.OrderDetailDTO> findByOrderId(Integer orderId) {

        List<com.anshinbackend.dto.OrderTableForAdmin.OrderDetailDTO> list = new ArrayList<>();
        _orderDetailDAO.findByOrderDetailId(orderId).forEach(x->{
            com.anshinbackend.dto.OrderTableForAdmin.OrderDetailDTO dto =
                    new com.anshinbackend.dto.OrderTableForAdmin.OrderDetailDTO();
            dto.setIdOrderDetail(x.getId());
            dto.setSizeName(x.getDetailProduct().getSize().getSize_name());
            dto.setColoName(x.getDetailProduct().getColor().getColorName());
            dto.setPrice(x.getPrice());
            dto.setQuantity(x.getQuantity());
            dto.setNameProduct(x.getDetailProduct().getProduct().getProductName());
            list.add(dto);
        });
        return list;
    }

    @Override
    public void updateQuantity(Integer idOrderDetail, Integer quantity) {
        OrderDetail orderDetail = _orderDetailDAO.findById(idOrderDetail).get();
        DetailProduct detailProduct = _productDetailDAO.findById(orderDetail.getDetailProduct().getId()).get();
        orderDetail.setPrice(detailProduct.getProduct().getPrice());
        orderDetail.setQuantity(quantity);
        _orderDetailDAO.save(orderDetail);

    }

    @Override
    public void deleteOrderDetail(Integer idOrderDetailId) {
        _orderDetailDAO.deleteById2(idOrderDetailId);

    }

    @Override
    public List<AdminOrderDTO> findOrderForAdminCreate() {
        List<AdminOrderDTO> list = new ArrayList<>();
        _orderDAO.findByStatusAndReturnOrderIsFalseOrderByTimeCreateDesc(7).forEach(x->{
            AdminOrderDTO  dto = new AdminOrderDTO() ;
            dto.setId(x.getId());
            dto.setAddress(x.getAddress());
            dto.setDetailAddress(x.getAddressDetail());
            dto.setFullName(x.getFullName());
            dto.setStatus(x.getStatus());
            dto.setIdAcount(x.getAcount().getId());
            dto.setIdStaff(x.getStaffId());
            dto.setPhoneNumber(x.getPhoneNumber());


            List<OrderDetailForCreateOrderDTO>  newList= new ArrayList<>();

           // OrderDetailForCreateOrderDTO detail = new OrderDetailForCreateOrderDTO("sdf",x.getListOrderDetail());
            x.getListOrderDetail().forEach(detail->{
                newList.add(new OrderDetailForCreateOrderDTO(detail.getDetailProduct().getProduct().getProductName(),detail.getDetailProduct().getProduct().getPrice(), detail));
            });

            dto.setListOrderDetail(newList);
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
                sum.set(sum.get()+  quantity * price);
            });

            dto.setSumPrice(sum.get());
            dto.setTimeCreate(x.getTimeCreate());
            list.add(dto);

        });

        return  list;
    }

    @Override
    public OrderDetailForCreateOrderDTO insertOrderDetail(Integer idOrder, Integer idProductDetail, Integer quantity) {

        DetailProduct productDetail = _productDetailDAO.findById(idProductDetail).get();
        Integer price = productDetail.getProduct().getPrice();
        Order order = _orderDAO.findById(idOrder).get();


        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailProduct(productDetail);
        orderDetail.setOrder(order);
        orderDetail.setPrice(price);
        orderDetail.setQuantity(quantity);

        OrderDetailForCreateOrderDTO dto = new OrderDetailForCreateOrderDTO();
        dto.setProductName(productDetail.getProduct().getProductName());
        dto.setPrice(productDetail.getProduct().getPrice());
        dto.setOrderDetail(_orderDetailDAO.save(orderDetail));

        return dto;

    }

    @Override
    public AdminOrderDTO findOrderForId(Integer id) {
        Order x = _orderDAO.findById(id).get();
        AdminOrderDTO  dto = new AdminOrderDTO() ;
        dto.setId(x.getId());
        dto.setAddress(x.getAddress());
        dto.setDetailAddress(x.getAddressDetail());
        dto.setFullName(x.getFullName());
        dto.setStatus(x.getStatus());
        dto.setIdAcount(x.getAcount().getId());
        dto.setIdStaff(x.getStaffId());
        dto.setPhoneNumber(x.getPhoneNumber());
        dto.setTimeCreate(x.getTimeCreate());


        List<OrderDetailForCreateOrderDTO>  newList= new ArrayList<>();

        // OrderDetailForCreateOrderDTO detail = new OrderDetailForCreateOrderDTO("sdf",x.getListOrderDetail());
        x.getListOrderDetail().forEach(detail->{
            newList.add(new OrderDetailForCreateOrderDTO(detail.getDetailProduct().getProduct().getProductName(),detail.getDetailProduct().getProduct().getPrice(), detail));
        });

        dto.setListOrderDetail(newList);
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
            sum.set(sum.get()+  quantity * price);
        });

        dto.setSumPrice(sum.get());
        dto.setTimeCreate(x.getTimeCreate());
       return  dto;
    }

    @Override
    public void updateInfomatinCustomer(Integer idOrder, String name, String address, String phoneNumber) {
        _orderDAO.setInformatinCustomer(name, address, phoneNumber, idOrder);
    }

    @Override
    public AdminOrderDTO createNewOrderForAdmin(String name) {
        Order order = new Order();
        order.setFullName(name);
        order.setPhoneNumber("");
        order.setAddressDetail("");
        order.setAddress("");
        order.setTimeCreate(new Date());
        order.setReturnOrder(false);
        order.setDeliveryCost("0");
        order.setStatus(7);
        order.setStaffId(5);
        order.setAcount(_acountDAO.findById(5).get());


        Order x =  _orderDAO.save(order);

        AdminOrderDTO  dto = new AdminOrderDTO() ;
        dto.setId(x.getId());
        dto.setAddress(x.getAddress());
        dto.setDetailAddress(x.getAddressDetail());
        dto.setFullName(x.getFullName());
        dto.setStatus(x.getStatus());
        dto.setIdAcount(x.getAcount().getId());
        dto.setIdStaff(x.getStaffId());
        dto.setPhoneNumber(x.getPhoneNumber());
        dto.setTimeCreate(order.getTimeCreate());





        return dto;
    }

    @Override
    public void deleteOrderTransaction(Integer id) {
        Order order =  _orderDAO.findById(id).get();
        _orderDetailDAO.deleteAll(order.getListOrderDetail());
        _orderDAO.delete(order);

    }


}
