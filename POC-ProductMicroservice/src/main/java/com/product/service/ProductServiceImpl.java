package com.product.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.JsonSyntaxException;
import com.product.domain.Orderdetail;
import com.product.domain.Product;
import com.product.domain.PurchasedHistory;
import com.product.domain.Shippinginformation;
import com.product.dto.order.OrderRequest;
import com.product.dto.order.PlacedOrderResponse;
import com.product.dto.order.Productdetails;
import com.product.dto.order.RequestInfo;
import com.product.enums.ShippingStatus;

@Service
public class ProductServiceImpl extends ProductService {
	@Autowired ModelMapper mapper;
	
	public Object save(Object product){
		return repository.save( product);
	}
	
	public List<Product> getAllProducts() {
		return repository.getAllProducts();
	}
	
	public Object getProduct(Long id) {
		return repository.getProduct(id);
	}
	
	public Product updateProduct(Product updated) {
		repository.updateProduct(updated);
		return updated;
	}
	
	public Orderdetail createOrder(OrderRequest request, String consumer) {
		Double total=0d;
		
		for(RequestInfo item : request.getItemDetails()) {
			Product fullDetails = (Product) getProduct(item.getProductId());
			fullDetails.setBooked(fullDetails.getBooked()-item.getQuantity());
			fullDetails.setStocks(fullDetails.getStocks()-item.getQuantity());
			//products that are available are considered as not yet booked
			fullDetails.setAvailable(fullDetails.getStocks()-fullDetails.getBooked());
			fullDetails.setCheckedout(fullDetails.getCheckedout()+item.getQuantity());
			updateProduct(fullDetails);
			total+=(fullDetails.getPrice()*item.getQuantity());
		}

		Orderdetail order= new Orderdetail();
		Shippinginformation shipping = new Shippinginformation();
		
		shipping.setCourier(request.getShippingCourier());
		shipping.setTrackingNumber(generateTracking(10));
		shipping.setStatus(ShippingStatus.TOSHIP);
		LocalDateTime now = LocalDateTime.now().plusDays(3);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		shipping.setEta(now.format(formatter));
		
		order.setConsumer(consumer);
		order.setTotal(total);
		order.setShippinginfo(shipping);
		
		return (Orderdetail) repository.save(order);
	}
	
	
	
	@SuppressWarnings("unchecked")
	public Object getAllOrders(String loggedInUser) throws JsonSyntaxException {
		//stores the list of orders
		List<PlacedOrderResponse> response = new ArrayList<>();
		
		List<Orderdetail> orders = (List<Orderdetail>) repository.getAllOrders(loggedInUser);
		
		for(Orderdetail order : orders) {
			PlacedOrderResponse por = mapper.map(order, PlacedOrderResponse.class);
			
			List<PurchasedHistory> listOfPurchasedItems = (List<PurchasedHistory>)repository.getAllPurchasedItems(order);
			
			for(PurchasedHistory purchased : listOfPurchasedItems) {
				if(por.getItems()==null)
					por.setItems(new ArrayList<>());
				
				por.getItems().add(
						mapper.map(getProduct(purchased.getProduct().getProductId()), Productdetails.class)
						);
			}
			response.add(por);
		}
		return response;
	}

}