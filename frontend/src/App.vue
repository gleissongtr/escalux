<template>
  <div id="app">
    <b-container>
      <b-jumbotron header="Bootstrap Vue"
                    lead="Bootstrap 4 Components for Vue.js 2"
      >
        <img src="./assets/bloco.png" width="200">
        <p>For more information visit our website</p>
        <b-btn variant="primary" href="https://bootstrap-vue.js.org/">More Info</b-btn>
      </b-jumbotron>
      <router-view/>
    </b-container>
  </div>
</template>

<script>
/* eslint-disable */
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
