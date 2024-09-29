package pe.edu.cibertec.app_rest_security.service;

import pe.edu.cibertec.app_rest_security.model.Usuario;

public interface IUsuarioService {

    Usuario obtenerUsuarioXnombre(String nomUsuario);
}
