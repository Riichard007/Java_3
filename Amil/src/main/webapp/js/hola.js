//alert("Viendo si se carga mi archivo");


$(document).ready(function () {
    $("#Boton-hola").click(function () {
        /*
         * Vamos a enviar el dato del nombre a nuestro servlet hola
         * y esperar la respuesta del servlet
         */
        $.ajax({
            url: 'hola',
            method: 'POST',
            data: {
                nombre: $("#nombre").val()
            },
            success: function (data) {
                $("#respuesta").html(data);
            },
            failure: function () {

            }
        });
    });
});