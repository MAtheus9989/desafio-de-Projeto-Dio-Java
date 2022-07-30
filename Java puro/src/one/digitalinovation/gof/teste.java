package one.digitalinovation.gof;

import Facade.Facade;
import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;
import Strattegy.Comportamento;
import Strattegy.ComportamentoNormal;
import Strattegy.ComportamnetoAgressivo;
import Strattegy.ComportamnetoDefensivo;
import Strattegy.Robo;

public class teste {
	
	public static void main(String[] args) {
		//  Singleton:
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
			System.out.println(lazy);
			lazy = SingletonLazy.getInstancia();
			System.out.println(lazy);
		
			
			SingletonEager eager = SingletonEager.getInstancia();
			System.out.println(eager);
			eager = SingletonEager.getInstancia();
			System.out.println(eager);
			
			SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
			System.out.println(lazyHolder);
			lazyHolder = SingletonLazyHolder.getInstancia();
			System.out.println(lazyHolder);
			
			// Strattegy
			
			Comportamento normal = new ComportamentoNormal();
			Comportamento defensivo = new ComportamnetoDefensivo();
			Comportamento agressivo = new ComportamnetoAgressivo();
			
			Robo robo = new Robo();
			robo.setComportamento(normal);
			robo.mover();
			robo.mover();
			robo.setComportamento(defensivo);
			robo.mover();
			robo.setComportamento(agressivo);
			robo.mover();
			robo.mover();
			robo.mover();
			robo.mover();
			
			// Facade
			
			Facade facade = new Facade();
			facade.migraCliente("Cleiton", "05171000");
	}
}
