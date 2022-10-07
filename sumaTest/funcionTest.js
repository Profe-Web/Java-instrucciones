// AQUI VA LA FUNCION DE TEST
// QUE ES COMO UNA PLANTILLA QUE PUEDES USAR EN OTROS PROGRAMAS

function test(descripcion, funcion){
    try{
        funcion();
        console.log("OK! " + descripcion);
    }catch{
        console.error("ERROR! " + descripcion);
        console.warn("esto no pita! ");
    }
}

function assert(isTrue){
    if(!isTrue){
        throw "algo ha fallado!"
    }
}