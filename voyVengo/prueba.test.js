// PRUEBAS DEL TEST

test("caso 'voy': ", function () {
  const mensaje = saludar("voy");
  assert(mensaje === "adios");
});

test("caso 'vengo': ", function () {
  const mensaje = saludar("vengo");
  assert(mensaje === "bienvenido");
});

test("caso de cualquier otro valor: ", function () {
  const mensaje = saludar("lkjsfdlkjdsflkj");
  assert(mensaje === "no me cuentes tu vida");
});
