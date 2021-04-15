package com.pagos.prototipo.servicio;

import com.pagos.prototipo.model.Pedido;
import com.pagos.prototipo.model.Producto;
import com.pagos.prototipo.model.RelacionProPe;
import com.pagos.prototipo.model.Usuario;
import com.pagos.prototipo.repository.PedidoRepository;
import com.pagos.prototipo.repository.RelacioProPeRepository;
import com.pagos.prototipo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PagoServices {
    @Autowired
    PedidoRepository pedidoRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    RelacioProPeRepository relacioProPeRepository;

    public Pedido generarPedido(List<Producto> relacion, Usuario usuario){
        usuario.setCedula(123);

       // Double total = calcularTotal(pedido);
        /*if (total < 70000)
            producto.setTotal(total);

        if (total >= 70000 && total <= 100000)
            producto.setTotal(total + (total * 0.19) + 5000);

        if (total > 100000)
            producto.setTotal(total + (total * 0.19));
*/
        Pedido nuevo = new Pedido();
        nuevo.setCliente(usuario);
        nuevo.setFecha_creacion(new Date());
        Pedido retorno = pedidoRepository.save(nuevo);

        for(Producto producto: relacion){
            RelacionProPe rel = new RelacionProPe();
            rel.setPedido(retorno);
            rel.setProducto(producto);
            relacioProPeRepository.save(rel);
        }
        //nuevo.setRelacionProPes(relacion);
        return retorno;

    }

    public Double calcularTotal(Pedido pedido){
        Double total = 0.0;
        return total;
    }
}
