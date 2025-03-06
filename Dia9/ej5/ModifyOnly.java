package ej5;

// Interfaz solo para la clase de modificación
public interface ModifyOnly {
    void Insert(Object entity);
    void Update(Object id, Object entity);
    void Delete(Object id);
}
