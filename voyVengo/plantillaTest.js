// AQUI VA LA FUNCION DE TEST
// QUE ES COMO UNA PLANTILLA QUE PUEDES USAR EN OTROS PROGRAMAS

function test(descripcion, funcionBis){
    try{
        funcionBis();
        console.log("OK! " + descripcion);
    }catch(error){
        console.error("ERROR! " + descripcion);
        console.log(error);
    }
}

function assert(isTrue){
    if(!isTrue){
        throw new Error();
    }
}