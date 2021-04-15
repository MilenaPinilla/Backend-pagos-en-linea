package com.pagos.prototipo;

import com.pagos.prototipo.model.Producto;
import com.pagos.prototipo.model.Usuario;
import com.pagos.prototipo.repository.ProductoRepository;
import com.pagos.prototipo.repository.UsuarioRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PrototipoPagosApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(PrototipoPagosApplication.class, args);
		UsuarioRepository usuarioRepository  = configurableApplicationContext.getBean(UsuarioRepository.class);
		ProductoRepository pedidoRepository  = configurableApplicationContext.getBean(ProductoRepository.class);

		Usuario nuevo = new Usuario();
		nuevo.setCedula(123);
		nuevo.setDireccion("Carrera 11 #14-18");
		usuarioRepository.save(nuevo);

		Producto nuevoProducto = new Producto();
		nuevoProducto.setNombre("Producto 1");
		nuevoProducto.setValor(10000.3);
		pedidoRepository.save(nuevoProducto);

		nuevoProducto = new Producto();
		nuevoProducto.setNombre("Producto 2");
		nuevoProducto.setValor(25000.3);
		pedidoRepository.save(nuevoProducto);

		nuevoProducto = new Producto();
		nuevoProducto.setNombre("Producto 3");
		nuevoProducto.setValor(30000.3);
		pedidoRepository.save(nuevoProducto);

	}

}
