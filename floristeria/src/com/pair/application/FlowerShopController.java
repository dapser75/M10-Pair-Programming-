package com.pair.application;

import java.util.List;

import javax.swing.JOptionPane;

import com.pair.domain.FlowerShop;
import com.pair.persistence.FlowerShopRepository;


public class FlowerShopController {

	private FlowerShopRepository flowershoprepository = new FlowerShopRepository();

	public FlowerShopRepository repository; 	
	
	public FlowerShopController(FlowerShopRepository repository){  // constructor
		
		this.repository = repository;
		
	}
	
	public FlowerShopController() {
		// TODO Auto-generated constructor stub
	}

	//Métode per donar d'alta una nova floristeria
	public void NewFlowerShop () {
		String flowershopname="";
		boolean existsflowershop=false;
		
//		do {
			flowershopname=InputFlowerShopName(); //Llamada al metode per introduir el nom de la floristeria
			if (flowershopname != "") {
				existsflowershop = checkFlowerShopName(flowershopname);
				
				if (!existsflowershop)  FlowerFhopCreated(flowershopname);
				else JOptionPane.showMessageDialog(null, "Floristeria existent !!!", "Alerta", JOptionPane.ERROR_MESSAGE);
					
			
			}
			else {
				JOptionPane.showMessageDialog(null, "Operació cancel·lada", "Alerta", JOptionPane.ERROR_MESSAGE);
				
			}
			
//		}while(existsflowershop);//Cheaquear si el nombre ya existe
		
		

	}//end metode



	//Métode per afegir al una floristeria al repository
	private void FlowerFhopCreated(String flowershopname) {
		try {
			FlowerShop flowershop = new FlowerShop (flowershopname);
			flowershoprepository.add(flowershop);

		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Operació cancel·lada, no s'ha pogut crear la floristeria", "Alerta", JOptionPane.ERROR_MESSAGE);

		}
		
	}

	//Métode per chequear si una floristeria ja està creada
	private boolean checkFlowerShopName(String flowershopname) {
		List<FlowerShop> flowershoprepository = FlowerShopRepository.getAllFlowerShops(); //Chequear el casting
		boolean checkflowershopname=false;
		
		if (flowershoprepository.size()>0) {
			for (FlowerShop l : flowershoprepository) {
				if (l.getName().equals(flowershopname)){
					checkflowershopname=true;
					break;
				}
				
			}//end for
		}
		return checkflowershopname;
	
	}
	
	//Métode per entrar el non de la floristeria Cambiar a  entrada en modo gráfico
	private String InputFlowerShopName() {
		String flowershopname="";
		do {
			flowershopname=	JOptionPane.showInputDialog(null,"Introdueix el nom de la floristeria:","ENTRADA",JOptionPane.QUESTION_MESSAGE);	
			if (flowershopname != null)  flowershopname=flowershopname.trim().toUpperCase();
			else {
				flowershopname="";
				break;
			}
		}while(flowershopname.isBlank() || flowershopname.isEmpty()); //Chequear que se introdueixi algun caracter

		return flowershopname;
	}
		
		
}