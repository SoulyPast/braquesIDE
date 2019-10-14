<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Branques</title>
    <script>
        var start = new Date().getTime();
        var num=7;
        var cantidadNumeros = 1000000;
>>>>>>> temps
        var myArray = [];
        while(myArray.length < cantidadNumeros ){
            var numeroAleatorio = Math.ceil(Math.random()*cantidadNumeros);
            var existe = false;
            for(var i=0;i<myArray.length;i++){
                if(myArray [i] == numeroAleatorio){
                    existe = true;
                    break;
                }
            }
            if(!existe){
                myArray[myArray.length] = numeroAleatorio;
            }
        }
        for(var i=0;i<myArray.length;i++){
            if(num==myArray[i]){
                var end = new Date().getTime();
                document.write(end-start+" ms");
            }
        }
    </script>
</head>
<body>
<div id="number"></div>
</body>
</html>