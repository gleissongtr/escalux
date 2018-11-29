<template>
  <div>
    Gasto:
    <div>ID: {{gasto.id}}</div>
    <div>DESCRIÇÃO: {{gasto.descricao}}</div>
    <div>VALOR: {{gasto.valor}}</div>
    <div>DATA: {{gasto.data}}</div>
    <b-button @click="buscar()">buscar</b-button>
    <h1>{{ msg }}</h1>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'ex01',
  data () {
    return {
      errors: [],
      gasto: {},
      msg: 'exemplo 01'
    }
  },
  methods: {
    buscar () {
      axios.get(`http://localhost:8090/gasto/`)
        .then(response => {
          // JSON responses are automatically parsed.
          this.gasto = response.data
          console.log(response.data)
        })
        .catch(e => {
          this.errors.push(e)
        })
    }
  }
}
</script>
