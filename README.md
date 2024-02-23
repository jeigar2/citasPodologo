# Citas Podologo
Prueba con javalin de un api para dar de alta citas y pacientes

El servicio se levanta en el puerto 7070
Para hacer pruebas se puede poner

## Alta de un paciente

```sh
curl -X POST -H 'Content-Type: application/json' -d '{"id":"6","nombre":"David","apellido":"Lopez","direccion":"Calle del final"}' http://localhost:7070/pacientes
```

## Listar todos los pacientes

```sh
curl -X GET -H 'Content-Type: application/json' http://localhost:7070/pacientes
```

## Listar el paciente dado de alta

```sh
curl -X GET -H 'Content-Type: application/json' http://localhost:7070/pacientes/6
```

## Listar todas las citas

```sh
curl -X GET -H 'Content-Type: application/json' http://localhost:7070/citas
```

## Dar de alta una cita con un paciente

```sh
curl -X POST -H 'Content-Type: application/json' -d '{"id":"1","paciente":{"id":"6","nombre":"David","apellido":"Lopez","direccion":"Calle del final"},"motivo":"Revisión de uña encarnada"}' http://localhost:7070/citas
```

## Dar de alta otra cita con un paciente que no existe

```sh
curl -X POST -H 'Content-Type: application/json' -d '{"id":"2","paciente":{"id":"5","nombre":"Pedro","apellido":"Perez"},"motivo":"Pie plano"}' http://localhost:7070/citas
```


