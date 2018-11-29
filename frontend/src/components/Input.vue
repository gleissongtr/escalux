<template>
  <div>
    <label for="input-large">Input, computed, Alert</label>
    <div class="row">
      <b-form-group horizontal
                    :label-cols="4"
                    description="Let us know your name."
                    label="Enter your name"
      >
          <b-form-input v-model.trim="name"></b-form-input>
      </b-form-group>

      <b-alert variant="success" :show="showAlert">
        Hello {{ name }}
      </b-alert>
    </div>
    <b-row class="my-1">
      <b-col sm="2"><label for="input-small">Small:</label></b-col>
      <b-col sm="10">
        <b-form-input id="input-small" size="sm" type="text" placeholder="Enter your name"></b-form-input>
      </b-col>
    </b-row>
    <b-row class="my-1">
      <b-col sm="2"><label for="input-default">Default:</label></b-col>
      <b-col sm="10">
        <b-form-input id="input-default" type="text" placeholder="Enter your name"></b-form-input>
      </b-col>
    </b-row>
    <b-row class="my-1">
      <b-col sm="2"><label for="input-large">Large:</label></b-col>
      <b-col sm="10">
        <b-form-input id="input-large" size="lg" type="text" placeholder="Enter your name"></b-form-input>
      </b-col>
    </b-row>
  </div>
</template>

<script>
export default {
  data () {
    return {
      name: '12'
    }
  },
  computed: {
    showAlert () {
      return this.name.length > 4
    }
  }
}
</script>
