package random.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import random.model.CoinService;
import random.model.DiceService;
import random.model.RandomService;

public class RandomMain {
	public static void main(String [] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext01.xml");
		
		DiceService d1 = (DiceService) context.getBean("DiceServiceBean");
		System.out.println("1");
		System.out.println("diceBean: " + d1.getStringValue());
		System.out.println("diceBean: " + d1.getStringValue());
		System.out.println("diceBean: " + d1.getStringValue());
		System.out.println("diceBean: " + d1.getStringValue());
		System.out.println("diceBean: " + d1.getStringValue());
		System.out.println("diceBean: " + d1.getStringValue());
		System.out.println("diceBean: " + d1.getStringValue());
		System.out.println("diceBean: " + d1.getStringValue());
		System.out.println("----------------------------------");
		
		CoinService cs1 = (CoinService) context.getBean("CoinBeanConstruct");
		System.out.println("2");
		System.out.println("fairCoinBean: " + cs1.getStringValue());
		System.out.println("fairCoinBean: " + cs1.getStringValue());
		System.out.println("fairCoinBean: " + cs1.getStringValue());
		System.out.println("fairCoinBean: " + cs1.getStringValue());
		System.out.println("fairCoinBean: " + cs1.getStringValue());
		System.out.println("fairCoinBean: " + cs1.getStringValue());
		System.out.println("fairCoinBean: " + cs1.getStringValue());
		System.out.println("fairCoinBean: " + cs1.getStringValue());
		System.out.println("fairCoinBean: " + cs1.getStringValue());
		System.out.println("----------------------------------");
		
		CoinService cs2 = (CoinService) context.getBean("CoinBeanSetter");
		System.out.println("3");
		System.out.println("biasCoinBean: " + cs2.getStringValue());
		System.out.println("biasCoinBean: " + cs2.getStringValue());
		System.out.println("biasCoinBean: " + cs2.getStringValue());
		System.out.println("biasCoinBean: " + cs2.getStringValue());
		System.out.println("biasCoinBean: " + cs2.getStringValue());
		System.out.println("biasCoinBean: " + cs2.getStringValue());
		System.out.println("biasCoinBean: " + cs2.getStringValue());
		System.out.println("biasCoinBean: " + cs2.getStringValue());
		System.out.println("----------------------------------");
		
		CoinService cs3 = (CoinService) context.getBean("propertyCoinBean");
		System.out.println("4");
		System.out.println("propertyCoinBean: " + cs3.getStringValue());
		System.out.println("propertyCoinBean: " + cs3.getStringValue());
		System.out.println("propertyCoinBean: " + cs3.getStringValue());
		System.out.println("propertyCoinBean: " + cs3.getStringValue());
		System.out.println("propertyCoinBean: " + cs3.getStringValue());
		System.out.println("propertyCoinBean: " + cs3.getStringValue());
		System.out.println("propertyCoinBean: " + cs3.getStringValue());
		System.out.println("propertyCoinBean: " + cs3.getStringValue());
		System.out.println("propertyCoinBean: " + cs3.getStringValue());
		
		System.out.println("----------------------------------");
		
		context.close();
	}
}

/*
 * 1. diceBean - IoC
 * 2. fairCoinBean - DI constructor injection 0.5
 * 3. biasCoinBean - DI setter injection 0.1
 * 4. propertyCoinBean - DI setter injection read from property file
 * 
 * - random01 - xml configuration: 1-4
 * - random03 - java class with component scanning: 1 and one of 2,3,4 
 */