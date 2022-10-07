// AQUI SE EJECUTAN ALGUNAS PRUEBAS DE LA FUNCION DE TEST
// SIRVE PARA COMPARAR EN LA PRACTICA LOS RESULTADOS EXPERADOS CON LOS OBTENIDOS
// LA FUNCION 'TEST()' ESTA RESERVADA PARA TESTS
// IGUAL QUE A FUNCION 'IT()', QUE ES LO MISMO

test("CASO 1: 2,2 ", function(){
    let mensaje = calcular(2,2);
    assert(mensaje===4);
})


test("CASO 2: 10,5 ", function(){
    let mensaje = calcular(10,5);
    assert(mensaje===15);
})